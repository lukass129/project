package com.example.myapplication4123

import android.app.Application
import com.example.myapplication4123.model.UsersService

class App : Application() {
    val usersService = UsersService()
}