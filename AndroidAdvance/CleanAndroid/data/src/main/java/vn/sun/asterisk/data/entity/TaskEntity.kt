package vn.sun.asterisk.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = TaskEntity.TABLE_NAME)
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ID) val id: Long,
    @ColumnInfo(name = TITLE) val title: String,
    @ColumnInfo(name = IS_DONE) val isDone: Boolean = false
) : EntityModel() {

    companion object {
        const val TABLE_NAME = "tbl_task"
        const val ID = "tbl_task"
        const val TITLE = "title"
        const val IS_DONE = "is_done"
    }
}
