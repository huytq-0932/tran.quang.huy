package vn.sun.asterisk.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import vn.sun.asterisk.data.local.TaskDao

@Database(entities = [TaskDao::class], version = AppDatabase.VERSION)
abstract class AppDatabase : RoomDatabase() {

    abstract fun taskDao(): TaskDao

    companion object {
        const val VERSION = 1
        private const val DATABASE_NAME = "task.db"

        fun getInstance(context: Context) =
            Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
                .allowMainThreadQueries()
                .build()
    }
}
