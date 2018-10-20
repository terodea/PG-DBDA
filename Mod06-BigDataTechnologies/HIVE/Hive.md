# UDF in Hive

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