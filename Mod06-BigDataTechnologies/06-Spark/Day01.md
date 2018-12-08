# Day 1

- First Code run on pyspark

- Start the pyspark shell

```python

lines=sc.textFile("/Weather.csv")
lines.count()
lines.first()

```