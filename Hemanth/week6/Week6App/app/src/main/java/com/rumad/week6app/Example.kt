package com.rumad.week6app

import java.lang.reflect.Array.get

class Example(val exampleParam : Int?, parentParam: Int) : Parent(parentParam) {

    override fun doWork() : Int {
        var name = "cheese"

        return  5
    }
}

abstract class Parent(val parentParam : Int) {
    abstract fun doWork() : Int
}