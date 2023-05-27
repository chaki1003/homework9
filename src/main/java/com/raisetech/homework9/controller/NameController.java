package com.raisetech.homework9.controller;

import com.raisetech.homework9.entity.Name;
import com.raisetech.homework9.mapper.NameMapper;
import com.raisetech.homework9.service.NameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {

    private final NameService nameService;

    public NameController(NameService nameService){
        this.nameService = nameService;
    }

    @GetMapping("/names")
    public List<NameResponse> getNames() {return nameService.findAll().stream().map(NameResponse::new).toList();
    }

}
