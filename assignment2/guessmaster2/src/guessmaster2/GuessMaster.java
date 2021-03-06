//Arsh Kochhar - 20104779

package guessmaster2;
import java.util.Random;
import java.util.Scanner;

public class GuessMaster {
	
	private int numOfEntities;
	private Entity[] entities; 
	private int ticketTotal;
	
	public GuessMaster() {
		numOfEntities = 0;
		entities = new Entity[20]; 
		ticketTotal = 0;
	}
	
	//  numOfEntities Accessor
	public int getNumOfEntities() {
		return numOfEntities;
	}
		
		//   Accessor and Mutator for ticketTotal
	public int getticketTotal() {
		return ticketTotal;
	}
	public void addticketTotal(int ticketsAdded) {
		ticketTotal += ticketsAdded;
	}
	public void addEntity(Entity entity) {
		entities[numOfEntities++] = entity.clone();
	}
		
		

    //plays the game
	public void playGame(Entity entity) {
		// Complete Game
		Scanner scanner = new Scanner(System.in);
		String response;
		Date date;
		// Start of the game
		System.out.println("**********************************");
		System.out.println(entity.welcomeMessage());
		System.out.println("Guess " + entity.getName() + "'s birthday\n(mm/dd/yyyy)");
		while (true) {
			
			// The user will keep guessing until the correct response has been given
			response = scanner.nextLine();
			response = response.replace("\n", "").replace("\r", "").trim();
			
			// checks to see whether or not the response is quit
			if (response.equalsIgnoreCase("quit")) 
			{
				System.out.println("Ending Game");
				System.exit(0);
			}
			
			// Checks to see if the input is valid 
			if (Date.isValidDate(response)) {
				date = new Date(response);
				// Checks whether the date is before, after, or equal
				if (entity.getBorn().precedes(date)) 
				{
					System.out.println("That above date is too late try a earlier date");
				} 
				else if (date.precedes(entity.getBorn())) 
				{
					System.out.println("That above date is too early try a later date");
				} 
				else 
				{
					addticketTotal(entity.getAwardedTicketNumber());
					System.out.println("*************Bingo!***************");
					System.out.println("You won " + entity.getAwardedTicketNumber() + " tickets in this round.");
					System.out.println("The total number of your tickets is " + getticketTotal());
					System.out.println("**********************************");
					System.out.print(entity.closingMessage());
					break;
				}
			} 
			else 
			{
				System.out.println("Incorrect Date Response");
			}

		}
	}
	public void playGame(int entityID) {
		// This plays the game with a randomized entity chosen from the given ones in the main method 
		playGame(entities[entityID]);
	}
	
	public void playGame() {
		// This plays the game with random entities
		while (true) 
		{
			playGame(genRandomEntityId());
		}
	}
	
	public int genRandomEntityId() {
		// This generates a randomID for the user to play with
		Random randomNum = new Random();
		return randomNum.nextInt(numOfEntities);
	}
	public static void main(String[] args) {
		//intro
		System.out.println("=========================\n");
		System.out.println("     GuessMaster 2.0 \n");
		System.out.println("=========================\n");
		// Making four new entities
		Politician trudeau = new Politician("Justin Trudeau", new Date("December", 25, 1971), "Male", "Liberal", 0.25);
		Singer dion = new Singer("Celine Dion", new Date("March", 30, 1961), "Female", "La voix du bon Dieu", new Date("November", 6, 1981), 0.5);
		Person myCreator = new Person("myCreator", new Date("September", 1, 2000), "Female", 1);
		Country usa = new Country("United States", new Date("July", 4, 1776), "Washinton D.C.", 0.1);
		// Making a new game
		GuessMaster gm = new GuessMaster();
		gm.addEntity(trudeau);
		gm.addEntity(myCreator);
		gm.addEntity(dion);
		gm.addEntity(usa);
		// Starting the game
		gm.playGame();
		
		
		
	}

}
