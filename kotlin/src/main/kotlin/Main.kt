fun main() {

    println(ifPar(2))

    /*var y: Int =3
    println("Outro Numero: $y")
    ifPar(y)*/

    println(positiveOrNegative(-3))

}

fun ifPar (x: Int) {
    if(x%2==0){
        println("$x É par");
    } else{
        println("$x É impar");
    }
}

fun positiveOrNegative(x: Int){
    if (x > 0){
        println("[$x] é positivo")
    }else{
        println("[$x] é negativo")
    }
}