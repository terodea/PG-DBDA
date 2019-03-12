# Word Count Using C in Hadoop
Prerequisites :
1. Hadoop Setup
2. gcc (or any c compiler would work)
Hadoop streaming is a utility that comes with the Hadoop distribution. The utility allows you to create and run Map/Reduce jobs with any executable or script as the mapper and/or the reducer. /

We need 2 programs "mapper.c" and "reducer.c".

### STEP 1:- Compile mapper.c and reducer.c
- 
  ```
    hadoop@namenode:~/hadoopstreaming$ gcc -o mapper.out  mapper.c
    hadoop@namenode:~/hadoopstreaming$ gcc -o reducer.out  reducer.c
    hadoop@namenode:~/hadoopstreaming$ ls
    mapper.c  mapper.out  reducer.c  reducer.out
  ```
  
### STEP 2:- Place your wordcount input file in HDFS
-
  ```
    hadoop@namenode:~$ hadoop fs -put /home/hadoop/wc /
    hadoop@namenode:~$ hadoop fs -ls /
    drwxr-xr-x   - hadoop hadoop         0 2019-03-11 15:50 /wc
  ```

### STEP 3:- Now we will run our C program in HDFS with the help of  Hadoop Streaming jar.
-
  ```
    hadoop jar $HADOOP_HOME/contrib/streaming/hadoop-*streaming*.jar 
    -files hadoopstreaming/mapper.out -mapper hadoopstreaming/mapper.out 
    -files hadoopstreaming/reducer.out -reducer hadoopstreaming/reducer.out 
    -input /wc -output /wordcount-out
  ```
### STEP 4:- RESULTS !!
-
  ```
    hadoop@namenode:~$ hadoop fs -ls  /wordcount-out
    Found 2 items
    -rw-r--r--   3 hadoop hadoop          0 2019-03-11 15:50 /wordcount-out/_SUCCESS
    -rw-r--r--   3 hadoop hadoop      11685 2019-03-11 15:50 /wordcount-out/part-00000
  ```
