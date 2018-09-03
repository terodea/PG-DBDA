echo "1.linux 2.python 3.database 0.exit";
read var;
counter=1;
while [ $counter -eq 1 ]
do
	echo "marks	name";
	if [ $var -eq 1 ]
	then
		cat student.txt | awk '{print $3"	" $2}' |sort -nr |head -3;
	
	fi
	if [ $var -eq 2 ]
	then
		cat student.txt | awk '{print $4"	" $2}' |sort -nr |head -3;
	
	fi
	if [ $var -eq 3 ]
	then
		cat student.txt | awk '{print $5"	" $2}' |sort -nr |head -3;
	
	fi
	if [ $var -eq 0 ]
	then
		counter=0;
	fi
	echo "1.linux 2.python 3.database 0.exit";
	read var;
done

