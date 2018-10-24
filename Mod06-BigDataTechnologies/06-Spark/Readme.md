# Spark

***Def :-*** Apache Spark is a fast and general-purpose cluster computing system. It provides high-level APIs in Java, Scala, Python and R, and an optimized engine that supports general execution graphs. It also supports a rich set of higher-level tools including Spark SQL for SQL and structured data processing, MLlib for machine learning, GraphX for graph processing, and Spark Streaming.

- Spark is an in-memory tool.
- Spark is used for processing not for storing data.
- Worker threads 
- Sparks become faster by reducing the number of write in/write out.

## Spark Components :
- RDD : Resilient Distribuited Dataset
	- Any data you will be having will be processed in RDD.
	- It is a fault tolerant dataset.
	- Dataset is broken down into partition. Each partition will be stored into memory.The dataset may or mayn't be in same node.
	- Spark can work even without HDFS. In that case where is the nodes ?
		- Spark creates it's own cluster.(Spark Cluster)
		- We may have a spark cluster running on YARN cluster, which is using DFS cluster.
		- It is also possible that all three clusters can be a part of single machine.
- DAG : Directed Acyclic Graph
- Lineage Graph : 


## Spark Structure :

- Driver Program
	- SparkContext : It acts as a scheduler(Job in Driver class).From the client side it is the only way to communicate with the client.Whenever you want to connect with spark you'll always need it.
- Cluster Manager : It can be replaced by any of the components which provides power of parallel computing.It is a co-ordinator.It knows the ins and outs of available resources.
	- It identifies which node should be given how much tasks.
- Worker Node : They are like daily wage workers.You have to tell them explicitly what they have to do.Once the task is finished destroyed from memory(like JVM).
	- Executor : It executes tasks, defined by SparkContext.
	- Cache
	- Task : One task will be executed on one partition.

## Spark Flow :

- Each application gets its own executor processes, which stay up for the duration of the whole application and run tasks in multiple threads.
- This has the benefit of isolating applications from each other, on both the scheduling side(each driver schedule its own tasks) and executor side (tasks from different applications run in different JVMs).
- However, it also means that data can't be shared across different Spark application(instances of SparkContext) without writing it to an external storage system.
- Spark is agnostic to the underlying cluster manager.As long as it can acquire executor processes, and these communicate with each other, it is relatively easy to run it even on a cluster manager that also supports other application.(e.g. MESOS).

-
	```
		// 'sc' is a 'SparkContext'- this transforms the file into an RDD
		val textFile = sc.textFile("README.md")
		
		//Return number of items(lines) in this RDD; count() is an action 
		textFile.count()
		
		//Demo filtering. Filter is a transform. By itself this does no real work 
		val linesWithSpark = textFile.filter(line => line.contains("Spark"))
		
		//Demo chaining - how many lines contains "Spark"? count()is an action
		textFile.filter(line => line.contains("Spark")).count();
		
		//length of line with most words. Reduce is an action.
		textFile.map(line => line.split("").size).reduce((a,b) => if(a>b)a else b)
		
		//word count - traditional map-reduce. collect() is an action
		val wordCounts = textFile.flatMap(line => line.split("")).map(word,1).reduceByKey((a,b) => a+b)
		wordCounts.collect()
	```
-
	```
		text_file = sc.textFile("hdfs://...")
		counts = text_file.flatMap(lambda line:line.split(" ")).map(lambda word:(word,1)).reduceByKey(lambda a,b: a + b)counts.saveAsTextFile("hdfs://...")
	```


## Transforamtion :

- Each of the process we're going to run on the data is called as transformation.
- Each transformation creates a new RDD.
- Sample Transforamtion:
	- map(func)
	- filter(func)
	- uniuon(otherDataset)
	- intersection(otherDataset)
	- distinct([numTasks])
	- join(otherDataset,[numTasks])

## Drawbacks :

- Less suitable for applications that make asynchronous fine-grained updates to shared data.
- RDDs are best suited for applications that apply the same operation to all elements of a dataset.