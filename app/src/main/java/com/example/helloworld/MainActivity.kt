package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
//    var num1 = 0
//    var num2 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        //getInput()
//        println(add(5,5))
//        Log.d("MainActivity","Addition")
//        println(multiply(5,5))
//        Log.d("MainActivity","Multiplication")
//        println(div(5,5))
//        Log.d("MainActivity","Division")
//        println(sub(5,5))
//        Log.d("MainActivity","Subtraction")
          println(calculate(5,5,"*"))

    }


//    fun getInput(){
//        print("Enter First number: ")
//        num1 = readLine()!!.toInt()
//        print("Enter Second number: ")
//        num2 = readLine()!!.toInt()
//    }

//    fun add(num1: Int, num2 : Int) : Int{
//        print("$num1 + $num2 = ")
//        return  num1 + num2
//    }
//    fun multiply(num1: Int, num2 : Int) : Int{
//        print("$num1 * $num2 = ")
//        return  num1 * num2
//    }
//    fun div(num1: Int, num2 : Int) : Int{
//        print("$num1 / $num2 = ")
//        return  num1 / num2
//    }
//    fun sub(num1: Int, num2 : Int) : Int{
//        print("$num1 - $num2 = ")
//        return  num1 - num2
//    }

    fun calculate(num1 : Int, num2: Int, op : String) : Int{
        if (op == "+"){
            print("$num1 + $num2 = ")
            return num1 + num2
        }
        else if (op == "*"){
            print("$num1 * $num2 = ")
            return num1 * num2
        }
        else if(op == "-"){
            print("$num1 - $num2 = ")
            return num1 - num2
        }
        else if(op == "/"){
            print("$num1 / $num2 = ")
            return num1 / num2
        }
        else{
            println("$op is invalid operator")
            return 0
        }

    }

}