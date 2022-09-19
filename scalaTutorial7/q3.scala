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

    override def toString = "[NIC:"+nic+",AccountNo:"+accNo +",Balance:"+ balance+"]"
}

object Q3 extends App {
    var listOfAccounts:List[Account] = List()

    //create account
    def accCreate(nic:String, accNo: Int):Unit = {
        val acc = new Account(nic, accNo)
        listOfAccounts = listOfAccounts ::: acc :: Nil //:::->concatenate lines therefore here we can list of accounts after creating :: -> prepend the element
        println(listOfAccounts)
    }

    //find the account from the list
    val find = (a:Int, b:List[Account]) => b.filter(account => account.accNo.equals(a))
    //NEGATIVE BANK BALANCE
    val overdraft = (b:List[Account]) => b.filter(account => account.balance < 0.0)
    val totalBal = (b:List[Account]) => b.foldLeft(0.0)((x, y) => x + y.balance) //(0.0) -> initial value (x,y) part is a function x->previous total + y.balance is the new balance that is adding to the total
    val interest = (b:List[Account]) => b.map(account => if(account.balance > 0) (account.balance+ account.balance*0.05) else (account.balance+ account.balance*0.1))

     /*******testcase********/
    //creating 2 accounts
    println("creating 1st account")
    accCreate("985052668V",1)
    println("creating 2nd account")
    accCreate("988952668V",2)
    println("creating 3rd account")
    accCreate("988957778V",3)

    //deposit money
    find(1, listOfAccounts)(0).deposit(1000) //FIND(0)=>TAKE THE FIRST list IN THe list
    println("Depositing money to acc 1")
    println(find(1, listOfAccounts)(0))

    //transfer money
    find(1, listOfAccounts)(0).transfer(2, 100.0)
    println("Transfer money to acc 2")
    println(find(2, listOfAccounts)(0))

    find(1, listOfAccounts)(0).transfer(3, 1000.0)
    println("Transfer money to acc 3")
    println(find(3, listOfAccounts)(0))

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

