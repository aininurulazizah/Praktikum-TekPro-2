import java.util.*;

/**
 * <h1>Calculator</h1>
 * Program Calculator digunakan untuk memproses
 * perhitungan aritmatika sesuai dengan masukkan
 * pengguna. Operasinya diantaranya +,-,*,/,%
 * 
 * @author Aini Nurul Azizah
 * @since 2022-02-18
 */
public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Deklarasi scanner
		int num1 = input.nextInt();				// Terima input untuk angka1
		char opr = input.next().charAt(0);		// Terima input untuk operasi
		int num2 = input.nextInt();				// Terima input untuk angka2
		if(opr == '+') {				// Jika operasi +
			int result = num1 + num2;	// Tambahkan angka1 dan angka2
			System.out.println(result); // Tampilkan hasilnya
		}
		if(opr == '-') {				// Jika operasi -
			int result = num1 - num2;	// Tambahkan angka1 dan angka2
			System.out.println(result);	// Tampilkan hasilnya
		}
		if(opr == '*') {				// Jika operasi *
			int result = num1 * num2;	// Kalikan angka1 dan angka2
			System.out.println(result);	// Tampilkan hasilnya
		}
		if(opr == '/') {				// Jika operasi /
			float result = (float) num1 / num2;		// Bagi angka1 dengan angka2
			System.out.println(result);	// Tampilkan hasilnya
		}
		if(opr == '%') {				// Jika operasi %
			int result = num1 % num2;	// Angka1 dimod dengan angka2
			System.out.println(result);	// Tampilkan hasilnya
		}

	}

}

