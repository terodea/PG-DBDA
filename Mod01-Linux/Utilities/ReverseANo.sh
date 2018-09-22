echo "enter number";
read var;
while [ $var -ne 0 ]
do
	temp=$((var % 10));
	var2=$(((var2*10)+temp));
	var=$((var / 10));
	
		
	
done
echo "reverse : $var2";
