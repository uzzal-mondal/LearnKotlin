package com.cloudeducertios.learningkotlin.ui.main


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.cloudeducertios.learningkotlin.databinding.ActivityMainBinding
import com.cloudeducertios.learningkotlin.databinding.ActivityMainBinding.inflate
import com.cloudeducertios.learningkotlin.ui.main.model.Employee
import com.cloudeducertios.learningkotlin.ui.main.model.EmployeeDetailsActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var defaultDesignation: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        setContentView(binding.root)
        showEmployeeData()
        showDesignationList()
    }

    private fun showEmployeeData() {
        binding.btnClick.setOnClickListener {

            var name = binding.etName.text.toString()
            var address = binding.etAddress.text.toString()
            var number = binding.etNumber.text.toString()
            val employee = Employee(
                name = name,
                address = address,
                number = number,
                designation = defaultDesignation
            )

            if (name.isEmpty() || address.isEmpty() || number.isEmpty()) {
                Toast.makeText(this, "please, all fill-up reg form.", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, EmployeeDetailsActivity::class.java)
                /* intent.putExtra("name", name)
                 intent.putExtra("address", address)
                 intent.putExtra("phn", number)*/
                intent.putExtra("employee", employee)
                startActivity(intent)
            }
        }
    }

    private fun showDesignationList() {
        val listAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_spinner_dropdown_item,
            generateEmployeeList()
        )
        binding.desiginationSp.adapter = listAdapter

        binding.desiginationSp.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    defaultDesignation = parent?.getItemAtPosition(position).toString()

                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    Toast.makeText(this@MainActivity, "nothing selcted", Toast.LENGTH_SHORT).show()

                }

            }
    }
}


