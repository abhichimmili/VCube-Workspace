package librarymanagement;

public class Magazine extends Book {

	private int issueNumber;

	public Magazine(int bookId, String title, String author, double price, int issueNumber) {
		super(bookId, title, author, price);
		this.issueNumber = issueNumber;
	}

	public int getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(int issueNumber) {
		if (issueNumber <= 0) {
			throw new IllegalArgumentException("Issue number must be greater than 0");
		}

		this.issueNumber = issueNumber;
	}

	@Override
	public String displayBookType() {
		return "Book Type    : Magazine\n" + "Issue Number : " + issueNumber;
	}

}
