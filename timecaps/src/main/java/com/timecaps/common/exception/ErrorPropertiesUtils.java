package com.timecaps.common.exception;

import com.timecaps.common.core.Constants;
import com.timecaps.common.core.ClassHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

/**
 * Created by yuanqiang on 2018/3/1.
 */


public class ErrorPropertiesUtils {
    private static Logger logger = LoggerFactory.getLogger(ErrorPropertiesUtils.class);

    private static volatile Properties PROPERTIES;

    public static Properties getProperties() {
        if (PROPERTIES == null) {
            synchronized (ErrorPropertiesUtils.class) {
                if (PROPERTIES == null) {
                    PROPERTIES = loadProperties(Constants.ERROR_PROPERTIES, false, true);
                }
            }
        }

        return PROPERTIES;
    }

    public static String getProperty(String key) {
        return getProperties().getProperty(key, null);
    }

    public static String getProperty(String key, String defaultValue) {
        return getProperties().getProperty(key, defaultValue);
    }

    /**
     * Load properties file to {@link Properties} from class path.
     *
     * @param fileName
     *            properties file name. for example:
     *            <code>dubbo.properties</code>,
     *            <code>METE-INF/conf/foo.properties</code>
     * @param allowMultiFile
     *            if <code>false</code>, throw {@link IllegalStateException}
     *            when found multi file on the class path.
     * @return loaded {@link Properties} content.
     *         <ul>
     *         <li>return empty Properties if no file found.
     *         <li>merge multi properties file if found multi file
     *         </ul>
     * @throws IllegalStateException
     *             not allow multi-file, but multi-file exsit on class path.
     */
    public static Properties loadProperties(String fileName, boolean allowMultiFile, boolean allowEmptyFile) {
        Properties properties = new Properties();
        if (fileName.startsWith("/")) {
            try {
                FileInputStream input = new FileInputStream(fileName);
                InputStreamReader reader = new InputStreamReader(input, "UTF-8");
                try {
                    properties.load(reader);
                } finally {
                    reader.close();
                    input.close();
                }
            } catch (Exception e) {
                logger.warn(
                        "Failed to load " + fileName + " file from " + fileName + "(ingore this file): "
                                + e.getMessage(), e);
            }
            return properties;
        }

        List<URL> list = new ArrayList<URL>();
        try {
            Enumeration<URL> urls = ClassHelper.getClassLoader().getResources(fileName);
            list = new ArrayList<java.net.URL>();
            while (urls.hasMoreElements()) {
                list.add(urls.nextElement());
            }
        } catch (Exception t) {
            logger.warn("Fail to load " + fileName + " file: " + t.getMessage(), t);
        }

        if (list.size() == 0) {
            if (allowEmptyFile) {
                logger.warn("No " + fileName + " found on the class path.");
            }
            return properties;
        }

        if (!allowMultiFile) {
            if (list.size() > 1) {
                String errMsg = String.format(
                        "only 1 %s file is expected, but %d dubbo.properties files found on class path: %s", fileName,
                        list.size(), list.toString());
                logger.warn(errMsg);
                // throw new IllegalStateException(errMsg); // see
                // http://code.alibabatech.com/jira/browse/DUBBO-133
            }
            try {
                properties.load(ClassHelper.getClassLoader().getResourceAsStream(fileName));
            } catch (Exception e) {
                logger.warn(
                        "Failed to load " + fileName + " file from " + fileName + "(ingore this file): "
                                + e.getMessage(), e);
            }
            return properties;
        }

        logger.info("load " + fileName + " properties file from " + list);

        for (java.net.URL url : list) {
            try {
                Properties p = new Properties();
                InputStream input = url.openStream();
                if (input != null) {
                    try {
                        p.load(input);
                        properties.putAll(p);
                    } finally {
                        try {
                            input.close();
                        } catch (Exception t) {
                            logger.warn("Failed to load " + fileName + " file from " + fileName + "(ingore this file): " + t.getMessage(), t);
                        }
                    }
                }
            } catch (Exception e) {
                logger.warn("Fail to load " + fileName + " file from " + url + "(ingore this file): " + e.getMessage(),
                        e);
            }
        }

        return properties;
    }
}

