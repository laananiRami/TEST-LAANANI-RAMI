package com.bnp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.io.IOException;

@RequestMapping("/")
public interface TechniqueTest {


    @PostMapping("/split-list")
    public ResponseEntity splitLisOfPerson(@RequestBody @Valid PersonDto personDto);


    @PostMapping("/save")
    public ResponseEntity savePersonsList(@RequestBody @Valid PersonDto personList) throws IOException;
}
