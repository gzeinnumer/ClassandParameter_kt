package com.gzeinnumer.classandparameter_kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val person = Person("Zein",22)

        println("MainClass "+person.firstName)
        println("MainClass "+person.age)
    }
}

class Person(fName: String, personAge: Int){
    val firstName: String
    val age: Int
    init {
        firstName = fName.capitalize()
        age = personAge

        println("Class "+firstName)
        println("Class "+age)
    }
}
