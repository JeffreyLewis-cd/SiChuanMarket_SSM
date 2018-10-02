package com.ssm.demo.service.impl;

import com.ssm.demo.dao.IndustryInfoMapperDao;
import com.ssm.demo.entity.IndustryInfo;
import com.ssm.demo.service.FileUploadService;
import com.ssm.demo.util.ReadExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@Service
public class FileUploadImpl implements FileUploadService {

    @Autowired
    IndustryInfoMapperDao industryInfoMapperDao;

    @Override
    public int batchImport(IndustryInfo industryInfo) {
        return   industryInfoMapperDao.addAindustryInfo(industryInfo);
    }
}
