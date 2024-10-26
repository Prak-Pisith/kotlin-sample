//////////////////////
// Encapsulation

class BankAccount {
    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) balance += amount
    }

    fun withdraw(amount: Double) {
        if (balance >= amount) balance -= amount
    }

    fun getBalance(): Double = balance
}