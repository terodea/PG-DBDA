# DAY-1 MongoDB
# CREATING COLLECTIONS IN MongoDB
#### Insert one document at a time.
- db.collections.insertOne(): Insert a single document into a collection.
- General Syntax: 
```
db.collection.insertOne(
   <document>,
   {
      writeConcern: <document>
   }
)
```
-- General Syntax: 
```
try{
    db.collection.insertOne(
    <document>,
    {
        writeConcern: <document>
    });
}catch(e){
    print(e);
}
```
-
| Parameter   |      Type      |  Description |
|----------|:-------------:|------:|
| **document** |  *document*   | An array of documents to insert into the collection.(analogous to row in RDBMS) |
| **writeConcern** |    *document*   |   Optional. A document expressing the write concern. Omit to use the default write concern. |
- Example: Insert Document without Specifying an _id Field.
```
try{
    db.employee.insertOne({
        "EmployeeID": 1,
        "LastName": "Davolio",
        "FirstName": "Nancy",
        "Title": "Sales Representative",
        "TitleOfCourtesy": "Ms.",
        "BirthDate": "1948-12-08 00:00:00.000",
        "HireDate": "1992-05-01 00:00:00.000",
        "Address": "507 - 20th Ave. E.",
    });
}catch(e){
    print(e);
}
```
- Example: Insert Document Specifying an _id Field.
```
try{
    db.employee.insertOne({
        "_id_": 1,
        "LastName": "Davolio",
        "FirstName": "Nancy",
        "Title": "Sales Representative",
        "TitleOfCourtesy": "Ms.",
        "BirthDate": "1948-12-08 00:00:00.000",
        "HireDate": "1992-05-01 00:00:00.000",
        "Address": "507 - 20th Ave. E.",
    });
}catch(e){
    print(e);
}
```
- ***NOTE : *** "_id" should be unique to avoid keyerror.

#### Insert many documents at a time.
- db.collection.insertMany(): Inserts multiple documents into a collection.
- Inserting a document can be done in two ways :
    - Insert Several Document without Specifying an _id Field.
    - Insert Several Document Specifying an _id Field.
- General Syntax:
```
    db.collection.insertMany(
    [ <document 1> , <document 2>, ... ],
    {
        writeConcern: <document>,
        ordered: <boolean>
    }
    )
```
- Making querries handling exception
-
```
try{
    db.collection.insertMany(
        [ <document 1> , <document 2>, ... ],
        {
            writeConcern: <document>,
            ordered: <boolean>}
        );
}catch(e){
    print(e);
}
```
- 
| Parameter   |      Type      |  Description |
|----------|:-------------:|------:|
| **document** |  *document*   | An array of documents to insert into the collection.(analogous to row in RDBMS) |
| **writeConcern** |    *document*   |   Optional. A document expressing the write concern. Omit to use the default write concern. |
| **ordered** | *boolean* |    Optional. A boolean specifying whether the mongod instance should perform an ordered or unordered insert. Defaults to true. |
-
    ```
        db.employee.insertMany([{
            "_id": 1,
            "LastName": "Davolio",
            "FirstName": "Nancy",
            "Title": "Sales Representative",
            "TitleOfCourtesy": "Ms.",
            "BirthDate": "1948-12-08 00:00:00.000",
            "HireDate": "1992-05-01 00:00:00.000",
            "Address": "507 - 20th Ave. E.",
        },
        {
            "_id": 2,
            "LastName": "Fuller",
            "FirstName": "Andrew",
            "Title": "Vice President",
            "TitleOfCourtesy": "Dr.",
            "BirthDate": "19/02/52 00:00",
            "HireDate": "1992-08-14 00:00:00.000",
            "Address": "908 W. Capital Way",
            "Region": "Tacoma",
            "PostalCode": "WA",
            "Country": "USA",
            "HomePhone": "(206) 555-9482",
            "Extension": 98401,
            "Photo": "0x151C2F00020000000D000E0014002100FFFFFFFF4269746D617020496D616765005061696E742E506963747572650001050000020000000700000050427275736800000000000000000020540000424D20540000000000007600000028000000C0000000DF0000000100040000000000A0530000CE0E0000D80E00000000003457",
            "Notes": "Andrew received his BTS commercial in 1974 and a Ph.D. in international marketing from the University of Dallas in 1981.  He is fluent in French and Italian and reads German.  He joined the company as a sales representative  was promoted to sales manager i",
            "PhotoPath": "http://accweb/emmployees/fuller.bmp"
        },
        {
            "_id": 3,
            "LastName": "Leverling",
            "FirstName": "Janet",
            "Title": "Sales Representative",
            "TitleOfCourtesy": "Ms.",
            "BirthDate": "1963-08-30 00:00:00.000",
            "HireDate": "1992-04-01 00:00:00.000",
            "Address": "722 Moss Bay Blvd.",
            "City": "Kirkland",
            "Region": "WA",
            "PostalCode": 98033,
            "Country": "USA",
            "HomePhone": "(206) 555-3412",
            "Extension": 3355,
            "Photo": "0x151C2F00020000000D000E0014002100FFFFFFFF4269746D617020496D616765005061696E742E506963747572650001050000020000000700000050427275736800000000000000000080540000424D80540000000000007600000028000000C0000000E0000000010004000000000000540000CE0E0000D80E0000000000",
            "Notes": "Janet has a BS degree in chemistry from Boston College (1984).  She has also completed a certificate program in food retailing management.  Janet was hired as a sales associate in 1991 and promoted to sales representative in February 1992.",
            "ReportsTo": 2,
            "PhotoPath": "http://accweb/emmployees/leverling.bmp"
        },
        {
            "_id": 4,
            "LastName": "Peacock",
            "FirstName": "Margaret",
            "Title": "Sales Representative",
            "TitleOfCourtesy": "Mrs.",
            "BirthDate": "1937-09-19 00:00:00.000",
            "HireDate": "1993-05-03 00:00:00.000",
            "Address": "4110 Old Redmond Rd.",
            "City": "Redmond",
            "Region": "WA",
            "PostalCode": 98052,
            "Country": "USA",
            "HomePhone": "(206) 555-8122",
            "Extension": 5176,
            "Photo": "0x151C2F00020000000D000E0014002100FFFFFFFF4269746D617020496D616765005061696E742E506963747572650001050000020000000700000050427275736800000000000000000020540000424D20540000000000007600000028000000C0000000DF0000000100040000000000A0530000CE0E0000D80E0000000000",
            "Notes": "Margaret holds a BA in English literature from Concordia College (1958) and an MA from the American Institute of Culinary Arts (1966).  She was assigned to the London office temporarily from July through November 1992.",
            "ReportsTo": 2,
            "PhotoPath": "http://accweb/emmployees/peacock.bmp"
        },
        {
            "_id": 5,
            "LastName": "Buchanan",
            "FirstName": "Steven",
            "Title": "Sales Manager",
            "TitleOfCourtesy": "Mr.",
            "BirthDate": "1955-03-04 00:00:00.000",
            "HireDate": "1993-10-17 00:00:00.000",
            "Address": "14 Garrett Hill",
            "City": "London",
            "Region": "NULL",
            "PostalCode": "SW1 8JR",
            "Country": "UK",
            "HomePhone": "(71) 555-4848",
            "Extension": 3453,
            "Photo": "0x151C2F00020000000D000E0014002100FFFFFFFF4269746D617020496D616765005061696E742E506963747572650001050000020000000700000050427275736800000000000000000020540000424D20540000000000007600000028000000C0000000DF0000000100040000000000A0530000CE0E0000D80E0000000000",
            "Notes": "Steven Buchanan graduated from St. Andrews University  with a BSC degree in 1976.  Upon joining the company as a sales representative in 1992  he spent 6 months in an orientation program at the Seattle office and then returned to his permanent po  Scotland",
            "ReportsTo": 2,
            "PhotoPath": "http://accweb/emmployees/buchanan.bmp"
        },
        {
            "_id": 6,
            "LastName": "Suyama",
            "FirstName": "Michael",
            "Title": "Sales Representative",
            "TitleOfCourtesy": "Mr.",
            "BirthDate": "1963-07-02 00:00:00.000",
            "HireDate": "1993-10-17 00:00:00.000",
            "Address": "Coventry House",
        },
        {
            "_id": 7,
            "LastName": "King",
            "FirstName": "Robert",
            "Title": "Sales Representative",
            "TitleOfCourtesy": "Mr.",
            "BirthDate": "1960-05-29 00:00:00.000",
            "HireDate": "1994-01-02 00:00:00.000",
            "Address": "Edgeham Hollow",
        }
    ])
    ```
## Running Querries
1. SELECT * from employee;
-
    ```
        db.employee.find()
    ```
2. SELECT * from employee WHERE Title = 'Sales Representative'
-
    ```
        db.employee.find({"Title":"Sales Representative"})
    ```
3. SELECT * FROM employee WHERE Title = 'Sales Represntative' AND LastName='Suyama'
-
    ```
        db.employee.find({"Title":"Sales Represntative" && "LastName":"Suyama"})
    ```
-
    ```
        db.employee.find({"Title":"Sales Represntative","LastName":"Suyama"})
    ```
4. SELECT FirstName FROM employee
-
    ```
        db.employee.find({},{FirstName:true})
    ```
-
    ```
        db.employee.find({},{FirstName:1})
    ```
5. SELECT FirstName, LastName FROM employee
-
    ```
        db.employee.find({},{FirstName:true,LastName:true,_id:false})
    ```
6. SELECT * FROM employee WHERE Extension between 3000 and 9000
-
    ```
        db.employee.find({"Extension":{$gt:3000,$lt:9000},{})
    ```
# SECOND HALF
-
    ```        
        db.employee.update({"_id":1},{$set : {"TerritoryID":["6897","19713"]}})
        db.employee.update({"_id":2},{$set : {"TerritoryID":["1581","1730","1833","2116","2139","2184"]}})
        db.employee.update({"_id":3},{$set : {"TerritoryID":["30346","31406","32859","33607"]}})
        db.employee.update({"_id":4},{$set : {"TerritoryID":["20852","27403","27511"]}})
        db.employee.update({"_id":5},{$set : {"TerritoryID":["2903","7960","8837","10019","10038","11747","14450"]}})
        db.employee.update({"_id":6},{$set : {"TerritoryID":["85014","85251","98004","98052","98104"]}})
        db.employee.update({"_id":7},{$set : {"TerritoryID":["60179","60601","80202","80909","90405","94025","94105","95008","95054","95060"]}})
        db.employee.update({"_id":8},{$set : {"TerritoryID":["19428","44122","45839","53404"]}},{upsert:true})
        db.employee.update({"_id":9},{$set : {"TerritoryID":["3801","3049","48075","48084","48304","55113","55439"]}},{upsert:true})
    ```