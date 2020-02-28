
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// On instancie la factory et on crée les musiciens grace à elle
		FactoryMusicien f = new FactoryMusicien();
		InterfaceMusicien mTrompette = f.créerMusicien('t');
		InterfaceMusicien mViolon = f.créerMusicien('v');
		InterfaceMusicien mPiano = f.créerMusicien('p');
		
		// On instancie le serveur
		Serveur serv = new Serveur();
		
		// On ajoute les musiciens au serveur
		serv.ajouteMusicien(mTrompette);
		serv.ajouteMusicien(mViolon);
		serv.ajouteMusicien(mPiano);
		
		// On crée deux partitions
		Partition p1 = new Partition("Fist part", 'G');
		Partition p2 = new Partition("In the hall of the moutain king", 'C');
		
		serv.sauvegardePartition(p1);
		serv.sauvegardePartition(p2);
		
	}

}
