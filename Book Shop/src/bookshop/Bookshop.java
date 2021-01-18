package bookshop;

import java.util.*;
import java.util.Scanner;
import static utils.PopulateData.*;
import book.Books;
import cart.Cart;
import customException.Except;
public class Bookshop {

	public static void main(String[] args) {
		
		HashSet<Books> books = populateData();
		//System.out.println(books);
		
		HashMap <String , String > login = loginData();
		
		//System.out.println(login);
		try(Scanner sc = new Scanner(System.in);){
		
		System.out.println("enter login details to Enter the Application");
		System.out.println("Enter Username and password");
		String username = sc.next();
		String pass = sc.next();
		Cart c = new Cart();
		boolean flag = login.containsKey(username) && (login.get(username).equals(pass))  ? true: false; //validating user
		
		if(flag) {
			System.out.println("Login Successfull");
			System.out.println("Welcome to Marvel Book Shop");
			
		}
		else {
			System.out.println("Invalid Details Start Application again");
		}
			
		while(flag) {
			System.out.println("How can we help you?  \n 1. View books in the shop  \n 2. View Cart \n "
					+ "3. Add book to cart \n 4. Remove book from cart \n 5. Exit");
			
			try{switch (sc.nextInt()) {
			case 1:
				// Customer Readable output : -	
				books.stream().forEach(b -> System.out.printf("%-40s %-20s %s \n","Title : "+ b.getTitle() , "Genre : " + b.getGenre(), "Author : " +Arrays.deepToString(b.getAuthors()) ));
				//books.stream().forEach(System.out::println);   // all details
				break;

			case 2:
				if(c.getTotal()==0) {
					System.out.println("Cart Empty");
				}else {
				System.out.println(c.getArr());  
				System.out.println(c.getTotal());
				}
				break;
				
			case 3:
				System.out.println("Enter the book name : ");
				sc.nextLine();   // to take enter
				Books name = new Books(sc.nextLine());
				if(books.contains(name)) {
					for(Books b : books) {
						try{if(b.getTitle().equals(name.getTitle())) {
							c.setArr(b.getTitle());
							c.setTotal(b.getPrice());
							System.out.println("Book Added");
						}}catch(Exception e) {
							throw new Except("Invalid Book Name");
						}
					}				
				}
				else
					System.out.println("Invalid Book!");
					
				break;
				
			case 4:
				System.out.println("Enter the book name : ");
				sc.nextLine();   // to take enter 
				Books bookname = new Books(sc.nextLine());
				if(books.contains(bookname)) {
					for(Books b : books) {
						if(b.getTitle().equals(bookname.getTitle())) {
							c.remove(b.getTitle());
							c.decTotal(b.getPrice());
							System.out.println("Book Removed");
						}
					}
				}
				break;
				
			case 5:
				
				if(c.getTotal()==0) {
					System.out.println("Cart Empty");
				}else {
				System.out.println("Checkout Cart");
				System.out.println("Book names : "+c.getArr());  
				System.out.println("Total Price : "+c.getTotal());
				}
				sc.close();
				System.exit(0);
				break;
				
			default :
				throw new Except("Enter from the given numeric input options");
				
			}}catch(Exception e){
				System.out.println(e);
				continue;
			}
			
		}
		
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
