package org.example.interfaces

interface IConsole {
    fun reader(msg: String)
    fun writer(msg: String, lineBreak: Boolean = false)
}