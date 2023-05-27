package com.raisetech.homework9.service;

import com.raisetech.homework9.entity.Name;
import com.raisetech.homework9.mapper.NameMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameServiceImpl implements NameService{
    private final NameMapper nameMapper;

    public NameServiceImpl(NameMapper nameMapper){
        this.nameMapper = nameMapper;
    }

    public List<Name> findAll(){
        return  nameMapper.findAll();
    }

}
