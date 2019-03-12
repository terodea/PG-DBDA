## HADOOP

## INSTALLATION
### Setting Up HADOOP for the first time.

### STEP-1 : Install JAVA if not installed.
-
	```
		$ java -version
	```
-
	```
		java version "1.8.0_181"
		Java(TM) SE Runtime Environment (build 1.8.0_181-b13)
		Java HotSpot(TM) 64-Bit Server VM (build 25.181-b13, mixed mode)
	```
- If you don't see an O/p like this you need to rectify the problem i.e
	- Check for "JAVA_HOME" set in '~./bashrc' or not.
	- Install java.

### STEP-2 : Download and Extract "hadoop-version.tar.gz"
-
	```
		tar -xvf [hadoop-version.tar.gz]
		cd [hadoop-version]
		mv [hadoop-versionb/*] /[your-desired-location]
	```

- Example
	```
		tar -xvf hbase-2.1.0-bin.tar.gz
		cd hadoop-2.8.5
		mv hadoop-2.8.5/* /home/student/DBDA/Hadoop_Home
	```

### STEP-3 : Configure "hdfs-site.xml","core-site.xml","hdfs-env.sh". 
- ***Step 3.1 :*** Configuring "hdfs-site.xml"
	- Go to Hadoop_Home/etc/hadoop/
	- 
		```
			sudo gedit hdfs-site.xml
		```
	- Copy the contents and add the following details in the "hdfs-site.xml"
	-	
		```
			<configuration>
				<property>
					<name>dfs.replication</name>
					<value>1</value>
				</property>
				<property>
					<name>dfs.namenode.name.dir</name>
					<value>file:/home/student/DBDA/hdfs/namenode</value>
				</property>
				<property>
					<name>dfs.datanode.data.dir</name>
					<value>file:/home/student/DBDA/hdfs/datanode</value>
				</property>
			</configuration>
		```
	- ***Note :*** You need to create datanode and namenode folder expilicty in your desired location.
	-
		```
			sudo mkdir -p /home/[your-dersired-location]/namenode
			sudo mkdir -p /home/[your-dersired-location]/datanode
		```
- ***Step 3.2 :*** Configuring "core-site.xml"
	- Go to Hadoop_Home/etc/hadoop/
	- 
		```
			sudo gedit core-site.xml
		```
	- Copy the contents and add the following details in the "core-site.xml"
	-
		```
			<configuration>
				<property>
					<name>fs.default.name</name>
					<value>hdfs://localhost:9000</value>
				</property>
				<property>
					<name>dfs.replication</name>
					<value>1</value>
				</property>
			</configuration>
		```
	- ***Note :*** You can change replication factor according to need. The value of replication creates no. of copies of your data.

- ***Step 3.3 :*** Configuring "hdfs-env.sh"
	- Go to Hadoop_Home/etc/hadoop/
	- 
		```
			sudo gedit hdfs-env.sh
		```
	- Copy the contents and add the following details in the "hdfs-env.sh" and add below "# The java implementation to use."
	-
		```
			# The java implementation to use.
			export JAVA_HOME=/usr/lib/java/jdk-1.8.0_181
			export JAVA_HOME=${JAVA_HOME}
		```
	- ***Note :*** You need to speicfy the "JAVA_HOME" setup in your system and "~/.bashrc" file.

### STEP-4 : Add appropriate environment variables in "~/.bashrc".
-
	```
		sudo gedit ~/.bashrc
	```
- Append the following contents into ~/.bashrc file
	-
		```
			#HADOOP ENVIRONMENT FILES
			export HADOOP_PREFIX=/home/student/DBDA/hadoop-2.8.5
			export HADOOP_HOME=/home/student/DBDA/hadoop-2.8.5
			export HADOOP_MAPRED_HOME=${HADOOP_HOME}
			export HADOOP_COMMON_HOME=${HADOOP_HOME}
			export HADOOP_HDFS_HOME=${HADOOP_HOME}
			export YARN_HOME=${HADOOP_HOME}
			export HADOOP_CONF_DIR=${HADOOP_HOME}/etc/hadoop

			#NATIVE PATH

			export HADOOP_COMMON_LIB_NATIVE_DIR=${HADOOP_PREFIX}/lib/native
			export HADOOP_OPTS="-Djava.library.path=$HADOOP_PREFIX/lib"
			export JAVA_HOME=/usr/lib/java/jdk-1.8.0_181

			#Add Hadoop bin/directory to PATH
			export PATH=$PATH:/home/student/DBDA/hadoop-2.8.5/bin
		```
	- ***Note :*** "JAVA_HOME", "PATH", "HADOOP_PREFIX", "HADOOP_HOME" differes from system to system. Please make sure to remember your system's path for hadoop and java. The following path variables caters to my personal system only.


### STEP-5 : Namenode Formatting
-
	```
		$ cd hadoop_home/bin
		~hadoop_home/bin$ hadoop namenode -format
	```
- If namenode formatting done properly you should get a "SHUTDOWN_MSG: * " message.
### STEP-6 : Starting dfs for the first time.
-
	```
		$ cd hadoop_home/sbin
		hadoop_home/sbin$ ./start-dfs.sh
	```
- ***NOTE :*** Enter system password 3 time if asked.
- ***NOTE*** For error Connection refused 22 : localhost not reachable.
	- ***Install "openssh"***
	-
		```
			$ sudo apt-get install openssh-client
		```
	- It's better if you create your own rsa. It's not compulsory.

### STEP-7 : Hadoop GUI
-	Open "localhost:50070" If Hadoop GUI visible hadoop is running.

### STEP-8 : To stop the hadoop from running.
-
	```
		$ cd hadoop/sbin
		hadoop/sbin$ ./stop-dfs.sh 
	```
- You have to enter system password three times for shutting down dfs.
