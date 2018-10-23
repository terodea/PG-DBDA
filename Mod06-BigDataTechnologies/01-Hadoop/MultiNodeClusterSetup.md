# Multi Node Cluster Setup In HADOOP

***NOTE : *** 
- Minimum two systems required.
- JAVA setup in both systems(JAVA_HOME should be same in all the systems)
- Master should have Hadoop Configured slaves need not have Hadoop configured.
- Make sue that HDFS is not running or stopped "./stop-dfs".
- Take backup of "Hadoop_Home" of all (both master and slaves).



### Step 1:- Creation of new user 
```
	$ adduser admin
	$ passwd admin
```

### Step 2:- Change user to new user
```
	$ whoami
	$ su secondUser
		Password:
```

### Step 3:- Change Hosts mapping
```
	$ sudo gedit /etc/hosts
```
- Add the ip address and names for each of the machines in network.
- Eg: 
	```
		172.25.12.178 master-system-name
		172.25.12.188 slave-system-name
	```
### Step 4:- Generating Public Key (On the master)
- ****Step 1:-**** Create public key
	- 
		```
			$ ssh-keygen -t rsa
		```
	- Press "ENTER" for all the values (let it be default)
	- Don't forget to copy the ".pub" file name path and passkey(Enter for default)

- ****Step 2:-**** Copy public key on all datanode machines
	-
		```
			$ ssh-copy-id -i <path-to-.pub-file> admin@slave
		```
	- Ex : 
		```
			$ ssh-copy-id -i /home/student/.ssh/id_rsa student@DBDA-L14
		```

- ****Step 3:-**** Change the mod of the keys repository 
	- Giving Permission to "Owner for read(R) and write(W)"
	-
		```
			$ sudo chmod 0600 ~/.shh/authorized_keys
		```
	- You have to obtain super user access on master for this step.

### Step 5:- Download Hadoop (On master)
- Don't download if you already have one; but don't forget to keep the backup of hadoop

### Step 6:- Configure Hadoop (On master)

- Configure "core-site.xml"
	-
		```
			<property>
				<name>fs.default.name</name>
				<value>hdfs://hadoop-master-ip:9000/</value>
			</property>
			<property>
				<name>dfs.permissions</name>
				<value>false</value>
			</property>
		```

- Configure "hdfs-site.xml"
	-
		```
			<property>
				<name>dfs.data.dir</name>
				<value>/home/student/hadoop/dfs/data</value>
				<final>true</final>
			</property>
			<property>
				<name>dfs.name.dir</name>
				<value>/home/student/hadoop/dfs/name</value>
				<final>true</final>
			<property>
				<name>dfs.replication</name>
				<value>1</value>
			</property>
		```
- Configure "mapred-site.xml"
	- 
		```
			<property>
				<name>mapred.job.tracker</name>
				<value>hadoop-master-ip:9001</value>
			</property>
		```
### Step 7:- Copy Hadoop from master to all datanodes
- 
	```
		$ scp -r $HADOOP_HOME slave:/path/to/copy
	```
-
	```
		$ scp -r $HADOOP_HOME DBDA-L10:/home/student/Hadoop_Home/hadoop-2.8.5
	```
### Step 8:- Add datanodes on master
- Add the names of all hosts that are going to act as datanodes.
	```
		$ sudo gedit $HADOOP_HOME/etc/hadoop/slaves
	```

### Step 9:- Format namenode (Master only)
- 
	```
		$ cd $Hadoop_Home/bin
		$ hadoop namenode -format
	```
- It might as for (yes/no) option. Enter 'yes'.

### Step 10:- Start HDFS 
-
	```
		$ cd $Hadoop_Home/sbin
		$ ./start-dfs.sh
	```