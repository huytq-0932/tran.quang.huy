package vn.sun.asterisk.domain.use.case

import vn.sun.asterisk.domain.model.Task
import vn.sun.asterisk.domain.repository.TaskRepository

class GetTasksUseCase(
    private val repository: TaskRepository
) : UseCaseNoParam<List<Task>> {

    override fun execute(): List<Task> = repository.getTasks()
}
