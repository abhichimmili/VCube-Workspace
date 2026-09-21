package librarymanagement;

public class EBook extends Book {

	private String format;

	public EBook(int bookId, String title, String author, double price, String format) {

		super(bookId, title, author, price);
		this.format = format;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {

		if (format == null || format.isBlank()) {
			throw new IllegalArgumentException("Format cannot be empty");
		}

		this.format = format;
	}

	@Override
	public String displayBookType() {
		return "Book Type : E-Book\n" + "Format    : " + format;
	}
}