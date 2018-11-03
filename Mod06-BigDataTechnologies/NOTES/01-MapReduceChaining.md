# Chaining MapReduce Jobs

## Why Chaining of MapReduce jobs is required ?
- When a single Mapper fails to accomplish the desied job we need chaining of MapReduce
- When we need to work on multiple data sets. i.e passing different data sets to different mapper.

## But what is chaining ?
- Though you can execute the two jobs manually one after the other, it’s more convenient to automate the execution sequence. You can chain MapReduce jobs to run sequentially, with the output of one MapReduce job being the input to the next.
- Chaining is analogous to pipes in Unix
    - MapReduce1 | MapReduce2  | MapReduce 3 ....

## Chaining MapReduce jobs with complex dependency
- Sometimes the subtasks of a complex data processing task don’t run sequentially, and their MapReduce jobs are therefore not chained in a linear fashion. For example, mapreduce1 may process one data set while mapreduce2 independently processes another data set. The third job, mapreduce3, performs an inner join of the first two jobs’ output. (We’ll discuss data joining in the next sections.) It’s dependent on the other two and can execute only after both mapreduce1 and mapreduce2 are completed. But mapreduce1 and mapreduce2 aren’t dependent on each other.
- For job objects x and y; x will not start until y has finished.
    ```
        x.addDependingJob(y)
    ```
## Chaining preprocessing and postprocessing steps
