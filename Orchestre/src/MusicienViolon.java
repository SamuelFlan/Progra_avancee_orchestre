import java.util.ArrayList;

public class MusicienViolon implements InterfaceMusicien {
	String instrument = "Violon"; 
	private ArrayList<Partition> listePartition = new ArrayList<Partition>();

	public void notificationPartition(Partition p) {
		listePartition.add(p);
		System.out.println(this + " possède une nouvelle partition.");
	}
	
	public String returnType() {return instrument;}
	public int nombrePartition() { return listePartition.size(); }
}
