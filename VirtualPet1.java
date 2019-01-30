package virtualPetShelter;

public class VirtualPet1 {
	private String name;
	private String story;
	private int hunger;
	private int thirst;
	private int waste;
	private int boredom;
	private int health;

	public VirtualPet1(String name, String story) {
		this(name, story, 50, 60, 70, 80, 90);
	}

	public VirtualPet1(String name, String story, int hunger, int thirst, int waste, int boredom, int health) {
		this.name = name;
		this.story = story;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public String getStory() {
		return story;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getWaste() {
		return waste;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getHealth() {
		return health;
	}

	public void feedPetKibble() {
		this.hunger -= 5;
		this.thirst += 4;
	}

	public void giveTableScraps1() {
		this.hunger -= 6;
		this.thirst += 1;
		this.waste += 6;
		this.boredom -= 4;
		this.health -= (int) (Math.random() * 9 + 1);
	}

	public void giveWater() {
		this.thirst -= 4;
	}

	public void napTime1() {
		this.boredom += 3;
		this.health += 3;
	}

	public void allowZoomies() {
		this.boredom -= 5;
		this.health += 8;
		this.waste -= 3;
		this.hunger -= (Math.random() * 3 + 1);
	}

	public void goWalk() {
		this.boredom -= 7;
		this.health += 3;
		this.waste -= 10;
	}

	public void giveRub() {
		this.boredom -= 6;
		this.health += 3;
	}

	public void giveBdaySteak() {
		this.hunger -= 5;
		this.thirst -= 2;
		this.waste += 4;
		this.boredom -= 5;
		this.health += 6;
	}

	public void tick() {

		this.hunger--;
		this.thirst--;
		this.waste--;
		this.boredom--;
		this.health--;

	}
}
