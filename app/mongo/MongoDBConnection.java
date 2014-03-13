package mongo;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBAddress;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;

public class MongoDBConnection {

	public static DB getDatabase() {
		Mongo mongo = null;
		try {
			mongo = new Mongo( new DBAddress("localhost", "Persons") );
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    DB db = mongo.getDB("Persons");
	    return db;
	}

	public static DBCollection getCollection() {
		Mongo mongo = null;
		try {
			mongo = new Mongo( new DBAddress("localhost", "Persons") );
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    DB db = mongo.getDB("Persons");
	    return db.getCollection("Person");
	}
}
