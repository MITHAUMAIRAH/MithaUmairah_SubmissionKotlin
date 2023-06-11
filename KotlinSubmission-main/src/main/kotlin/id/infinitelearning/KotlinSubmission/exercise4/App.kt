package id.infinitelearning.KotlinSubmission.exercise4
fun parseNumber(input: String): Int {
    var number = 0
    try {
        number = input.toInt()
    } catch (e: NumberFormatException) {
        println("Format angka tidak valid: ${e.message}")
    }
    return number
}

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    val input1 = "123"
    val input2 = "abc"
    val number1 = parseNumber(input1)
    val number2 = parseNumber(input2)
    println("Number 1: $number1")
    println("Number 2: $number2")

}