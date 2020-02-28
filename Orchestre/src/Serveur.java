import java.util.ArrayList;

// Singleton Serveur
public class Serveur {
	
	private final static Serveur instance = new Serveur(); // Afin de n'en avoir qu'un seul, on le crée à l'initialisation
 	
	// ArrayList qui stockent les musiciens et les partitions
	private ArrayList<InterfaceMusicien> listeMusicien  = new ArrayList<InterfaceMusicien>();
	private ArrayList<Partition>		 listePartition = new ArrayList<Partition>();

	// Ajout d'un musicien à la liste	
	public void ajouteMusicien(InterfaceMusicien m) { 
		listeMusicien.add(m);
	}
	
	// Suppression d'un musicien de la liste	
	public void supprimeMusicien(InterfaceMusicien m) {
		listeMusicien.remove(m);
	}
	
	public void sauvegardePartition(Partition p) {
		listePartition.add(p);
		notifierMusiciens(p);
	}
	
	public void notifierMusiciens(Partition p) {
		for(InterfaceMusicien m : listeMusicien) {
			m.notificationPartition(p);
		}
	}
	
	public int nombreMusicien()  { return listeMusicien.size();  }
	public int nombrePartition() { return listePartition.size(); }
	
	public final static Serveur getInstance() { return instance; }
}
