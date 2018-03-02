package com.timecaps.dao;

import com.timecaps.dao.entity.Record;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yuanqiang on 2018/2/28.
 */
public interface RecordMapperExt {
//    @Select("select * from record where id = #{id} ")
//    @ResultMap("com.timecaps.dao.RecordMapper.ResultMapWithBLOBs")
//    public Record selectById(@Param("id") int id);
    public Record selectById(@Param("id") int id);

//    @Select("select * from record")
//    @ResultMap("com.timecaps.dao.RecordMapper.ResultMapWithBLOBs")
    public List<Record> listRecords();
}