package pl06

fun main() {

    (ifPar(2))
    (ifPar(3))
}


fun ifPar (x: Int) {
    if(x%2==0){
        println("$x é par");
    } else{
        println("$x é impar");
    }
}