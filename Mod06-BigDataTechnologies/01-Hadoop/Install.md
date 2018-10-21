## HADOOP



### Setting Up HADOOP for the first time.


***STEP-1 :*** Install JAVA if not installed. <br> 
***STEP-2 :*** Extract "hadoop-version.tar.gz"
***STEP-3 :*** Configure "hdfs-site.xml","core-site.xml","hdfs-env.sh".
***STEP-4 :*** Add appropriate environment variables in "~/.bashrc". <br>
***STEP-5 :*** hadoop_home/bin >>> hadoop namenode -format
***STEP-6 :*** hadoop_home/sbin >>> ./start-dfs.sh <br>
		***NOTE :*** Enter system password 3 time if asked.<br>
***STEP-7 :*** Open "localhost:50070" If Hadoop GUI visible hadoop is running.
***STEP-8 :*** hadoop/sbin >>> ./stop-dfs.sh To stop the hadoop from running.


***NOTE*** For error Connection refused 22 : localhost not reachable <br>
		***Install "openssh"*** <br>
		>>> sudo apt-get install openssh-client <br>