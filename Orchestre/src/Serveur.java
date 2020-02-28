import java.util.ArrayList;

// Singleton Serveur
public class Serveur {
	
	ArrayList<InterfaceMusicien> listeMusicien  = new ArrayList<InterfaceMusicien>();
	ArrayList<Partition>		 listePartition = new ArrayList<Partition>();

	public void ajouteMusicien(InterfaceMusicien m) {
		listeMusicien.add(m);
	}
	
	public void supprimeMusicien(InterfaceMusicien m) {
		listeMusicien.remove(m);
	}
	
	public int nombreMusicien()  { return listeMusicien.size();  }
	public int nombrePartition() { return listePartition.size(); }
	
}
