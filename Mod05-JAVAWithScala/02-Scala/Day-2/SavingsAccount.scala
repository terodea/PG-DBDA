class SavingsAccount(ano:Int,anm:String,bal:Double)extends Account(ano,anm,bal)with Banking{
	def withdraw(amt:Double)={
		if(amt < balance -1000){
			println(s"$amt is withdrawn```")
			balance = balance - amt
			println("available balance is :"+balance)
		}
		else{
		  println("Insufficient Funds")
		}
	}
	
	def linkAadhar(ano:String)={
		

	}
	def fillKyc()={

	}
	override def toString()=s"\nAcc No-->"+ano+"\nAccount Name-->"+anm+"\nBalance is-->"+balance;
}
