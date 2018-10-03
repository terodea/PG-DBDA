def isPalindrome(x: Int) : Boolean = {
	var input = x
	var rev: Int = 0
	while(input > rev){
		rev = rev * 10 + input % 10
		input = input/10
	}
	rev==input || input==rev/10
}

var v=isPlaindrome(121)
print(v)
