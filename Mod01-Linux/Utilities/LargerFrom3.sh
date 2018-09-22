echo "enter number1";
read var1;
echo "enter number2";
read var2;
echo "enter number3";
read var3;
if [ $var1 -gt $var2 ]
then 
	if [ $var1 -gt $var3 ]
	then
		echo "greater: $var1";
	else
		echo "greater: $var3";
	fi
else
	if [ $var2 -gt $var3 ]
 	then
		echo "greater: $var2";
	else
		echo "greater: $var3";
	fi
fi

