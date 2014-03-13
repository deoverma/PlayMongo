package repository;

import java.util.ArrayList;
import java.util.List;

import mongo.MongoDBConnection;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;



public class Persons {
	
	public void savePerson(String message) {
		DBObject dbObject = new BasicDBObject();
		dbObject.put("name", message);
		MongoDBConnection.getCollection().save(dbObject);
	}
	
	public List<String> getPersons() {
		DBCursor cursor = MongoDBConnection.getCollection().find();
		List<String>  names = new ArrayList<String>();
		for(DBObject obj : cursor) {
			names.add((String)obj.get("name"));
		}
		return names;
	}
}
