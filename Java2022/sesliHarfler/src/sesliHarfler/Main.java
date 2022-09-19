package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'İ';
		switch (harf) {
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
		System.out.println("İnce sesli harf");
		break;
		
		default:
			System.out.println("Kalın sesli harf");
		}

	}

}
