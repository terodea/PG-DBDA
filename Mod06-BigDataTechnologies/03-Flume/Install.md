## FLUME


### Setting Up FLUME for the first time.

## Step 1 :- Create Twitter app.
- Go to "developer.twitter.com"
- Develop a twitter app.
- If all done well you will get tokens and id of your own.

## Step 2 :- Create Agent.conf file
-
    ```
        #flume.conf
        TwitterAgent.sources= Twitter
        TwitterAgent.channels= MemChannel
        TwitterAgent.sinks = HDFS

        TwitterAgent.sources.Twitter.type = org.apache.flume.source.twitter.TwitterSource
        TwitterAgent.sources.Twitter.channels = MemChannel
        TwitterAgent.sources.Twitter.consumerKey = ivtTgw3ZxoRcsMiOYXjoYbhee  
        TwitterAgent.sources.Twitter.consumerSecret = neJtq77GIPSQc3bXzyzOKR1kNN0jEAluhnB7ll9O0lRxMVIA2M
        TwitterAgent.sources.Twitter.accessToken = 1052122006467031040-O1VStj7ioXcWpwSzU5Re5THW85yf5i
        TwitterAgent.sources.Twitter.accessTokenSecret = A1gif2rP27Al8racVjccHM4Pu4O6xwRsZBIIgjyGJ1R7j 
        TwitterAgent.sources.Twitter.keywords = MeToo

        TwitterAgent.sinks.HDFS.channel = MemChannel
        TwitterAgent.sinks.HDFS.type = hdfs
        TwitterAgent.sinks.HDFS.hdfs.path = hdfs://localhost:9000/home/student/DBDA/apache-flume-1.8.0-bin/flume/tweets/
        TwitterAgent.sinks.HDFS.hdfs.fileType = DataStream
        TwitterAgent.sinks.HDFS.hdfs.writeFormat = Text
        TwitterAgent.sinks.HDFS.hdfs.batchSize = 1000
        TwitterAgent.sinks.HDFS.hdfs.rollSize = 0
        TwitterAgent.sinks.HDFS.hdfs.rollCount = 1000

        TwitterAgent.channels.MemChannel.type = memory
        TwitterAgent.channels.MemChannel.capacity = 1000
        TwitterAgent.channels.MemChannel.transactionCapacity = 100
    ```
- ***Note :*** 
    - You should explicitly create "/home/student/DBDA/apache-flume-1.8.0-bin/flume/tweets/"
    - You get "consumerKey", "consumerSecret", "accessToken", "accessTokenSecret" from the app you created.
    - "keywords" is the value you are searching for.
    - You can select sources, channel, sinks on user requirements there are various options available.
## Step 3 :- Running Your Flume Agent
-
    ```
        $ cd /Desktop/BigData/apache-flume-1.8.0-bin/bin
        /Desktop/BigData/apache-flume-1.8.0-bin/bin$ ./flume-ng agent -f ../conf/flumetwitter.conf -n TwitterAgent
    ```
- If all goes well you should see dataset being created in your desired location.