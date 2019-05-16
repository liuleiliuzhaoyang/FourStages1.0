package com.qf.service;

import com.qf.dao.IdentifyMapper;
import com.qf.pojo.Identify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdentifyServiceImpl implements IdentifyService {
    @Autowired
    private IdentifyMapper identifyMapper;
    @Override
    public Identify getIdentifyTel(String identifyTel) {
        return identifyMapper.getIdentifyTel(identifyTel);
    }
}
