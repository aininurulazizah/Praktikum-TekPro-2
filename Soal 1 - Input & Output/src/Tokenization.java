import java.util.*;

/**
 * <h1>Tokenization</h1>
 * Program Tokenization digunakan untuk melakukan tokenisasi
 * terhadap sebuah string, dengan delimiter atau pembatas
 * berupa spasi ( ), tanda seru (!), tanda tanya (?),
 * koma (,), titik (.), garis bawah (_), kutip satu ('),
 * dan simbol at (@); 
 * 
 * Modul StringTokenizer digunakan untuk melakukan tokenisasi
 * 
 * @author Aini Nurul Azizah
 * @since 2022-02-18
 */
public class Tokenization {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);			// Deklarasi scanner
		String words = input.nextLine();				// Terima masukkan pengguna berupa string
		//Penggunaan StringTokenizer, dengan string yang diproses adalah word, dan delimiter adalah spasi,'!?._@
		StringTokenizer token = new StringTokenizer(words, " ,'!?._@");
		System.out.println(token.countTokens());		// Menampilkan banyaknya token dengan modul countTokens()
		while(token.hasMoreTokens()) {					// Perulangan selama masih ada token
			System.out.println(token.nextToken());		// Menampilkan satu token
		}
	}

}

