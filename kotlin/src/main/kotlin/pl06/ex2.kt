package pl06

fun main() {

    (positiveOrNegative(3))
    (positiveOrNegative(-3))

}


fun positiveOrNegative(x: Int){
    if (x > 0){
        println("[$x] é positivo")
    }else{
        println("[$x] é negativo")
    }
}