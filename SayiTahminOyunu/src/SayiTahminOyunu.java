import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tahmin, can = 5, i = 0;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int sayi = random.nextInt(100);
		boolean oyunDurumu = false, hata = false;
		int tahminler[] = new int[5];

		System.out.println(sayi);
		System.out.println("Sayi tahmin oyununa hosgeldiniz");
		System.out.println("Lutfen 0-99 arasi bir sayi tutun");
		while (can > 0) {
			System.out.println("Tahimininiz : ");
			tahmin = scanner.nextInt();

			if ((tahmin < 0) || (tahmin > 99)) {
				// System.out.println("Lutfen 0-99 arasi bir sayi tutun");
				if (hata) {
					System.out.println("Cok fazla hatali giris yaptiniz 1 can kaybettiniz !");
					System.out.println("Kalan can : " + --can);
				} else {
					hata = true;
					System.out.println("Lutfen 0-99 arasi bir sayi tutun");
				}
				continue;
			}
			tahminler[i++] = tahmin;
			if (tahmin == sayi) {
				oyunDurumu = true;
				break;
			} else if (tahmin > sayi)
				System.out.println("Yanlis , (Tahmininiz sayidan daha buyuk) Kalan can: " + --can);
			else if (tahmin < sayi)
				System.out.println("Yanlis ,tekrar deneyiniz! (Tahmininiz sayidan daha kucuk) Kalan can: " + --can);

		}
		if (oyunDurumu) {
			System.out.println("Tebrikler DOGRU TAHMIN !");
			System.out.println("SAYIMIZ : " + sayi);
			System.out.println("KALAN CAN : " + can);
		} else {
			System.out.println("Basaramadiniz");
		}
		System.out.print("Tahminleriniz :");
		for (int value : tahminler) {
			if (value != 0)
				System.out.print(value + " ,");
		}

	}

}
