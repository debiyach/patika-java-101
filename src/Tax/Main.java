package Tax;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double price,total, taxWithoutPrice, tax = 0 ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ücret tutarını giriniz: ");
		price = input.nextDouble();
		
		if (price >= 0 && price <= 1000) {
			tax = 0.18F;
		}else if (price > 1000) {
			tax = 0.08F;
		}else {
			System.out.println("Geçersiz ücret tutarı girdiniz!");
			System.exit(0);
		}
		
		taxWithoutPrice = price * tax;
		total = price + taxWithoutPrice;
		
		System.out.println("KDV oranı: " + tax);
		System.out.println("KDV tutar: " + taxWithoutPrice);
		System.out.println("KDV li tutar: "+ total);
		
	}
}
