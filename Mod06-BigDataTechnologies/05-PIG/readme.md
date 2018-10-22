# PIG

***Definition :*** Framework for analyzing large un-structured and semi-structured data on top of Hadoop. <br>
	1. Pig engine parses, compiles Pig Latin scripts into MapReduce jobs run on top of Hadoop.<br>
	2. Pig Latin is declarative, SQL-like language; the high level language interface for Hadoop.<br>

```
	A = LOAD "file1" AS {x,yz};
	B = LOAD "file2" AS {t,u,v}:
	C = FILTER A by y > 0;
	D = JOIN C by x,B by u;
	E = GROUP D by z;
	f = FOREACH E GENERATE group,COUNT[D],STORE F INTO "output";
```

### MOTIVATION Of Using PIG

- 1. Faster Development

- 2. One Test: Find the top 5 words with most high frequency

```
	Lines = LOAD 'input/hadoop.log' AS (line:chararray);
	Words = FOREACH Lines GENERATE FLATTEN(TOKENIZE(line)) AS word;
	Groups = GROUP Words BY word;
	Counts = FOREACH Groups GENERATE group AS word, COUNT(Words) AS count;
	Results = ORDER Counts BY count DESC;
	Top5 = LIMIT Results 5;
	STORE Top5 INTO /output/top5words;
```

## Who uses Pig for What

- 70 % of production jobs at Yahoo <br>
- Twitter,Linkedln,Ebay,AOL,.... <br>
- Used to --> <br>
	- 1. Process web logs <br>
	- 2. Build user behavior model <br>
	- 3. Process images <br>
	- 4. Build maps of the web <br>
	- 5. Do research on large data sets <br>

## ACCESSING PIG

- Accessing approaches :
	- Batch Mode : submit a script directly
	- Interactive Mode : Grunt, the pig shell
	- PigServer Java class : a JDBC like interface
- Execution Mode :
	- Local mode: pig -x local
	- MapReduce mode : pig -x mapreduce (by default)

## DATA TYPES

- Scalar Types :
	- Int, Long, float, double, boolean, null, chararray, bytearray;

- Complex types : fields, tuples, bags, relations;
	- A Field is a piece of data.
	- A Tuple is an ordered set of fields.
	- A Bag is a collection of tuples.
	- A Realtion is a bag.

- Samples: 
	- Tuple: Row in Database
		```
			(0002576169, Toc, 20, 4.0)
		```
	- Bag: Table or View in Database
		```
			{(0002576169, Akshay, 20, 4.0),(0002576169, Pratik, 20, 4.0),(0002576169, Niranjan, 20, 4.0)}
		```

## PIG OPERATIONS

- Pig Data Loader
	-PigStorage: loads/stores relations using field-delimeter text format
	-Ex : 
		```students = load();
		```
- Foreach ... Generate
	- The Foreach... Generate statement iterates over the members of a bag
		```
			studentid = FOREACH students GENERATE studentid, name;
		```
	- The result of a Foreach is another bag
	- Elements are named as in the input bag

- Positional References:
	- Fields are refered to by positional notation or by name(alias).
		```
			students = LOAD '\students.txt' USING PigStorage() AS (name : chararray,age:int,gps:float);
			DUMP A;
		```
- Group:
	- The GROUP and COGROUP
- DUMP:
	- display output results, will always triger exection
- STORE:
	
- COUNT:
```
	student = ORDER students BY gpa DESC;
``` 


# How to run Pig Latin scripts ?
- Local Mode
	-
- MapReduce Mode
- Batch Mode
	- Pig -x local my_pig_script.pig
	- Pig -x mapreduce my_pig_script.pig
- Interactive Mode: use the Pig shell to run script