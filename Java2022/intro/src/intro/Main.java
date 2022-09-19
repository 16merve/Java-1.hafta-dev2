package intro;

import java.awt.SystemColor;
import java.util.Iterator;

public class Main {
//Main javada başlangıç noktasıdır.
	public static void main(String[] args) {
		System.out.println("Hello world!");

		String ortaMetin = "İlginizi çekebilir" ;
		String altMetin = "Vade süresi"	;
		
		System.out.println(ortaMetin);
		//integer
		int vade = 12;
		//eşitlik durumunun gösterimi
		double dolarDun = 18.20;
		double dolarBugun = 18.20;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) { 
			okYonu = "down.svg";
			System.out.println(okYonu);
		}else if (dolarBugun>dolarDun) {
			okYonu = "up.svg";
            System.out.println(okYonu);
		}
		
		else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
		}
		//array liste
		
		String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan","Mutlu Emekli"};
		
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		
		for (int i = 0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
			
		}
	}

}
