package virtualPetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	public Map<String, VirtualPet1> pets = new HashMap<>();

	public Collection<VirtualPet1> pets() {
		return pets.values();

	}

	public void add(VirtualPet1 pet) {
		pets.put(pet.getName(), pet);
	}

	public VirtualPet1 findPet(String petName) {
		return pets.get(petName);
	}

	public void intake(VirtualPet1 virtualPet1) {
		String newName = virtualPet1.getName();
		pets.put(newName, virtualPet1);
	}

	public void feedAllPups() {
		for (VirtualPet1 pet : pets.values()) {
			pet.feedPetKibble();
		}
	}

	public void waterAll() {
		for (VirtualPet1 pet : pets.values()) {
			pet.giveWater();
		}
	}

	public void play(String name) {
		pets.get(name).allowZoomies();

	}

	public void tickAll() {
		for (VirtualPet1 pet : pets.values()) {
			pet.tick();
		}

	}

	public boolean adopt(String name) {
		pets.remove(name);
		return false;
	}

	public boolean doesPetRemain(String name) {
		return pets.containsKey(name);
	}

	public String petStatus() {
		String petStatus = "";
		for (Entry<String, VirtualPet1> eachPet : pets.entrySet()) {
			petStatus += eachPet.getValue().getName() + "\t   " + eachPet.getValue().getHunger() + "\t   " + eachPet.getValue().getThirst() + "\t   "
					+ eachPet.getValue().getWaste() + "\t   " + eachPet.getValue().getBoredom() + "\t   " + eachPet.getValue().getHealth() + "\n";
		}
		return petStatus;
	}

	public String availableOptions() {
		String availableOptions = "";
		for (Entry<String, VirtualPet1> eachPet : pets.entrySet()) {
			availableOptions += "Name: " + eachPet.getValue().getName() + "\t" + eachPet.getValue().getStory() + "\n";
		}
		return availableOptions;
	}

}
