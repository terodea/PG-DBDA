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
	Counts = FOREACH Groups GENERATE group, COUNT(Words);
	Results = ORDER Words BY Counts DESC;
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