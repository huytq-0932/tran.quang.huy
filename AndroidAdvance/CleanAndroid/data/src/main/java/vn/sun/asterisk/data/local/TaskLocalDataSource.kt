package vn.sun.asterisk.data.local

import vn.sun.asterisk.data.entity.TaskEntityMapper
import vn.sun.asterisk.domain.model.Task
import vn.sun.asterisk.domain.repository.TaskRepository
import kotlin.random.Random

class TaskLocalDataSource(
    private val taskDao: TaskDao,
    private val mapper: TaskEntityMapper
) : TaskRepository {
    override fun getTasks(): List<Task> = taskDao.getTasks().map(mapper::mapToDomain)

    override fun getTasks(query: String): List<Task> =
        taskDao.getTasks(query).map(mapper::mapToDomain)

    override fun insertTask(title: String, isDone: Boolean): Task {
        val task = Task(Random.nextLong(), title, isDone)
        taskDao.insertTask(mapper.mapToEntity(task))
        return task
    }

    override fun isExistTask(title: String): Boolean = taskDao.countTask(title) > 0

    override fun deleteTasks() = taskDao.deleteTasks()

    override fun deleteTask(task: Task): Boolean = taskDao.deleteTask(task.id.toInt()) != -1
}
