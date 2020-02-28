import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFactoryMusicien {

	@Test
	void musicienConnu() {
		// On instancie la FactoryMusicien
		FactoryMusicien f = new FactoryMusicien();
		
		// On crée un musicien avec un type connu
		InterfaceMusicien mTrompette = f.créerMusicien('t');
		 
		assertEquals("Trompette", mTrompette.returnType()); 
	}

	@Test
	void musicienInconnu() {
		// On instancie la FactoryMusicien
			FactoryMusicien f = new FactoryMusicien();
				
		// On crée un musicien avec un type connu
			InterfaceMusicien mInconnu = f.créerMusicien('o'); // On donne un type inconnu par la factory
			
		assertEquals(null,mInconnu);
	}
	
}
