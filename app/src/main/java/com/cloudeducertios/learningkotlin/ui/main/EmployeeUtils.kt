package com.cloudeducertios.learningkotlin.ui.main

import com.cloudeducertios.learningkotlin.ui.main.model.Employee

/**
 * Created by Android Dev on 22-Nov-21 Nov, 2021
 */
fun generateEmployeeList(): List<String> {
    val dList = ArrayList<String>()
    dList.add("Manager")
    dList.add("CEO")
    dList.add("Project Manager")
    dList.add("Software Engineer.")
    dList.add("Junior Software Engineer.")
    return dList;
}