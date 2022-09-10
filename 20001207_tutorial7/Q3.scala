//tranfer money from one account to other account
object question3 extends App{

     // account class
    class Account(val ID:Int, var balance:Double = 0.0){
        // method to withdraw from the account
        def withdraw(amount:Double):Unit = {
            this.balance -= amount
        }
        // method to deposit to the account
        def deposit(amount:Double):Unit = {
            this.balance += amount
        }

        // method to transfer from one account to another account
        def transfer(accID:Int, amount:Double):Unit = {
            this.withdraw(amount)
            find(accID,accList)(0).deposit(amount)
        }

        override def toString(): String = "Acocunt ID : "+ID+", balance :"+balance
    }

    
    var accList:List[Account] = List()  // list of accounts

    // method to create a new account
    def CreateAcc(accId: Int):Unit = {
        val acc = new Account(accId)
        accList = accList ::: acc :: Nil    // add new account to the list of accounts
    }

    // find function to find account as a lambda function
    val find = (a:Int, b:List[Account]) => b.filter(account => account.ID.equals(a))
    
    // create two new accounts
    CreateAcc(1)
    CreateAcc(2)

    //deposit money to first account
    find(1, accList)(0).deposit(2500)
    println(find(1, accList)(0)) // use 0 index to access first account,since it retruns an array

    //transfer money to second account from first account
    find(1, accList)(0).transfer(2, 500.0)
    println(find(2, accList)(0))
    println(find(1, accList)(0))

   
}


