package com.plcoding.roomtransactions

import androidx.room.Embedded
import androidx.room.Relation
import com.plcoding.roomtransactions.Attendee
import com.plcoding.roomtransactions.Event

data class EventWithAttendees(
    @Embedded val event: Event,
    @Relation(
        parentColumn = "eventId",
        entityColumn = "eventId"
    )
    val attendees: List<Attendee>
)
