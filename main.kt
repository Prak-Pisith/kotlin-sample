fun main(args: Array<String>) {
    println("Hello, World!")

    val bankAccount = BankAccount()
    bankAccount.deposit(100.0)
    bankAccount.withdraw(50.0)
    bankAccount.getBalance() // 50.0
}