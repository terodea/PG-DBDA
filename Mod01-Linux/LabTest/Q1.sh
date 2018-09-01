#Create an Utility for printing top ten largest files from given directory ?
# Author : Akshay Terode
if [ -d $1 ]
then
	find $1 -type f -exec ls -l {} \; | sort -k5 -nr | head -n 10 | awk '{print $9}'; 	
else
	echo "ERROR : Argument is not directory";
fi
