package vn.sun.asterisk.domain

interface UseCase<in Param, out T> {
    fun execute(input: Param): T
}

interface UseCaseNoParam<out T> {
    fun execute(): T
}
