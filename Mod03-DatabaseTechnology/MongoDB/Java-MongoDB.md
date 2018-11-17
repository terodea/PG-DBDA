# JAVA Code for MongoDB
### MongoDB Connection
-
```
    import org.bson.Document;

    import com.mongodb.MongoClient;
    import com.mongodb.client.FindIterable;
    import com.mongodb.client.MongoCollection;

    public class MongoConnect {

        public static void main(String[] args) {
            MongoClient client = new MongoClient("localhost", 27017);
            MongoCollection<Document> collection = client.getDatabase("test").getCollection("employee");
            FindIterable<Document> document = collection.find();
            for (Document document2 : document) {
                System.out.println(document2.toJson());
            }
        }
    }
```
### JAVA code for collections
- 
    ```
        import com.mongodb.MongoClient;
        import com.mongodb.MongoCredential;
        import com.mongodb.client.MongoDatabase;

        public class CreatingCollection {

            public static void main(String[] args) {
                //Creating a Mongo client
                MongoClient mongo = new MongoClient("localhost",27017);
                
                //Creating Credentials
                MongoCredential credential = MongoCredential.createCredential("sampleUser", "myDb", "password".toCharArray());
                System.out.println("Connected to database successfully");
                
                //Accessing the Database
                MongoDatabase database = mongo.getDatabase("myDb");
                
                //Creating a Collection
                database.createCollection("sampleCollection");
                System.out.println("Collection created successfully");
            }

        }

    ```
### Selecting Collections
- 
    ```
        import org.bson.Document;

        import com.mongodb.MongoClient;
        import com.mongodb.MongoCredential;
        import com.mongodb.client.MongoDatabase;
        import com.mongodb.client.MongoCollection;

        public class selectingCollection {
            public static void main(String args[]) {
                // Creating mongo client
                MongoClient mongo = new MongoClient("localhost",27017);
                
                //Creating Credentials
                MongoCredential credentials = MongoCredential.createCredential("sampleUser", "myDb", "password".toCharArray());
                System.out.println("Connected to the database successfully");
                
                //Accessing the database
                MongoDatabase database = mongo.getDatabase("myDb");
                
                // Creating a collection 
                System.out.println("Collection created successfully"); 

                // Retieving a collection
                MongoCollection<Document> collection = database.getCollection("myCollection"); 
                System.out.println("Collection myCollection selected successfully");
            }
        }
    ```
### Inserting Documents
-
 ```
    import com.mongodb.client.MongoCollection; 
    import com.mongodb.client.MongoDatabase; 

    import org.bson.Document;  
    import com.mongodb.MongoClient; 
    import com.mongodb.MongoCredential;  

    public class InsertingDocument { 
    
    public static void main( String args[] ) {  
        
        // Creating a Mongo client 
        MongoClient mongo = new MongoClient( "localhost" , 27017 ); 

        // Creating Credentials 
        MongoCredential credential; 
        credential = MongoCredential.createCredential("sampleUser", "myDb", 
            "password".toCharArray()); 
        System.out.println("Connected to the database successfully");  
        
        // Accessing the database 
        MongoDatabase database = mongo.getDatabase("myDb"); 

        // Retrieving a collection
        MongoCollection<Document> collection = database.getCollection("sampleCollection"); 
        System.out.println("Collection sampleCollection selected successfully");

        Document document = new Document("title", "MongoDB") 
        .append("id", 1)
        .append("description", "database") 
        .append("likes", 100) 
        .append("url", "http://www.tutorialspoint.com/mongodb/") 
        .append("by", "tutorials point");  
        collection.insertOne(document); 
        System.out.println("Document inserted successfully");     
    } 
    }
```

### Retrieving All Documents
- 
```
    import com.mongodb.client.FindIterable; 
    import com.mongodb.client.MongoCollection; 
    import com.mongodb.client.MongoDatabase;  

    import java.util.Iterator; 
    import org.bson.Document; 
    import com.mongodb.MongoClient; 
    import com.mongodb.MongoCredential;  

    public class RetrievingAllDocuments { 
    
    public static void main( String args[] ) {  
        
        // Creating a Mongo client 
        MongoClient mongo = new MongoClient( "localhost" , 27017 ); 

        // Creating Credentials 
        MongoCredential credential;
        credential = MongoCredential.createCredential("sampleUser", "myDb", 
            "password".toCharArray()); 
        System.out.println("Connected to the database successfully");  
        
        // Accessing the database 
        MongoDatabase database = mongo.getDatabase("myDb");  
        
        // Retrieving a collection 
        MongoCollection<Document> collection = database.getCollection("sampleCollection");
        System.out.println("Collection sampleCollection selected successfully"); 

        // Getting the iterable object 
        FindIterable<Document> iterDoc = collection.find(); 
        int i = 1; 

        // Getting the iterator 
        Iterator it = iterDoc.iterator(); 
        
        while (it.hasNext()) {  
            System.out.println(it.next());  
        i++; 
        }
    } 
    }
```
#### NOTE:-
When viewing the database it is necessary to switch to the new database i.e.
-
```
    use myDb
    show collections
```