package vn.sun.asterisk.data.entity

import vn.sun.asterisk.domain.model.DomainModel

abstract class EntityMapper<DM : DomainModel, EM : EntityModel> {
    abstract fun mapToDomain(entityModel: EM): DM

    abstract fun mapToEntity(domainModel: DM): EM
}
