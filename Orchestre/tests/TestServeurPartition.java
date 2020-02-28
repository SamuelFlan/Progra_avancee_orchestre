import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestServeurPartition {

	@Test
	void AjoutPartitionServeur() {
	// On instancie le serveur et la FactoryMusicien
		Serveur serv = new Serveur();
		FactoryMusicien f = new FactoryMusicien();
				
	// On crée une partition
		Partition p = new Partition("In the hall of the moutain king", 'C');
		
		int nbp = serv.nombrePartition(); // Aucune partition pour le moment: ce nombre doit être égal à 0.
		serv.sauvegardePartition(p);
		assertEquals(nbp+1, serv.nombrePartition());
	}
	
	@Test
	void AjoutPartitionMusicien() {
	// On instancie le serveur et la FactoryMusicien
		Serveur serv = new Serveur();
		FactoryMusicien f = new FactoryMusicien();
			
	// On crée un musicien et on l'enregistre auprès du serveur
		InterfaceMusicien mTrompette = f.créerMusicien('t');
		serv.ajouteMusicien(mTrompette);
		
		int nbp = mTrompette.nombrePartition(); // Normalement 0
		
	// On crée une partition et on l'enregistre auprès du serveur
		Partition p = new Partition("In the hall of the moutain king", 'C');
		serv.sauvegardePartition(p);
		
	// Puisque le musicien l'a enregistré aussi, le nombre de partition doit être de nbp+1
		assertEquals(nbp+1, mTrompette.nombrePartition());

	}
}
