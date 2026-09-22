package librarymanagement;

public class LibraryServiceImpl implements LibraryOperations  {

	private Book[] books;
	private int count;

	public LibraryServiceImpl(int size) {
		books = new Book[size];
		count = 0;
	}

	@Override
	public void addBook(Book book) {
		if(books.length==count) {
			throw new ArrayIndexOutOfBoundsException("Library is Full");
		}
		else {
			books[count]=book;
			count++;
			System.out.println("Book added Succesfully");
		}
		
	}

	@Override
	public Book getBook(int bookId) {
		for (int i = 0; i < count; i++) {
			if(books[i].getBookId()==bookId) {
				return books[i];
			}
		}
		return null;
	}

	@Override
	public void getAllBooks() {
		if(count==0) {
			System.out.println("No books Available.");
			return;
		}
		System.out.println("These are the books Available in our Library ");
		for (int i = 0; i < count; i++) {
			System.out.println(books[i]);
		}
	}

	@Override
	public void updateBook(int bookId, String title, String author, double price) {
		int i;
		for(i=0;i<count;i++) {
			if(books[i].getBookId()==bookId) {
				break;
			}
		}
		if(i==count) {
			System.out.println("No book found.");
			return;
		}
		books[i].setTitle(title);
		books[i].setAuthor(author);
		books[i].setPrice(price);
		System.out.println("Book Uppdated Successfully.");
	}

	@Override
	public void removeBook(int bookId) {
		int i;
		for(i=0;i<count;i++) {
			if(books[i].getBookId()==bookId) {
				books[i]=null;
				break;
			}
		}
		if(i==count) {
			System.out.println("No book found.");
			return;
		}
		// Shift elements to the left
		while(i<count-1) {
			books[i]=books[i+1];
			i++;
		}
		// Removing duplicate reference at last position
		books[count - 1] = null;
		count--;
		System.out.println("Book removed Successfully.");
	}

	@Override
	public void searchBook(String title) {
		for (int i = 0; i < count; i++) {
			if(books[i].getTitle().equalsIgnoreCase(title)) {
				System.out.println("Found Book: ");
				System.out.println(books[i]);
				return;
			}
		}
		System.out.println("Book Not Found.");
	}

}
