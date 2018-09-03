copy() {
	
	echo "enter source :(file/directory):";
	read sourcefile;
	echo "enter destination directory";
	read destfile;
	
	if [ -e $destfile ]
	then 
		echo "$destfile exist";
	else
		echo "creating desstfile ...";
		mkdir $destfile;
	fi
	
	if [ -e $sourcefile ]
	then	

		if [ -d $sourcefile ]
		then
			cp  -r $sourcefile/* $destfile;
		fi
		if [ -f $sourcefile ]
		then
			cp $sourcefile $destfile;
		fi
	else
		echo "enter valid sourcefile";
	fi

}

move() {
	
	echo "enter source :(file/directory):";
	read sourcefile;
	echo "enter destination directory";
	read destfile;
	
	if [ -e $destfile ]
	then 
		echo "$destfile exist";
	else
		echo "creating destination ...";
		mkdir $destfile;
	fi
	
	if [ -e $sourcefile ]
	then	

		if [ -d $sourcefile ]
		then
			mv  -r $sourcefile/* $destfile;
		fi
		if [ -f $sourcefile ]
		then
			mv $sourcefile $destfile;
		fi
	else
		echo "enter valid sourcefile";
	fi

}

echo "1.copy	2.move";
echo "enter choice:";
read var;
if [ $var -eq 1 ]
then
	copy;
fi
if [ $var -eq 2 ]
then
	move;
fi




