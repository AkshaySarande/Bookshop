package book;
import author.Author;

import genre.Category;
import java.time.LocalDate;
import java.util.Arrays;

public class Books {

	private Category genre;
	private String title;
	private double price;
	private LocalDate publishDate;
	private int quantity;
	private Author[] authors = new Author[4];
	
	
	
	
	public Books(String genre, String title, double price, String publishDate, int quantity, Author[] authors) {
		super();
		this.genre = Category.valueOf(genre.toUpperCase());
		this.title = title;
		this.price = price;
		this.publishDate = LocalDate.parse(publishDate);
		this.quantity = quantity;
		this.authors = authors;
	}
	
	public Books(String title) {
		this.title=title;
	}
	public Category getGenre() {
		return genre;
	}
	public void setGenre(Category genre) {
		this.genre = genre;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Author[] getAuthors() {
		return authors;
	}
	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Books [genre=" + genre + ", title=" + title + ", price=" + price + ", publishDate=" + publishDate
				+ ", quantity=" + quantity + ", authors=" + Arrays.toString(authors) + "]";
	}
	
	
	
}
