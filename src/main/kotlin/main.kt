fun main(args: Array<String>) {

    println("Bem vindo ao cadastro para contato coach feliz")

    print("Digite seu nome: ")
    val nome = readLine()!!
    // .toDouble() Função que converte a entrada do teclado em string, DESNECESSÁRIO.
    var nome1: String = nome.toString()
    println("Olá $nome1")

    print("Digite sua idade: ")
    val idade = readLine()!!
    // .toInt() Converte a entrada do teclado em inteiro.
    var idade1: Int = idade.toInt()

    print("Digite seu DDD, somente números: ")
    var ddd = readLine()
    print("Digite seu telefone, somente números: ")
    var fone = readLine()
    println("($ddd) $fone")

    print("Digite o nome da rua: ")
    val rua = readLine()
    print("Número da residencia: ")
    val num = readLine()
    print("Bairro: ")
    val bairro = readLine()
    print("Cep: ")
    val cep = readLine()
    print("Cidade: ")
    val cidade = readLine()
    print("Estado: ")
    val estado = readLine()
    println("Rua: $rua, número $num - Bairro $bairro Cep $cep $cidade - $estado")

    println("Obrigado em breve você receberá 2 coach e 8 testemunha de Jeová em sua residencia!!")

    //print("Digite valor do depósito: ")
    // val deposito = readLine()!!

    // .toDouble() Função que converte a entrada do teclado em double.
    //var deposito1: Double = deposito.toDouble()
    //println("You entered: $deposito1")


}