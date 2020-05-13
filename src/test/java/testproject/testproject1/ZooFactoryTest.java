package testproject.testproject1;


import org.junit.Assert;
import org.junit.Test;

public class ZooFactoryTest {

	
	@Test
	public void testCreateAnimal() {
		String name = "Tiger";
		String country = "India";
		int i = 4;
		
		ZooFactory myFactory = new ZooFactory();
		
		Animal tiger = myFactory.createAnimal(name, country, i);
		
		Assert.assertEquals(name, tiger.getName() );
		Assert.assertEquals(country, tiger.getCountry());
		Assert.assertEquals(i, tiger.getVoteriQanak());
		// branch commit
	}
}
