package vn.sun.asterisk.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import vn.sun.asterisk.data.entity.TaskEntity
import vn.sun.asterisk.data.entity.TaskEntity.Companion.ID
import vn.sun.asterisk.data.entity.TaskEntity.Companion.TABLE_NAME
import vn.sun.asterisk.data.entity.TaskEntity.Companion.TITLE

@Dao
interface TaskDao {
    @Query("SELECT * FROM $TABLE_NAME ORDER BY $ID DESC")
    fun getTasks(): List<TaskEntity>

    @Query("SELECT * FROM $TABLE_NAME WHERE $TITLE LIKE :title")
    fun getTasks(title: String): List<TaskEntity>

    @Query("SELECT COUNT($ID) FROM $TABLE_NAME WHERE $TITLE = :title ")
    fun countTask(title: String): Int

    @Insert
    fun insertTask(task: TaskEntity)

    @Query("DELETE FROM $TABLE_NAME")
    fun deleteTasks()

    @Query("DELETE FROM $TABLE_NAME WHERE $ID = :taskId")
    fun deleteTask(taskId: Int): Int
}
