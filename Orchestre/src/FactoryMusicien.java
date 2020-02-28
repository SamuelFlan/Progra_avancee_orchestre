
public class FactoryMusicien {
	
	public InterfaceMusicien créerMusicien(char type) {
		switch(type) {
			case 'p': // Musicien piano
				MusicienPiano m1 = new MusicienPiano();
				return m1;
			case 't': // Musicien trompette
				MusicienTrompette m2 = new MusicienTrompette();
				return m2;
			case 'v': // Musicien violon
				MusicienViolon m3 = new MusicienViolon();
				return m3;
			default: // Musicien indéfini (sans instrument): on retourne null
				return null;
		}
	}
	
}
