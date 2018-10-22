# UDF in Hive
@ Author : AKSHAY TERODE

## Definition : <br>
	Creating UDF requires writing Java class and overloading the evaluate() method, which is a part of the
		"org.apache.hadoop.hive.ql.exec.UDF"
		class that is extended to modify default behaviour of evaluate() method.

***Step 1:-->*** Creation of Java Classs<br>
***Step 2:-->*** Creation of JAR file from a class<br>
***Step 3:-->*** Creation of function from the JAR file and the JAVA files created in previous steps.<br>



## How to run UDF in HIVE ? 

***Step 1:-->*** ADD JAR file to Hive <br>
				ADD JAR |location-of-JAR|/<jar_filename>;<br>

***Step 2:-->*** Create UDF temporary function<br>
				CREATE TEMPORARY FUNCTION function_name as 'java-class-location|.<class-name>';<br>

***Step 3:-->*** Use the UDF<br>
				SELECT function_name(<column_name>)FROM <table_name>;


#### Example for How to run UDF in HIVE ?

```
	ADD JAR /home/student/Desktop/UDF.jar;
	CREATE TEMPORARY FUNCTION stringtest AS 'util.TestUDF';
	SELECT stringtest(sname,'Akshay') FROM attend;
```