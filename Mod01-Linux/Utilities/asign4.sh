echo "enter filename: ";
read filename;
echo "enter the range to print:";
echo "start: ";read num1;
echo "end: ";read num2;

var=$(cat $filename | wc -l);

if [ $num1 == "*" ]
then
	if [ $num2 -eq "*" ]
	then	
		cat $filename;
	else
		for((i=1; i<=$num2; i++))
		do
			line=$(head -n $i $filename | tail -n 1);
			echo $line;
		done
	fi
else
	if [ $num2 == "*" ]
	then
		for((i=$num1; i<=$var; i++))
		do
			line=$(head -n $i $filename | tail -n 1);
			echo $line;
		done
	else
		for((i=$num1; i<=$num2; i++))
		do
			line=$(head -n $i $filename | tail -n 1);
			echo $line;
		done
	fi
fi

