
fun main() {
    val arr = (1..10).toList().toIntArray()
    for(i in arr.size -9 .. 10 step 2){
        println(arr[i])
    }

    val numbers = arrayOf(-5, 0, 3, 12, -1, 10, 9)

    for (number in numbers) {
        when {
            number < 0 -> println("negative")
            number == 0 -> println("zero")
            number in 1..9 -> println("small")
            else -> println("big")
        }
    }


}