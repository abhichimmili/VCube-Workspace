package librarymanagement;

public abstract class Book {
	private int bookId;
	private String title;
	private String author;
	private double price;

	public Book(int bookId, String title, String author, double price) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public abstract String displayBookType();

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		if (bookId <= 0) {
			throw new IllegalArgumentException("Book ID must be greater than 0");
		}
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title == null || title.isBlank()) {
			throw new IllegalArgumentException("Title cannot be empty");
		}
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price <= 0) {
			throw new IllegalArgumentException("Price must be greater than 0");
		}
		this.price = price;
	}

	@Override
	public String toString() {

		return "\nBook ID : " + bookId + "\nTitle   : " + title + "\nAuthor  : " + author + "\nPrice   : " + price + "\n"
				+ displayBookType();
	}

}
