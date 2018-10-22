# PIG

***Definition :*** Framework for analyzing large un-structured and semi-structured data on top of Hadoop. <br>
	1. Pig engine parses, compiles Pig Latin scripts into MapReduce jobs run on top of Hadoop.
	2. Pig Latin is declarative, SQL-like language; the high level language interface for Hadoop.

```
	A = LOAD "file1" AS {x,yz};
	B = LOAD "file2" AS {t,u,v}:
	C = FILTER A by y > 0;
	D = JOIN C by x,B by u;
	E = GROUP D by z;
	f = FOREACH E GENERATE group,COUNT[D],STORE F INTO "output";
```

### MOTIVATION Of Using PIG

1. Faster Development

2. One Test: Find the top 5 words with most high frequency

```
	Lines = LOAD 'input/hadoop.log' AS (line:chararray);
	Words = FOREACH Lines GENERATE FLATTEN(TOKENIZE(line)) AS word;
	Groups = GROUP Words BY word;
	Counts = FOREACH Groups GENERATE group, COUNT(Words);
	Results = ORDER Words BY Counts DESC;
	Top5 = LIMIT Results 5;
	STORE Top5 INTO /output/top5words;
```