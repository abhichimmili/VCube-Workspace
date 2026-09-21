package librarymanagement;

public class PrintedBook extends Book {

	private int pages;

	public PrintedBook(int bookId, String title, String author, double price, int pages) {
		super(bookId, title, author, price);
		this.pages = pages;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		if (pages <= 0) {
			throw new IllegalArgumentException("Pages must be greater than 0");
		}

		this.pages = pages;
	}

	@Override
	public String displayBookType() {
		return "Book Type : Printed Book\n" + "Pages     : " + pages;
	}

}
