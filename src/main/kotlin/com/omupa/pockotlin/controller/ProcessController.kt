package com.omupa.pockotlin.controller

import com.omupa.pockotlin.model.Process
import com.omupa.pockotlin.services.ProcessService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/process")
class ProcessController(private val processService: ProcessService) {

    @GetMapping("/")
    fun listAll() = processService.listAll();

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): Process {
        return processService.getById(id);
    }
}