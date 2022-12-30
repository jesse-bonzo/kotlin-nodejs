@JsModule("is-sorted")
@JsNonModule
external fun <T> sorted(a: Array<T>): Boolean

fun main() {
    console.log("Hello World!")
    console.log(sorted(arrayOf(1, 2, 3)))
    console.log(sorted(arrayOf(3, 2, 1)))
}