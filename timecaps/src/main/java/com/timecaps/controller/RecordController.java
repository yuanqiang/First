package com.timecaps.controller;

import com.timecaps.common.core.HttpResult;
import com.timecaps.controller.base.AbstractController;
import com.timecaps.dao.RecordMapper;
import com.timecaps.dao.RecordMapperExt;
import com.timecaps.dao.entity.Record;
import com.timecaps.service.RecordService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by yuanqiang on 2018/2/27.
 */

@RestController
@RequestMapping("/")
public class RecordController extends AbstractController {

    @Autowired
    private RecordService recordService;

    @RequestMapping(value = "/record/list", method = RequestMethod.GET)
    public HttpResult<List<Record>> listRecords(){
        return HttpResult.successWithData(recordService.listRecords());
    }

    @RequestMapping(value = "/record/{recordId}/detail", method = RequestMethod.GET)
    public HttpResult<Record> getRecordById(@PathVariable("recordId") int recordId) {
        return HttpResult.successWithData(recordService.getRecordById(recordId));
    }


}