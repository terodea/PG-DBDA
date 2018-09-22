echo "enter rows"
read r;
for((row=0; row<r; row++))
do
	for((space=r;space>row;space--))
	do
		echo -n " ";
	done
	for((star=0;star<=row;star++))
	do
		echo -n "* ";
	done
	echo "";
done
for((row=r; row>0; row--))
do
	for((space=r+1; space>=row;space--))
	do
		echo -n " ";
	done
	for((star=row-1 ; star>0; star--))
	do
		echo -n "* ";
	done
	
	echo "";
done 
