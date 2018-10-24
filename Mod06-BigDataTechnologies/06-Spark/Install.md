# Apache Spark Setup Instruction

## Step 1 :- Check for Java installation
-
    ```
        $ java -version
    ```
- O/P
    ```
        java version "1.7.0_71" 
        Java(TM) SE Runtime Environment (build 1.7.0_71-b13)
        Java HotSpot(TM) Client VM (build 25.0-b02, mixed mode)
    ```
- If you don't get the O/P something like this you need to install JAVA
- Also you might have installed java but "PATH" is not set in that case you need to append java PATH.

## Step 2 :- Check for Scala installation
-
    ```
        $ scala -version
    ```
- O/P
    ```
        Scala code runner version 2.11.6 -- Copyright 2002-2013, LAMP/EPFL
    ```
- If you don't get the O/P something like this you need to install Scala
- Also you might have installed java but "PATH" is not set in that case you need to append scala PATH.

## Step 3 :- Download from "https://spark.apache.org/downloads.html" and extract spark
-
    ```
        tar -xvf "[spark-version-bin.tgz]"
    ```
-
    ```
        tar -xvf spark-2.3.2-bin-hadoop2.7
    ```

## Step 4 :- Move the downloaded file
-
    ```
        mv [spark-version-bin/*] /[desired-loaction]
    ```
-
    ```
        mv spark-2.3.2-bin-hadoop2.7/* /home/student/DBDA/ApacheSpark
    ```
- ***Note*** You can specify any final location of your choice just keep in mind to remember it.

## Step 5 :- Setting up the environment for Spark
- 
    ```
        sudo gedit ~/.bashrc
    ```
- Append the Spark home path in ~/.bashrc
    ```
        export Spark_Home=/[your-spark-folder]
        export PATH=$PATH:/[your-spark-folder/bin]
    ```
- 
    ```
        $ source ~/.bashrc
    ```
## Step 6 :- Running Apache Spark
- Running Spark Shell
    ```
        $ spark-shell
    ```
- O/P
    ```
        2018-10-24 11:51:00 WARN  Utils:66 - Your hostname, DBDA-L14 resolves to a loopback address: 127.0.0.1; using 192.168.1.189 instead (on interface eno1)
        2018-10-24 11:51:00 WARN  Utils:66 - Set SPARK_LOCAL_IP if you need to bind to another address
        2018-10-24 11:51:01 WARN  NativeCodeLoader:62 - Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
        Setting default log level to "WARN".
        To adjust logging level use sc.setLogLevel(newLevel). For SparkR, use setLogLevel(newLevel).
        Spark context Web UI available at http://192.168.1.189:4040
        Spark context available as 'sc' (master = local[*], app id = local-1540362068614).
        Spark session available as 'spark'.
        Welcome to
            ____              __
            / __/__  ___ _____/ /__
            _\ \/ _ \/ _ `/ __/  '_/
        /___/ .__/\_,_/_/ /_/\_\   version 2.3.2
            /_/
                
        Using Scala version 2.11.8 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_181)
        Type in expressions to have them evaluated.
        Type :help for more information.
        scala> 
    ```
- Running PySpark Shell
    ```
        $ pyspark
    ```
- O/P
    ```
        Python 2.7.12 (default, Dec  4 2017, 14:50:18) 
        [GCC 5.4.0 20160609] on linux2
        Type "help", "copyright", "credits" or "license" for more information.
        2018-10-24 11:49:43 WARN  Utils:66 - Your hostname, DBDA-L14 resolves to a loopback address: 127.0.0.1; using 192.168.1.189 instead (on interface eno1)
        2018-10-24 11:49:43 WARN  Utils:66 - Set SPARK_LOCAL_IP if you need to bind to another address
        2018-10-24 11:49:45 WARN  NativeCodeLoader:62 - Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
        Setting default log level to "WARN".
        To adjust logging level use sc.setLogLevel(newLevel). For SparkR, use setLogLevel(newLevel).
        Welcome to
            ____              __
            / __/__  ___ _____/ /__
            _\ \/ _ \/ _ `/ __/  '_/
        /__ / .__/\_,_/_/ /_/\_\   version 2.3.2
            /_/

        Using Python version 2.7.12 (default, Dec  4 2017 14:50:18)
        SparkSession available as 'spark'.
        >>>
    ```