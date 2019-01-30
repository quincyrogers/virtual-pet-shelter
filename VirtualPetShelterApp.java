package virtualPetShelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter pets = new VirtualPetShelter();

		VirtualPet1 pet1 = new VirtualPet1("Cuddy", "Young and wild mixed breed with a loose bladder. His former owner loves Persian Rugs and so did Cuddy.", 40, 50, 90, 30, 80);
		VirtualPet1 pet2 = new VirtualPet1("Vernie", "A Massive Mastiff, he is a gentle giant with hips issues. Once a fierce guard dog went in to early retirement after enjoyed a T-Bone from a cat burgurlar during a home invasion.", 50, 40, 20, 30, 30);
		VirtualPet1 pet3 = new VirtualPet1("Maeve", "Old sweet pitbull, she is the definition of a nanny dog. Unfornunately due to circumstances beyond her control she is banned from most gated communities in Boca Raton.", 50, 30, 30, 10, 60);
		VirtualPet1 pet4 = new VirtualPet1("Mr.B", "He looks like Spuds McKenzie and loves the taste of hops on a sunday afternoon. While enjoying the majority of his dad's corona he knock over a 60 year old bottle of scotch.", 50, 90, 40, 70, 80);

		pets.add(pet1);
		pets.add(pet2);
		pets.add(pet3);
		pets.add(pet4);

		String decision = "";
		while (!decision.equalsIgnoreCase("Yes")) {

			System.out.println("Thank you for visiting your Linden's finest gathering place for dogs and people looking to for family. It's more than a shelter people!.\n");

			System.out.println("This is the status of the Shelter Pet's: \n");

			System.out.println("Name\t|Hunger\t|Thirst\t|Waste\t|Boredom|Health\t");// the \t allows console to align output in columns
			System.out.println("--------|-------|-------|-------|-------|-------");
			System.out.println();
			System.out.println(pets.petStatus());
			System.out.println("\nWhat would you like to do next?\n");

			System.out.println("1. Feed the pets Kibble");
			System.out.println("2. Give the pets water");
			System.out.println("3. Give the pets table scraps");
			System.out.println("4. Let the pets nap");
			System.out.println("5. Allow Zoomies (Running and Play)");
			System.out.println("6. Take the pets for a walk");
			System.out.println("7. Give the pets a rubdown");
			System.out.println("8. Give the pets a BIRTHDAY Steak!");
			System.out.println("9. Adopt a pet.");
			System.out.println("10. Admit a pet.");
			System.out.println("11. Quit");

			String optionEntered = input.nextLine();
			if (optionEntered.equals("1")) { 
				pets.feedAllPups();
				System.out.println("Everybody EATS!!!.\n");

			} else if (optionEntered.equals("2")) {
				pets.waterAll();
				System.out.println("Bartender pour everyone a round!\n");

			} else if (optionEntered.equals("3")) { 
				System.out.println("Choose the pet you would like to have a secret snack with:");
				System.out.println(pets.availableOptions());
				String petName = input.nextLine();

				pets.play(petName);
				System.out.println("You took " + petName + " for a walk to the field to play.\n");
				
			} else if (optionEntered.equals("4")) { 
				System.out.println("Choose the pet you would like to let catch some extra ZZZs!");
				System.out.println(pets.availableOptions());
				String petName = input.nextLine();

				pets.play(petName);
				System.out.println("You let " + petName + " lay lazy.\n");
				
			} else if (optionEntered.equals("5")) { 
				System.out.println("Choose the pet you would like to let play or run wild for field for a minute or two!");
				System.out.println("\nWhich dog would you like to play with today?");
				System.out.println(pets.availableOptions());
				String petName = input.nextLine();

				pets.play(petName);
				System.out.println("You took " + petName + " for a run and a game of catch at the field today!.\n");
				
			} else if (optionEntered.equals("6")) { 
				System.out.println("Choose the pet you would like to go for a walk with:");
				System.out.println("\nWhich dog would you like to walk with today?");
				System.out.println(pets.availableOptions());
				String petName = input.nextLine();

				pets.play(petName);
				System.out.println("You took " + petName + " for a long relaxing walk through the neighborhood.\n");
			
			} else if (optionEntered.equals("7")) { 
				System.out.println("Choose the pet you would like to give a good petting");
				System.out.println("\nWhich dog would you like to show love to today?");
				System.out.println(pets.availableOptions());
				String petName = input.nextLine();

				pets.play(petName);
				System.out.println("You gave " + petName + " a big head and belly rub.\n");
				
			} else if (optionEntered.equals("8")) { 
				System.out.println("Which dog deserves a birthday gift?");
				System.out.println("\nWhich dog would to give a T-Bone Steak to?");
				System.out.println(pets.availableOptions());
				String petName = input.nextLine();

				pets.play(petName);
				System.out.println("You gave " + petName + " a T-Bone for their belated birthday.\n");



			} else if (optionEntered.equals("9")) {
				System.out.println("Awesome! You've chosen to adopt a pet.");
				System.out.println("Which pet would you like to adopt?\n");
				System.out.println(pets.availableOptions());
				String petName = input.nextLine();

				if (!pets.doesPetRemain(petName)) {
					System.out.println("This pet does not exist.");
				} else {
					pets.adopt(petName);
					System.out.println("Congrats on adopting your new pet \n" + petName + "!");
				}

			} else if (optionEntered.equals("10")) { 
				System.out.println("Enter the name of the pet being surrendered: ");
				String newPetName = input.nextLine();

				System.out.println("Please give us" + newPetName + "'s story or the reason bring them to us.");
				String newPetStory = input.nextLine();

				pets.add(new VirtualPet1(newPetName, newPetStory));
				System.out.println("Your pet will sure miss you.");
				System.out.println("Thanks admitting your pet instead of discarding your pet elsewhere...\n");

			} else if (optionEntered.equals("11")) { 
				System.out.println("Are you sure you wish to quit the game?");
				System.out.println("Enter Yes or No");
				decision = input.nextLine();

				if (decision.equalsIgnoreCase("Yes")) {
					System.out.println("You have quit the game...");

				} else {
					decision.equalsIgnoreCase("No");
					System.out.println("Glad you are still with us.");
					System.out.println("Thank you for being a friend... Traveled down a road and back again... Your heart is true, you're a pal and a confidant.\n");
				}

			}
			pets.tickAll();
		}

		input.close();
	}

}
