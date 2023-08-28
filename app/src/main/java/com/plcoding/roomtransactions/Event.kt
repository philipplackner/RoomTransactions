package com.plcoding.roomtransactions

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "events")
data class Event(
    val title: String,
    val description: String,
    val timestamp: Long,
    @PrimaryKey(autoGenerate = true) val eventId: Long = 0L
)