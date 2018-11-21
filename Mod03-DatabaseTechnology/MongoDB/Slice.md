# $slice (aggregation)
***$slice*** Returns a subset of an array.
#### $slice within db.collection.aggregate()
- The following syntax returns elements from either the start or end of the array: 
```
db.collection.aggregate([
    {criteria,{ $slice: [ <array>, <n> ] }}
    ])
```
- The following syntax returns elements from the specified position in the array:
```
db.collection.aggregate([
    {criteria,{ $slice: [ <array>, <position>, <n> ] }}
    ])
```
- Example:
```
{ $slice: [ [ 1, 2, 3 ], 1, 1 ] }	
O/P ----> [ 2 ]
{ $slice: [ [ 1, 2, 3 ], -2 ] }	
O/P ----> [ 2, 3 ]
{ $slice: [ [ 1, 2, 3 ], 15, 2 ] }	
O/P ----> [  ]
{ $slice: [ [ 1, 2, 3 ], -15, 2 ] }	
O/P ----> [ 1, 2 ]
```
- Our **employee** collection looks like these
```
{
	"_id" : 1,
	"LastName" : "Davolio",
	"FirstName" : "Nancy",
	"Title" : "Sales Representative",
	"TitleOfCourtesy" : "Ms.",
	"BirthDate" : "1948-12-08 00:00:00.000",
	"HireDate" : "1992-05-01 00:00:00.000",
	"Address" : "507 - 20th Ave. E.",
	"City" : "",
	"Region" : "",
	"PostalCode" : "",
	"Country" : "",
	"HomePhone" : "",
	"Extension" : "",
	"Photo" : "",
	"Notes" : "",
	"ReportsTo" : "",
	"PhotoPath" : "",
	"TerritoryID" : [
		{
			"TerritoryID" : "06897",
			"TerritoryDescription" : "Wilton",
			"RegionID" : {
				"RegionID" : 1,
				"RegionDescription" : "Eastern"
			}
		},
		"19713"
	]
}
```

- The following example returns at most the first two elements in the TerritoryID array for each user:
```
db.employee.aggregate([ {$project: {"LastName":1, test :{$slice :["$TerritoryID",2]}}} ]).pretty()
```
- O/p
```
{
	"_id" : 1,
	"test" : [
		{
			"TerritoryID" : "06897",
			"TerritoryDescription" : "Wilton",
			"RegionID" : {
				"RegionID" : 1,
				"RegionDescription" : "Eastern"
			}
		}
	]
}
{ "_id" : 2, "test" : [ "1581" ] }
{ "_id" : 3, "test" : [ "30346" ] }
{
	"_id" : 4,
	"test" : [
		{
			"TerritoryID" : 20852,
			"TerritoryDescription" : "Rockville",
			"RegionID" : 1
		}
	]
}
{
	"_id" : 5,
	"test" : [
		{
			"TerritoryID" : "02903",
			"TerritoryDescription" : "Providence",
			"RegionID" : 1
		}
	]
}
{
	"_id" : 6,
	"test" : [
		{
			"TerritoryID" : 85014,
			"TerritoryDescription" : "Phoenix",
			"RegionID" : 2
		}
	]
}
{
	"_id" : 7,
	"test" : [
		{
			"TerritoryID" : 60179,
			"TerritoryDescription" : "HoffmanEstates",
			"RegionID" : 2
		}
	]
}
{
	"_id" : 8,
	"test" : [
		{
			"TerritoryID" : 19428,
			"TerritoryDescription" : "Philadelphia",
			"RegionID" : 3
		}
	]
}
{
	"_id" : 9,
	"test" : [
		{
			"TerritoryID" : "03801",
			"TerritoryDescription" : "Portsmouth",
			"RegionID" : 3
		}
	]
}
```

# $slice (projection)
- General Syntax : This operation selects the document collection identified by a field named field that holds value and returns the number of elements specified by the value of count from the array stored in the array field. If count has a value greater than the number of elements in array the query returns all elements of the array.
```
db.collection.find( 
    { field: value }, { array: {$slice: count } } 
    );
```
- **count** can accept +ve,-ve values also array [ skip , limit ].
- 
- 
```
db.employee.find({},{"TerritoryID":{$slice:2}}).pretty()
```
- O/p
```
{
	"_id" : 1,
	"test" : [
		{
			"TerritoryID" : "06897",
			"TerritoryDescription" : "Wilton",
			"RegionID" : {
				"RegionID" : 1,
				"RegionDescription" : "Eastern"
			}
		}
	]
}
{ "_id" : 2, "test" : [ "1581" ] }
{ "_id" : 3, "test" : [ "30346" ] }
{
	"_id" : 4,
	"test" : [
		{
			"TerritoryID" : 20852,
			"TerritoryDescription" : "Rockville",
			"RegionID" : 1
		}
	]
}
{
	"_id" : 5,
	"test" : [
		{
			"TerritoryID" : "02903",
			"TerritoryDescription" : "Providence",
			"RegionID" : 1
		}
	]
}
{
	"_id" : 6,
	"test" : [
		{
			"TerritoryID" : 85014,
			"TerritoryDescription" : "Phoenix",
			"RegionID" : 2
		}
	]
}
{
	"_id" : 7,
	"test" : [
		{
			"TerritoryID" : 60179,
			"TerritoryDescription" : "HoffmanEstates",
			"RegionID" : 2
		}
	]
}
{
	"_id" : 8,
	"test" : [
		{
			"TerritoryID" : 19428,
			"TerritoryDescription" : "Philadelphia",
			"RegionID" : 3
		}
	]
}
{
	"_id" : 9,
	"test" : [
		{
			"TerritoryID" : "03801",
			"TerritoryDescription" : "Portsmouth",
			"RegionID" : 3
		}
	]
}
```