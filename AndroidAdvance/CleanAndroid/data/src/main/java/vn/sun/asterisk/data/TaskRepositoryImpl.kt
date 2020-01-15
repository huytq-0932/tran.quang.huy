package vn.sun.asterisk.data

import vn.sun.asterisk.data.local.TaskLocalDataSource
import vn.sun.asterisk.domain.model.Task
import vn.sun.asterisk.domain.repository.TaskRepository

class TaskRepositoryImpl(
    private val dataSource: TaskLocalDataSource
) : TaskRepository {

    override fun getTasks(): List<Task> = dataSource.getTasks()

    override fun getTasks(query: String): List<Task> = dataSource.getTasks(query)

    override fun insertTask(title: String, isDone: Boolean): Task =
        dataSource.insertTask(title, isDone)

    override fun isExistTask(title: String): Boolean = dataSource.isExistTask(title)

    override fun deleteTasks() = dataSource.deleteTasks()

    override fun deleteTask(task: Task): Boolean = dataSource.deleteTask(task)
}
