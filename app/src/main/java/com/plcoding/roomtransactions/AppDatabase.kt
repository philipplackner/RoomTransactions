package com.plcoding.roomtransactions

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Event::class, Attendee::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun eventDao(): EventDao
    abstract fun attendeeDao(): AttendeeDao
}