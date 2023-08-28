package com.plcoding.roomtransactions

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "attendees",
    foreignKeys = [
        ForeignKey(
            entity = Event::class,
            parentColumns = ["eventId"],
            childColumns = ["eventId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class Attendee(
    val eventId: Long,
    val name: String,
    val profilePictureUrl: String?,
    @PrimaryKey(autoGenerate = true) val attendeeId: Long = 0L
)



