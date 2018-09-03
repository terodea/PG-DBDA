echo "enter number";
read var;
ori=$var;
while [ $var -ne 0 ]
do
	temp=$((var % 10));
	var2=$(((var2*10)+temp));
	var=$((var / 10));	
done
if [ $ori -eq $var2 ]
then
	echo "palindrome";
else
	echo "not palindrome";
fi

