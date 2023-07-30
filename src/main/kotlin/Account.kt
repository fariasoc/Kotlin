class Account {
    var holder = ""
    var numberAccount = 0
    private var amount = 0.0

    fun deposit(amountValue: Double) {
        amount += amountValue
    }

    fun withDraw(amountValue: Double) {
        if (amount >= amountValue) {
            amount -= amountValue
        }
    }

    fun transfer(amountValue: Double, destiny: Account): Boolean {
        if (amount >= amountValue) {
            amount -= amountValue

            destiny.deposit(amountValue)

            return true
        }

            return false
    }
}

