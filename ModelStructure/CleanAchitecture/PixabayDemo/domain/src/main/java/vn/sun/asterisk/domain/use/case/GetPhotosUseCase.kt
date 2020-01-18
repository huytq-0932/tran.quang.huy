package vn.sun.asterisk.domain.use.case

import vn.sun.asterisk.domain.UseCase
import vn.sun.asterisk.domain.model.Photo
import vn.sun.asterisk.domain.repository.PhotoRepository

class GetPhotosUseCase(
    private val repository: PhotoRepository
) : UseCase<String, List<Photo>> {

    override fun execute(input: String): List<Photo> = repository.getImages(input)
}
