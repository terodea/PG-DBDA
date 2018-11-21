# INDEXES : 
Indexes support the efficient execution of queries in MongoDB. Without indexes, MongoDB must perform a collection scan, i.e. scan every document in a collection, to select those documents that match the query statement.
- General Syntax : 
```
    db.collection.createIndex( <key and index type specification>, <options> )
```
- Ex: The following example creates a single key descending index on the **name** field:
```
    db.collection.createIndex( { name: -1 } )
```
- ***NOTE*** : 
    - The db.collection.createIndex method only creates an index if an index of the same specification does not already exist.
    - MongoDB indexes use a B-tree data structure.

## Types Of Indexing Querry
- 
```
db.users.find({"age" : 21}).sort({"username" : -1})
```
- This is a point query, which searches for a single value. Due to the second field in the index, the results are already in the correct order for the sort: MongoDB can start with the last match for {"age" : 21}
-
```
db.users.find({"age" : {"$gte" : 21, "$lte" : 30}})
```
- This is a multi-value query, which looks for documents matching multiple values (in this case, all ages between 21 and 30). MongoDB will use the first key in the index, "age", to return the matching documents.
- 
```
db.users.find({"age" : {"$gte" : 21, "$lte" : 30}}).sort({"username" :1})
```
- This is a multi-value query, like the previous one, but this time it has a sort. However, the index doesn’t return the usernames in sorted order and the query requested that the results be sorted by username, so MongoDB has to sort the results in memory before returning them. Thus, this query is usually less efficient than the queries above.

-
```
db.employee.ensureIndex({"_id":1})
```
-
```
db.employee.ensureIndex({"FirstName":1})
```
