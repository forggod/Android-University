package com.example.second34_2.Data

import java.util.*

class Group(
    val id: UUID = UUID.randomUUID(),
    var name: String = ""
) {
    constructor() : this(UUID.randomUUID())

    var student: List<Student> = emptyList()
}
