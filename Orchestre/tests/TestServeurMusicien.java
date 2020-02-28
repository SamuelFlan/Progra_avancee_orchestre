import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestServeurMusicien {
	
	@Test
	void ajoutMusicien() {
		// On instancie le serveur et la FactoryMusicien
		Serveur serv = new Serveur();
		FactoryMusicien f = new FactoryMusicien();
		
		// On crée un musicien
		InterfaceMusicien mTrompette = f.créerMusicien('t');

		// Actuellement, notre serveur est vide. Le nombre de musiciens doit être à 0. 
		int nbm = serv.nombreMusicien();
		
		// Après ajout, Le nombre de musiciens doit être à 1. 
		serv.ajouteMusicien(mTrompette);
		
		// On vérifie que le musicien à bien été ajouté. 
		assertEquals(nbm +1, serv.nombreMusicien());
	}
	
	@Test
	void supprMusicien() {
		// On instancie le serveur et la FactoryMusicien
			Serveur serv = new Serveur();
			FactoryMusicien f = new FactoryMusicien();
				
		// On crée deux musicien et on les ajoute au serveur
			InterfaceMusicien mTrompette = f.créerMusicien('t');
			InterfaceMusicien mViolon = f.créerMusicien('v');
			serv.ajouteMusicien(mTrompette);
			serv.ajouteMusicien(mViolon);
			
		// Le nombre de musiciens dans le serveur doit être à 2. 
			int nbm = serv.nombreMusicien();
			
		// On supprime un musicien, puis on vérifie que le nombre de musiciens est égal à nbm - 1
			serv.supprimeMusicien(mTrompette);
			assertEquals(nbm -1, serv.nombreMusicien());
	}
}
