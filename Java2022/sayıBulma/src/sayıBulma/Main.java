package sayıBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {4,6,9,11,50};
		int aranacak = 4;
		boolean mevcutMi = false;
		for (int sayi : sayilar) {
			if (sayi==aranacak) {
			mevcutMi=true;
			break;
			}
	
		}
		
		if (mevcutMi) {
			System.out.println("Sayı mevcuttur.");
		} else {
			System.out.println("Sayı mevcut değildir.");
		}
		
	}

}
