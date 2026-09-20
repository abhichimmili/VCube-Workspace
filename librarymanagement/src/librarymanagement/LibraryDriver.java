package librarymanagement;

import java.util.Scanner;

public class LibraryDriver {

	static Scanner sc = new Scanner(System.in);

	static LibraryOperations library = new LibraryServiceImpl(7);

	public static void main(String[] args) {

		while (true) {

			displayMenu();

			System.out.print("Enter a choice : ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:
				addBook();
				break;

			case 2:
				getBook();
				break;

			case 3:
				getAllBooks();
				break;

			case 4:
				updateBook();
				break;

			case 5:
				removeBook();
				break;

			case 6:
				searchBook();
				break;

			case 7:
				System.out.println("Thank you for using Library Management System.");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static void searchBook() {
		System.out.println("Enter Title to Search : ");
		String title = sc.nextLine();
		library.searchBook(title);

	}

	private static void removeBook() {
		System.out.println("Enter Book Id to Remove : ");
		int bookId = sc.nextInt();
		library.removeBook(bookId);

	}

	private static void updateBook() {
		System.out.println("Enter Old Book Id : ");
		int bookId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter New Book Title : ");
		String title = sc.nextLine();
		System.out.println("Enter New Author Name : ");
		String author = sc.nextLine();
		System.out.println("Enter New Price : ");
		double price = sc.nextDouble();
		sc.nextLine();

		library.updateBook(bookId, title, author, price);
	}

	private static void getBook() {
		System.out.println("Enter Book Id to Retrieve Book Data : ");
		int bookId = sc.nextInt();
		Book book = library.getBook(bookId);
		if (book != null) {
			System.out.println(book);
		} else {
			System.out.println("No book Found.");
		}
	}

	private static void addBook() {
		System.out.println("Enter Book Id : ");
		int bookId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Book Title : ");
		String title = sc.nextLine();
		System.out.println("Enter Author Name : ");
		String author = sc.nextLine();
		System.out.println("Enter Price : ");
		double price = sc.nextDouble();
		sc.nextLine();
		Book book = null;

		do {
			System.out.println("1. E-Book");
			System.out.println("2. Printed Book");
			System.out.println("3. Magazine");
			System.out.println("Enter Book Type : ");

			int type = sc.nextInt();
			sc.nextLine();

			switch (type) {
			case 1:
				System.out.print("Enter Format: ");
				String format = sc.nextLine();

				book = new EBook(bookId, title, author, price, format);
				break;
			case 2:
				System.out.print("Enter Number of Pages: ");
				int pages = sc.nextInt();

				book = new PrintedBook(bookId, title, author, price, pages);
				break;
			case 3:
				System.out.print("Enter Issue Number: ");
				int issueNumber = sc.nextInt();

				book = new Magazine(bookId, title, author, price, issueNumber);
				break;
			default:
				System.out.println("Invalid book type. Please Choose Again");
			}

		} while (book == null);

		library.addBook(book);
	}

	private static void displayMenu() {

		System.out.println();
		System.out.println("==============================");
		System.out.println("    LIBRARY MANAGEMENT SYSTEM");
		System.out.println("==============================");
		System.out.println("1. Add Book");
		System.out.println("2. Get Book");
		System.out.println("3. Get All Books");
		System.out.println("4. Update Book");
		System.out.println("5. Remove Book");
		System.out.println("6. Search Book");
		System.out.println("7. Exit");
		System.out.println("==============================");
	}

	private static void getAllBooks() {

		library.getAllBooks();
	}
}