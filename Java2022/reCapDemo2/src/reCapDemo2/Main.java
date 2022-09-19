package reCapDemo2;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		double[] myList = {2.4,5.6,7.8,9.2};
		double total=0;
		double max = myList[0];
		
		for (double number: myList) {
	        System.out.println(number);
			total = total + number;
			if (max<number) {
				max = number;
			}
			
		}
		    System.out.println("Toplam = "+total);
		    System.out.println("En büyük sayı = "+max);
		}

	}


