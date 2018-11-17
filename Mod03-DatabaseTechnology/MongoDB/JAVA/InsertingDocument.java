package com.cdac;

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