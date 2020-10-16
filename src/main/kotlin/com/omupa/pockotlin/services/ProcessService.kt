package com.omupa.pockotlin.services

import com.omupa.pockotlin.model.Process
import org.springframework.stereotype.Service

@Service
class ProcessService {

    fun listAll(): List<Process> {
        val listProcess: ArrayList<Process> = ArrayList();
        listProcess.add(Process("Process 01", "New 01"));
        listProcess.add(Process("Process 02", "New 02"));
        return listProcess;
    }

    fun getById(id: Long): Process {
        return Process("Title", "Description");
    }
}