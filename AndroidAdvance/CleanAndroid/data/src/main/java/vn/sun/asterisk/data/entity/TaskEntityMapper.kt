package vn.sun.asterisk.data.entity

import vn.sun.asterisk.domain.model.Task

class TaskEntityMapper : EntityMapper<Task, TaskEntity>() {
    override fun mapToDomain(entityModel: TaskEntity): Task =
        Task(
            id = entityModel.id,
            title = entityModel.title,
            isDone = entityModel.isDone
        )

    override fun mapToEntity(domainModel: Task): TaskEntity =
        TaskEntity(
            id = domainModel.id,
            title = domainModel.title,
            isDone = domainModel.isDone
        )
}