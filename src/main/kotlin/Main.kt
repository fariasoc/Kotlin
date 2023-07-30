fun main() {

    val account = Account()
    val accountClient = Account()

    account.holder = "Celso"
    account.numberAccount = 9470
    account.amount = 100.00

    accountClient.holder = "Poly"
    accountClient.numberAccount = 9470
    accountClient.amount = 100.00

    println("Saldo antes do depósito\n")
    println("Saldo Celso: ${account.amount}")
    println("Saldo Poly: ${accountClient.amount}\n")

    account.deposit(200.00)
    accountClient.deposit(200.00)

    println("Saldo após o depósito\n")
    println("Saldo Celso: ${account.amount}")
    println("Saldo Poly: ${accountClient.amount}\n")

    account.withDraw(150.00)
    accountClient.withDraw(150.00)

    println("Saldo após o saque\n")
    println("Saldo Celso: ${account.amount}")
    println("Saldo Poly: ${accountClient.amount}\n")

    if(account.transfer(25.25, accountClient)){
        println("Transfer success")
    } else {
        println("Transfer unsuccess")
    }

    println("Saldo da conta ${accountClient.holder} R$ ${accountClient.amount}")

}

