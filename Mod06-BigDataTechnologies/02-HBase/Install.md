# HBase

## Setting up HBase for the first time

#### Step 1 :- Download Hbase and extract it.
- 
	```
		tar -xvf [ hbase-version-bin.tar.gz ]
	```
- 
	```
		tar -xvf hbase-2.1.0-bin.tar.gz
	```

#### Step 2 :- Move "hbase-version-bin" folder to desired location.
- 
	```
		mv [hbase-version-bin]/* /[absolute-path]
	```

-
	```
		mv hbase-2.1.0/* /home/student/BigData/HBase
	```

#### Step 3 :- Configuring Hbase

- Edit the "hbase-env.sh" file in 'hbase/conf' dir
	```
		cd HBase/conf
		sudo gedit hbase-env.sh
	```
- Add {JAVA_HOME}
	```
		export JAVA_HOME = [/java-setup-location]
	```
	-
		```
			export JAVA_HOME=/usr/lib/jvm/java-1.7.0
		```

#### Step 4 :- Configuring Hbase
-Edit the "hbase-site.xml" file in 'hbase/conf' dir
```
	<configuration>
		<property>
			<name>hbase.rootdir</name>
			<value>hdfs://localhost:9000/hbase</value>
		</property>
		<property>
			<name>dfs.replication</name>
			<value>1</value>
		</property>
		<property>
			<name>hbase.zookeper.property.dataDir</name>
			<value>/home/student/DBDA/hbase-2.1.0/hbase_dataDir</value>
		</property>
		<property>
			<name>hbase.zookeeper.property.clientPort</name>
			<value>2181</value>
			<description>Property from ZooKeeper's config zoo.cfg</description>
		</property>
		<property>
			<name>hbase.zookeeper.quorum</name>
			<value>localhost</value>
			<description> </description>
		</property>
		<property>
			<name>hbase.cluster.distributed</name>
			<value>true</value>
			<description></description>
		</property>
	</configuration>
```
- ***Note*** You have to make a directory "/home/student/DBDA/hbase-2.1.0/hbase_dataDir".
