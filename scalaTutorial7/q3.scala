class Account(nic:String, val accNo: Int, var balance: Double = 0.0){


    def deposit(amt:Double) : Unit = {
        this.balance = this.balance + amt
    }

    def withdrawal(amt:Double) : Unit = {
        this.balance = this.balance - amt
    }

    

    def transfer(account:Int, amt:Double) : Unit = {
        val transferAcc = Q3.find(account, Q3.listOfAccounts)
        if (balance < 0.0) println("Insufficient balance")
        else {
            this.withdrawal(amt)
            transferAcc(0).deposit(amt)
        }
    }

    override def toString = "["+nic+":"+accNo +":"+ balance+"]"
}

object Q3 extends App {
    var listOfAccounts:List[Account] = List()

    //create account
    def accCreate(nic:String, accNo: Int):Unit = {
        val acc = new Account(nic, accNo)
        listOfAccounts = listOfAccounts ::: acc :: Nil
        println(listOfAccounts)
    }

    //find the account from the list
    val find = (a:Int, b:List[Account]) => b.filter(account => account.accNo.equals(a))

    val overdraft = (b:List[Account]) => b.filter(account => account.balance < 0.0)
    val totalBal = (b:List[Account]) => b.foldLeft(0.0)((x, y) => x + y.balance)
    val interest = (b:List[Account]) => b.map(account => if(account.balance > 0) account.balance*0.05 else account.balance*0.1)

     /*******testcase********/
    //creating 2 accounts
    println("creating 1st account")
    accCreate("1",1)
    println("creating 2nd account")
    accCreate("2",2)

    //deposit money
    find(1, listOfAccounts)(0).deposit(1000)
    println("Depositing money to acc 1")
    println(find(1, listOfAccounts)(0))

    //transfer money
    find(1, listOfAccounts)(0).transfer(2, 100.0)
    println("Transfer money to acc 2")
    println(find(2, listOfAccounts)(0))

    //list of negative balances
    println("List of accounts with negative balances")
    println(overdraft(listOfAccounts))

    //total sum of all account balances
    println("Total sum of accounts balances")
    println(totalBal(listOfAccounts))

    //final balances of all accounts after apply the interest
    println("Final balance of all accounts after te ineterest is applied")
    println(interest(listOfAccounts))
}

