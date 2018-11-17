package com.cdac;

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
