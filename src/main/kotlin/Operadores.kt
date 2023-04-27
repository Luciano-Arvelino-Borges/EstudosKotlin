fun main() {
    println("Digite o primeiro valor: ")
    var n1 = readln().toFloat()
    println("Digite o segundo valor: ")
    var n2 = readln().toFloat()

    println("A soma entre $n1 e $n2 é ${n1+n2}")
    println("A diferença entre $n1 e $n2 é ${n1-n2}")
    println("O produto entre $n1 e $n2 é ${n1*n2}")
    println("O quociente entre $n1 e $n2 é ${n1/n2}")
    println("O resto da divisão entre $n1 e $n2 é ${n1%n2}")

    /*Pode-se utilizar métodos como:  .plus
                                      .minus
                                      .times
                                      .div
                                      .rem ou .mod
    */
}