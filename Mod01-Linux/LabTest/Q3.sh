#Menu Driven Utility for User
copy() {
	echo "Enter the filename";
	read filename;
	echo "Enter the directory";
	read locationname;
	if [ -d $locationname ]
	then
		cp $filename $locationname; #copy file
		echo "File copied successfully.";
	else
		echo "Enter valid directory";
	fi 
}
remove(){
	echo "Enter the filename";
	read filename;
	echo "Enter the directory";
	read locationname;
	if [ -d $locationname ]
	then	
		cd $locationname
		rm $filename; #remove file
		echo "File Removed Successfully";
	else "Enter valid directory";
	fi
}
rename(){
	echo "Enter the filename";
	read filename;
	echo "Enter the new filename";
	read filename;
	echo "Enter the directory";
	read locationname;
	if [ -d $locationname ]
	then
		if [ -f $filneame ]
		then
			cat $filename > $filerename; #renamefile
			echo "File rename done";
		else
			echo "The entered filename doesnt exists";
		fi
	else
		echo "The directory doesnt exists";
	fi
}
link(){
	echo "Enter the filename";
	read filename;
	echo "Enter the location of the file";
	read locationname;
	echo "Enter the link creation location";
	read linklocation;
	if [ -d $locationname ]
	then
		if [ -f $filneame ]
		then
			ln -s $source $linklocation; #link creation cmd
			echo "Link Creation done";
		else
			echo "Enter valid filename";
		fi
	else
		echo "Enter valid directory";
	fi			
}

echo "Select the operation";
echo "1. copy";
echo "2. remove";
echo "3. rename";
echo "4. link";
read var1;

case $var1 in
	copy|1) copy;;
	copy|2) remove;;
	copy|3) rename;;	
	link|4) link;;
esac
