package testproject.testproject1;

public class ZooFactory {

	
	public Animal createAnimal(String name, String country, int voteriQanak) {
		Animal animal = new Animal();
		animal.setCountry(country);
		animal.setName(name);
		animal.setVoteriQanak(voteriQanak);
		return animal;
		
	}
	
	
}
