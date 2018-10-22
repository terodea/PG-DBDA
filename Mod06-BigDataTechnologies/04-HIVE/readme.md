# HIVE
@ Author AKSHAY TERODE

## STEPS to configure HIVE


### STEP 1 --> COPY and RENAME "hive-default.xml.template" as "hive-site.xml"


### STEP 2 --> COPY AND RENAME "hive-env.sh.template" ad "hive-env.sh"
		Add export HADOOP_HOME=/home/student/DBDA/hadoop-2.8.5
			export PATH=$PATH:$HADOOP_HOME/bin
		Hive Configuration Directory can be controlled by:
			export HIVE_CONF_DIR=/home/student/DBDA/apache-hive-2.3.3-bin/conf;

### STEP 3 --> set hive_home in .bashrc



### STEP 4 --> /apache-hive-2.3.3-bin/bin ./hive



***ERROR*** ---> 

1. Exception in thread "main" java.lang.IllegalArgumentException: java.net.URISyntaxException: Relative path in absolute URI: ${system:java.io.tmpdir%7D/$%7Bsystem:user.name%7D


***Add ----> hive-site.xml***<br>
```markdown
<property>
	<name>system:java.io.tmpdir</name>
    <value>/tmp/hive/java</value>
</property>
<property>
	<name>system:user.name</name>
    <value>${user.name}</value>
</property>
```
2. 
	```Shell
	rm -rf $HIVE_HOME/bin/metastore_db
	$HIVE_HOME/bin/schematool -initSchema -dbType derbys
	```

