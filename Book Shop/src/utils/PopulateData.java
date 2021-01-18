package utils;
import java.util.*;

import author.Author;
import book.Books;
 

public class PopulateData {

	public static Author[] author = {
			new Author("author1","abc@gmail.com"),
			new Author("author2","abcd@gmail.com"),
			new Author("author3","xyz@gmail.com"),
			new Author("author4","pqr@gmail.com"),
			new Author("author5","lmn@gmail.com")
	
	};
	//no validation since it is hard coded
	
	public static HashSet<Books> populateData(){
		
		HashSet <Books> arr = new HashSet<>();
		arr.add(new Books("Fiction", "Harry Potter", 999, "1999-10-11", 15,new Author[] {author[0],author[1]} ));
		arr.add(new Books("Fiction", "Ice And Fire", 1999, "1899-11-11", 15,new Author[] {author[2],author[3]} ));
		arr.add(new Books("Science", "Sapiens A Brief History of Humankind", 579, "1969-08-16", 5,new Author[] {author[3],author[4]} ));
		arr.add(new Books("Science", "Cashflow Quadrant", 1099, "2009-01-07", 8,new Author[] {author[0],author[3]} ));
		arr.add(new Books("Finance", "Accounting made easy", 609, "2004-10-23", 10,new Author[] {author[2],author[1]} ));
		arr.add(new Books("Finance", "Rich Dad Poor Dad", 1024, "2019-06-13", 15,new Author[] {author[4],author[2]} ));
		arr.add(new Books("Yoga", "A Yogi", 1109, "2011-08-11", 9,new Author[] {author[3],author[0]} ));
		arr.add(new Books("Yoga", "Yoga", 399, "1989-02-08", 4,new Author[] {author[0],author[2]} ));
		arr.add(new Books("Meditation", "Meditation And It's Methods", 150, "1999-10-11", 15,new Author[] {author[0],author[1]} ));
		arr.add(new Books("Meditation", "The power of Subconscious Mind", 499, "2011-10-11", 18,new Author[] {author[3],author[2]} ));
		arr.add(new Books("Yoga", "Akshay Sarande", 1999, "1989-02-08", 4,new Author[] {author[0],author[2]} ));

		return arr;
	}
	
	public static HashMap<String,String> loginData(){
		HashMap <String , String > hm = new HashMap<>();
		hm.put("admin", "admin123");
		hm.put("user1","user1");
		hm.put("user2","user2");
		hm.put("user3","user3");
		hm.put("user4","user4");
		hm.put("user5","user5");
		
		return hm;
	}
	
}
