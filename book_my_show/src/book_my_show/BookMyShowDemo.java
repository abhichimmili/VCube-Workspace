package book_my_show;

class BookMyShow {
	private int total_tickets = 10;

	public synchronized void bookMyShowTickets(String name, int tickets) {
		if (tickets <= total_tickets) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			total_tickets = total_tickets - tickets;
			System.out.println("Tickets Booked for Mr/Ms : " + name);
			System.out.println("Booked Tickets : " + tickets);
			System.out.println("Acvailable Tickets are " + total_tickets);
		} else {
			System.err.println("Tickets Sold out.");
			System.err.println("Available tickets are " + total_tickets);
		}
	}
}

class Customer extends Thread {
	private BookMyShow bms;
	private String name;
	private int tickets;

	Customer(BookMyShow bms, String name, int tickets) {
		this.bms = bms;
		this.name = name;
		this.tickets = tickets;
	}

	@Override
	public void run() {
		bms.bookMyShowTickets(name, tickets);
	}
}

public class BookMyShowDemo {

	public static void main(String[] args) {
		BookMyShow bms = new BookMyShow();
		Customer abhi = new Customer(bms, "Abhi", 5);
		Customer suji = new Customer(bms, "Sujitha", 3);
		Customer sandy = new Customer(bms, "Sandhya", 4);
		Customer priya = new Customer(bms, "Priyanka", 2);
		Customer mouni = new Customer(bms, "Mounika", 6);
		Customer ammu = new Customer(bms, "Amulya", 7);

		suji.start();
		sandy.start();
		abhi.start();
		priya.start();
		mouni.start();
		ammu.start();
	}

}
