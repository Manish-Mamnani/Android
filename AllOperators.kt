fun main() {
    // Arithmetic Operators
    var a = 10
    var b = 5

    println("Arithmetic Operators:")
    println("Addition: $a + $b = ${a + b}")
    println("Subtraction: $a - $b = ${a - b}")
    println("Multiplication: $a * $b = ${a * b}")
    println("Division: $a / $b = ${a / b}")
    println("Modulus: $a % $b = ${a % b}")
    println("Increment: $a++ = ${a++}")
    println("Decrement: $b-- = ${b--}")

    // Assignment Operators
    var c = a
    println("\nAssignment Operators:")
    println("c = a: $c")
    c += b
    println("c += b: $c")
    c -= b
    println("c -= b: $c")
    c *= b
    println("c *= b: $c")
    c /= b
    println("c /= b: $c")
    c %= b
    println("c %= b: $c")

    // Comparison Operators
    println("\nComparison Operators:")
    println("$a == $b: ${a == b}")
    println("$a != $b: ${a != b}")
    println("$a > $b: ${a > b}")
    println("$a < $b: ${a < b}")
    println("$a >= $b: ${a >= b}")
    println("$a <= $b: ${a <= b}")

    // Logical Operators
    val x = true
    val y = false
    println("\nLogical Operators:")
    println("x && y: ${x && y}")
    println("x || y: ${x || y}")
    println("!x: ${!x}")

    // Bitwise Operators
    val d = 2 // 0010 in binary
    val e = 3 // 0011 in binary
    println("\nBitwise Operators:")
    println("d & e: ${d and e}")  // AND
    println("d | e: ${d or e}")   // OR
    println("d ^ e: ${d xor e}")  // XOR
    println("e.inv(): ${e.inv()}") // Inversion (Two's complement)
    println("d.shl(1): ${d shl 1}") // Left shift
    println("d.shr(1): ${d shr 1}") // Right shift
    println("d.ushr(1): ${d ushr 1}") // Unsigned right shift
}