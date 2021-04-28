package tutorial11.BookShop;

public class Book {
	private String author;
	private String title;
	private double price;
	
	public Book(String author, String title, double price) {
		this.setAuthor(author);
		this.setPrice(price);
		this.setTitle(title);
	}

	public String getAuthor() {
		return author;
	}

	protected void setAuthor(String author) throws IllegalArgumentException{
		String[] names = author.split(" ");
		if(names.length > 1) {
			char ch = names[1].charAt(0);
			if(Character.isDigit(ch)) {
				throw new IllegalArgumentException("Author not valid!");
			}
		}
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	protected void setTitle(String title) throws IllegalArgumentException{
		if(title.length() < 3) {
			throw new IllegalArgumentException("Title not valid!");
		}
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	protected void setPrice(double price) throws IllegalArgumentException{
		if(price < 1) {
			throw new IllegalArgumentException("Price not valid!");
		}
		this.price = price;
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Type: ").append(this.getClass().getSimpleName())
		.append(System.lineSeparator())
		.append("Title: ").append(this.getTitle())
		.append(System.lineSeparator())
		.append("Author: ").append(this.getAuthor())
		.append(System.lineSeparator())
		.append("Price: ").append(this.getPrice())
		.append(System.lineSeparator());
		
		return sb.toString();
	}

}
