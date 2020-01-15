package vn.sun.asterisk.domain.repository

import vn.sun.asterisk.domain.model.Task

interface TaskRepository : Repository{
    fun getTasks(): List<Task>

    fun getTasks(query: String): List<Task>

    fun insertTask(title: String, isDone: Boolean = false): Task

    fun isExistTask(title: String): Boolean

    fun deleteTasks()

    fun deleteTask(task: Task): Boolean
}
