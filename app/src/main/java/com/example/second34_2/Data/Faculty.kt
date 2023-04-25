package com.example.second34_2.Data

import java.util.*

class Faculty(
    val id: UUID = UUID.randomUUID(),
    var name: String = ""
) {
    constructor() : this(UUID.randomUUID())

    var groups: List<Group> = emptyList()
}
