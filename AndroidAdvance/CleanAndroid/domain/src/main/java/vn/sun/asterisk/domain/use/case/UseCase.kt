package vn.sun.asterisk.domain.use.case

interface UseCase<in P, T : Any> {
    fun execute(param: P): T
}

interface UseCaseNoParam<T : Any> {
    fun execute(): T
}
