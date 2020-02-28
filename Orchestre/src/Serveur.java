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
	
	// Sauvegarde d'une partition dans le serveur + notification avec une partition auprès des musiciens
	public void sauvegardePartition(Partition p) {
		listePartition.add(p);
		notifierMusiciens(p);
	}
	
	// Sauvegarde d'une partition auprès de chaque musicien
	public void notifierMusiciens(Partition p) {
		for(InterfaceMusicien m : listeMusicien) {
			m.notificationPartition(p);
		}
	}
	
	public int nombreMusicien()  { return listeMusicien.size();  } // Nombre de musiciens
	public int nombrePartition() { return listePartition.size(); } // Nombre de partitions
	
	public final static Serveur getInstance() { return instance; } 
}
