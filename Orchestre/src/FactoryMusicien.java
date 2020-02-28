
public class FactoryMusicien {
	
	public InterfaceMusicien créerMusicien(char type) {
		switch(type) {
			case 'p':
				MusicienPiano m1 = new MusicienPiano();
				return m1;
			case 't':
				MusicienTrompette m2 = new MusicienTrompette();
				return m2;
			case 'v':
				MusicienViolon m3 = new MusicienViolon();
				return m3;
			default:
				return null;
		}
	}
	
}
