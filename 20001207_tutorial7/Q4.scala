//List of Accounts with negative balances
//Calculate the sum of all account balances
// Calculate the final balances of all accounts
object Question4 extends App{
    
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


    // list of accounts
    var accList:List[Account] = List()

    // method to create a new account
    def CreateAcc(accId: Int):Unit = {
        val acc = new Account(accId)
        accList = accList ::: acc :: Nil    // add new account to the list of accounts
    }

    // find function to find account as a lambda function
    val find = (a:Int, b:List[Account]) => b.filter(account => account.ID.equals(a))

    // filter only overdraft accounts among account list
    val overdraft = (x:List[Account]) => x.filter(account => account.balance < 0.0)

    // function to calculate the toatal balnce of all accounts
    def totalBalance(x:List[Account]):Double = if(x.length == 0) 0.0 else x.head.balance + totalBalance(x.tail)

    //function to apply interest for accounts according to balance
    val interest = (x:List[Account]) => x.map(account => if(account.balance > 0) new Account(account.ID,account.balance*1.05) else new Account(account.ID,account.balance*1.1))

    // create two new accounts
    CreateAcc(1)
    CreateAcc(2)

    //deposit money
    find(1, accList)(0).deposit(2000)
    
    //transfer money
    find(1, accList)(0).transfer(2, 10.0)
    find(1, accList)(0).transfer(2, 2000.0)

    println(find(1, accList)(0))
    println(find(2, accList)(0))
    println("")


    // print overdraft accounts
    println("Overdraft accounts :"+ overdraft(accList))
    println("")
    

    // print total balance of all accounts
    println("total balance of all accounts:" +totalBalance(accList))

    println("")
    // apply the interest rate to every account and print balances
     println("Accounts balance after apply interest:")
    accList = interest(accList)
    println(find(2, accList)(0))
    println(find(1, accList)(0))
}