package com.plcoding.roomtransactions

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val db: AppDatabase
): ViewModel() {

    fun insertEvent() {
        viewModelScope.launch {
            val event = Event(
                title = "Test event",
                description = "My event",
                timestamp = System.currentTimeMillis()
            )
            val eventId = db.eventDao().insertEvent(event)

            val attendees = (1..10).map {
                Attendee(
                    eventId = eventId,
                    name = "Test attendee$it",
                    profilePictureUrl = null
                )
            }
            attendees.forEach {
                db.attendeeDao().insertAttendee(it)
            }
        }
    }
}