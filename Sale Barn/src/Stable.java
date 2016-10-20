import java.util.ArrayList;
import java.util.Scanner;

public class Stable
	{
		static ArrayList <Horse> stable = new ArrayList <Horse>();
		
		int counter;
		int counter2;
		int counter3;
		int counter4;
		int counter5;
		int counter6;
		int counter7;
		

		public static void main(String[] args)
			{
				fillStable();
				greetBuyer();
				displayMenu();
				
			}

		public static void fillStable()
			{
			
				stable.add(new Horse("George", "Holsteiner", "Hunter, Jumper and Equitation Rings", 10, 120000, 16.2, "3'6 Equitation Medals, International Hunter Derbies and Meter 1.10-1.15 Jumpers"));	
				stable.add(new Horse("Argo", "Dutch Warmblood", "Hunter Ring", 12, 250000, 16, "3'6 Amateur Owner Hunters and International Hunter Derbies"));
				stable.add(new Horse("Emerald", "Holsteiner", "Jumper Ring", 14, 750000, 16.1, "1.60 Grand Prix and Olympic Show Jumping"));
				stable.add(new Horse("Lincoln", "Oldenberg", "Hunter and Equitation Rings", 5, 45000, 15.2, "2'6 Baby Green Hunters"));
				stable.add(new Horse("Lucy", "Holsteiner", "Jumper Ring", 17, 30000, 15.3, "1.20 Jumpers and High Childrens Jumpers"));
				stable.add(new Horse("Nicco", "Dutch Warmblood", "Hunter Ring", 12, 60000, 17.3, "Pre-Adult Hunters and National Hunter Derbies")); 
				stable.add(new Horse("Celcius", "Dutch Warmblood", "Equitation Ring", 8, 175000, 17, "3'6 Equitation Medals and Age Group Equitation Divison"));
				
			
			}
		
		public static void greetBuyer()
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Greetings! Welcome to Imperial Equestrian Sale Stable. What is your name?");
			String name = userInput.nextLine();
			System.out.println("Hello, " + name + "!");
			
			}
		
		public static void displayMenu()
			{
			Scanner userInput = new Scanner(System.in);
			
			System.out.println("Would you like to buy a horse, sell a horse or get a horse's information?");
			System.out.println("Type in the number 1 to proceed forth with buying, 2 with selling, or 3 with"
							+ " retrieving information.");
			int userAnswer = userInput.nextInt();
			
			
			
			if (userAnswer == 1)
				{
					buyHorse();
				}
			else if (userAnswer == 2)
				{
					sellHorse();
				}
			else if (userAnswer == 3)
				{
					getHorseInformation();
					
				}
			
			}
	
	
		public static void buyHorse()
			{
				Scanner userInput = new Scanner (System.in);
				
				System.out.println("Alright. We have seven different horses available, each with different characteristics"
								+ " and capabilities.");
				System.out.println("We will ask you a series of questions to match you up with the proper mount. "
						+ "Go ahead and press enter to proceed with your horse search.");
			
				String fakeVariable = userInput.nextLine();
				
				System.out.println("What breed are you most intrested in?");
				for(int i = 0; i < stable.size(); i++)
					{
					System.out.println(i + 1 + ". " + stable.get(i).getBreed());
					}
				
				System.out.println("How old would you like your horse to be?");
				for(int i = 0; i < stable.size(); i++)
					{
					System.out.println(i + 1 + ". " + stable.get(i).getAge());
					}
				
				
			}
	
		public static void sellHorse()
			{
			
			}
		public static void getHorseInformation()
			{
				Scanner userInput = new Scanner (System.in);
				System.out.println("Okay! We have seven different horses currently in the stable, and each varies"
								+ " signifcantly from the other.\nWhich of the following horses do you wish to learn more "
								+ "about?\nType in the number proceeding the horse's name to pull up that horse's information.");
				
				for(int i = 0; i < stable.size(); i++)
					{
					System.out.println(i + 1 + ". " + stable.get(i).getName());
					}
				
				
				int userNumberChoice = userInput.nextInt();
						
				System.out.println(stable.get(userNumberChoice-1).getName() + " is a " + stable.get(0).getAge() + " year old "
								+ stable.get(0).getBreed() + " who is " + stable.get(0).getHands() + " hands tall."  + " This horse specializes"
								+ " in the " + stable.get(0).getDiscipline() + " and is currently showing in the " + stable.get(0).getEvents() + ".");
					

				
			}
	
	}
