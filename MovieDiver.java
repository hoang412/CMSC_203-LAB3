import java.util.Scanner;
public class MovieDiver {
	public static void main (String [] arg) {
		Scanner in = new Scanner(System.in);
		String movie, rating = null;
		int numOfTickets = 0;
		char choice;
		//Ask user to enter movie namne
		
		do {
		System.out.println("Enter the name of the movie");
		movie = in.next() + in.nextLine();
		
		// pass movie to setTitle
		Movie Title = new Movie(movie, rating, numOfTickets);
		Title.setTitle(movie);
		
		//rating
		System.out.println("Enter the rating of the movie");
		rating = in.next();
		
		//Pass rating to setRating
		Movie rate = new Movie(movie, rating, numOfTickets);
		rate.setRating(rating);
		
		//# of tickets
		System.out.println("Enter the number of tickets sold for this movie");
		numOfTickets = in.nextInt();
		
		//Pass numOfTickets to  setSoldTickets
		Movie tickets = new Movie(movie, rating, numOfTickets);
		tickets.setSoldTickets(numOfTickets);
		
		Movie Object = new Movie(movie, rating, numOfTickets);	
		//Display the result
		System.out.println(Object.toString());
		
		System.out.println("Do you want to enter another? (y or n)");
		choice = in.next().charAt(0);
		
		
		}while (choice == 'y' || choice == 'Y');

		System.out.println("Good Bye");
	}
}
