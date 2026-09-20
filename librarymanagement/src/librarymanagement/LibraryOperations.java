package librarymanagement;

public interface LibraryOperations {
	
	void addBook(Book book);

	Book getBook(int bookId);

	void getAllBooks();

	void updateBook(int bookId, String title, String author, double price);

	void removeBook(int bookId);

	void searchBook(String title);

}
