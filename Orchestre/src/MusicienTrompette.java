import java.util.ArrayList;

public class MusicienTrompette implements InterfaceMusicien  {
	String instrument = "Trompette"; 
	private ArrayList<Partition> listePartition = new ArrayList<Partition>();

	public void notificationPartition(Partition p) {
		listePartition.add(p);
		System.out.println(this + " possède une nouvelle partition.");
	}
}
