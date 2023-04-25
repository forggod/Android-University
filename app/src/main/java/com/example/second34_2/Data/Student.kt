package com.example.second34_2.Data

import android.provider.ContactsContract
import android.provider.ContactsContract.CommonDataKinds.Phone
import java.util.*

class Student (
    val id: UUID = UUID.randomUUID(),
    var firstname: String="",
    var lastname: String="",
    var midlename: String="",
    var phonenumber: String="",
    var birthdate: Date =Date(0L)
)
