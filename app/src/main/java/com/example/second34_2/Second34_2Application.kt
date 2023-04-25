package com.example.second34_2

import android.app.Application
import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.example.second34_2.Data.Faculty
import repository.FacultyRepository

class Second34_2Application:Application() {
    override  fun onCreate(){
        super.onCreate()
        FacultyRepository.newInstance()
    }

    init{
        instance=this
    }
    companion object{
        private  var instance:Second34_2Application?=null

        fun applicationContex(): Context {
            return instance!!.applicationContext
        }
    }
}