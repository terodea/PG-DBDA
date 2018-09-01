#Create an Interactive Utility for top ten mem consuming processes, also klling the procces if said YES by the user.
#IF not a valid pid print say valid pid
ps -eo pid,user,%mem --sort=-%mem | head -n 10;
test=ps -eo pid --sort=-%mem | head -n 10; #Store top ten pid in test
echo "Do you want to kill any procces. Enter (YES\NO)";
read var1; 
if [ $var1 == "YES" ] #check for killing PID
then
	echo "Please enter the process id you want to kill";
	read pid;
	if [ $pid != "$test" ] #check for if pid exists or not
	then
		echo "Please enter valid process id" ;
	fi
	kill $pid; #kill the process with pid
fi
