import java.util.*;

/**
 * <h1>Formatted Output</h1>
 * Program Formatted Output digunakan untuk formatting output
 * pada java. Output di sini akan diformat sebagai integer
 * tiga digit. Hal ini bisa dicapai dengan menggunakan
 * system output printf dengan format %03d
 * 
 * @author Aini Nurul Azizah
 * @since 2022-02-18
 */
public class FormattedOutput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		// Deklarasi Scanner
		char konfirm = 'y';							// Deklarasi variabel y untuk keperluan perulangan input
		while(konfirm == 'y') {						// Perulangan selama pengguna mengetik y
			String word = input.next();				// Terima masukkan pengguna berupa string
			int num = input.nextInt();				// Terima masukan pengguna berupa integer yg akan diformat
			System.out.println("=======================");
			System.out.printf("%s	   %03d\n", word, num);		// Menampilkan integer yang sudah diformat 3 digit
			System.out.println("=======================");
			System.out.println("Enter y to repeat, n to stop");
			konfirm = input.next().charAt(0);		// Terima input apakah pengguna ingin mengulangi proses atau tidak
		}

	}

}


