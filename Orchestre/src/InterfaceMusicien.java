
public interface InterfaceMusicien {
	
	// Ajout d'une partition dans la liste que chaque musicien possède
	public void notificationPartition(Partition p);
	
	// Type d'instrument: "Piano" / "Violon" / "Trompette" par exemple.
	public String returnType();
	
	// Retourne le nombre de partitions enregistré auprès du musicien
	public int nombrePartition(); 
}
