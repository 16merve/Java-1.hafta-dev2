
public class Main {

	public static void main(String[] args) {
	int sayi1 = 32;
	int sayi2 = 20;
	int sayi3 = 60;
	
	int enBuyuk = sayi2;
	
	if (enBuyuk<sayi1) {
		enBuyuk = sayi1;
	}

	if (enBuyuk<sayi3) {
		enBuyuk = sayi3;
	}
	
	System.out.println("En büyük = "+enBuyuk);
	}

}
