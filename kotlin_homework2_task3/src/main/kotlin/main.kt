fun main() {
    val amount = 15000
    val discountStart = 1000
    val discountFinal = 10000
    val discountStandart = 100
    val discount = 5
    val discountCustomer = 1
    val customer = true


    val preliminaryAmount = if (amount > discountStart && amount <= discountFinal) {
        amount - discountStandart
    } else if (amount > discountFinal) {
        amount * (100 - discount) / 100
    } else {
        amount
    }


    val finalAmount = if (customer === true) (preliminaryAmount * (100 - discountCustomer) / 100) else preliminaryAmount

    println("Ваша покупка: $finalAmount")

}


