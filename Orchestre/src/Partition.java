
public class Partition {
	String nom;
	char tune;
	
	public Partition(String _nom, char _tune) {
		if ((_tune >= 'A') && (_tune <= 'G')) { // On vérifie que la tonalité est une lettre majuscule entre A et G.
			tune =_tune;
			nom = _nom;
		} else {
			System.err.println("Erreur: " + _tune + " doit être une lettre entre A et G.");
		}

	}
}
