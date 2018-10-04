class CurrentAccount(ano:Int,anm:String,bal:Double,overamount:Double)extends Account(ano,anm,bal)with Banking{
	private var overdraft:Double = overamount
	def withdraw(amt:Double){
	  if (amt<balance){
	    balance = balance - amt
	    println(s"$balance is available balance")
	    }
	  else if(amt<balance+overdraft)
	  {
	    overdraft=balance-amt
	    balance=0
	    println(s"$amt amount is withdwawn")
	    println(s"$balance is balance")
	    println(s"$overdraft is overdraft amount")
	    
	  }
	  else if (amt>balance+overdraft)
	  {
	    println("pagle balance nahi hai")
	  }
}
	def linkAadhar(ano:String)={
		

	}
	def fillKyc()={

	}
	override def toString()="\nAcc No-->"+ano+"\nAccount Name-->"+anm+"\nBalance is-->"+balance+"\nOverdraft is-->"+overdraft;
}