import java.util.ArrayList;

public class MusicienPiano implements InterfaceMusicien {
	String instrument = "Piano"; 
	private ArrayList<Partition> listePartition = new ArrayList<Partition>();

	public void notificationPartition(Partition p) {
		listePartition.add(p);
		System.out.println(this + " possède une nouvelle partition.");
	}

}
