package com.cloudeducertios.learningkotlin.ui.main.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cloudeducertios.learningkotlin.R
import com.cloudeducertios.learningkotlin.databinding.ActivityEmployeeDetailsBinding
import com.cloudeducertios.learningkotlin.databinding.ActivityEmployeeDetailsBinding.inflate

class EmployeeDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityEmployeeDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        setContentView(binding.root)

        // receive data to another activity data by intent..
        val receiveIntent = intent
        // declare to type what kind of data i am staging.
        /*var name = receiveIntent.getStringExtra("name")
        var address = receiveIntent.getStringExtra("address")
        var phn = receiveIntent.getStringExtra("phn")

        binding.nameUzzal.text = name
        binding.eamil1.text = address
        binding.phn1.text = phn*/

        val employee: Employee = receiveIntent.getSerializableExtra("employee") as Employee
        binding.nameSohel.text = employee.name
        binding.address2.text = employee.address
        binding.phn2.text = employee.number
        binding.designationTv.text = employee.designation


    }
}