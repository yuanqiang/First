package com.timecaps.service;

import com.timecaps.common.exception.SystemErrorCodeConstant;
import com.timecaps.dao.RecordMapper;
import com.timecaps.dao.RecordMapperExt;
import com.timecaps.dao.entity.Record;
import com.timecaps.helper.ErrorHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yuanqiang on 2018/3/1.
 */

@Service
public class RecordService {
    private final Logger logger = LoggerFactory.getLogger(RecordService.class);

    @Autowired
    private RecordMapper recordMapper;

    @Autowired
    private RecordMapperExt recordMapperExt;

    public List<Record> listRecords() {
        return  recordMapperExt.listRecords();
    }

    /**
     * 通过id查询记录
     * @param recordId
     * @return
     */
    public Record getRecordById(int recordId) {
       Record record = recordMapperExt.selectById(recordId);

        if (record == null) {
            logger.error("不存在此条记录");
            ErrorHandler.throwError(SystemErrorCodeConstant.QUERY_FAILED);
        }

        return record;
    }

}
