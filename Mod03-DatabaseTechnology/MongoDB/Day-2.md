# Array
## Array Operations
When you update in an Array it is replace(UPSERT).
Whereas in Document it is append.if value already exists and UPSERT when value doesn't exists.

- Update at 0'th position
```
db.employee.update({TerritoryID:"6897"},{$set:{"TerritoryID.0":{"TerritoryID": "06897", "TerritoryDescription": "Wilton","RegionID": 1}}})
```
- Update at position WHERE 6897 exists
```
db.employee.update({TerritoryID:"6897"},{$set:{"TerritoryID.0":{"TerritoryID": "06897", "TerritoryDescription": "Wilton","RegionID": 1}}})
```
- Update at position WHERE 1730 exists
```
    db.employee.update({TerritoryID:"1730"},{$set:{"TerritoryID.$":{"TerritoryID": "01730","TerritoryDescription": "Bedford","RegionID": 1}}})
```

- Update at position WHERE 32859 exists
```
    db.employee.update({TerritoryID:"32859"},{$set:{"TerritoryID.$":{"TerritoryID": 32859,"TerritoryDescription": "Orlando","RegionID": 4}}})
```
- Update at position WHERE 3801 exists 
```
    db.employee.update({TerritoryID:"3801"},{$set:{"TerritoryID.$":{"TerritoryID": "03801","TerritoryDescription": "Portsmouth","RegionID": 3}}})
```
- 19428
```
    db.employee.update({TerritoryID:"19428"},{$set:{"TerritoryID.$":{"TerritoryID": 19428,"TerritoryDescription": "Philadelphia","RegionID": 3}}})
```
- 60179
```
    db.employee.update({TerritoryID:"60179"},{$set:{"TerritoryID.$":{"TerritoryID": 60179,"TerritoryDescription": "HoffmanEstates","RegionID": 2}}})
```
- 85014
```
    db.employee.update({TerritoryID:"85014"},{$set:{"TerritoryID.$":{"TerritoryID": 85014,"TerritoryDescription": "Phoenix","RegionID": 2}}})
```
- 2903
```
    db.employee.update({TerritoryID:"2903"},{$set:{"TerritoryID.$":{"TerritoryID": "02903","TerritoryDescription": "Providence","RegionID": 1}}})
```
- 20852
```
    db.employee.update({TerritoryID:"20852"},{$set:{"TerritoryID.$":{"TerritoryID": 20852,"TerritoryDescription": "Rockville","RegionID": 1}}})
```
## Update Documents Inside an Array
- The positional $ operator facilitates updates to arrays that contain embedded documents. Use the positional $ operator to access the fields in the embedded documents with the dot notation on the $ operator.
- 
```
    db.collection.update(
        { <query selector> },
        { <update operator>: { "array.$.field" : value }})
```
- Updating Array Element inside a MultipleCollection .ie. Updating RegionID inside TerritoryID.The 
```
    db.employee.update({"TerritoryID.TerritoryID":"06897"},{$set: {"TerritoryID.$.RegionID" : {"RegionID": 1,"RegionDescription": "Eastern"}}})
```
## Update Embedded Documents Using Multiple Field Matches

## Deleting Key
-
    ```
        db.collection.update({"_id":1},{$unset:{Name:"Akshay"}})
    ```

## Capped Collection
-
    ```
        db.createCollection("testEmployee",{capped:true,size:4096,max : 2})
    ```