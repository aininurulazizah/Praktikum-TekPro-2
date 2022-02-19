import java.util.*;

/**
 * <h1>Buka Tutup Jalan</h1>
 * Program Buka Tutup Jalan dibuat untuk menentukan
 * keluaran "Jalan" atau "Berhenti" (untuk ilustrasi 
 * jalan) sesuai dengan kriteria :
 * 1. Akan ada 4 nomor yang menggambarkan nomor
 *    plat 4 mobil
 * 2. Keempat nomor plat disatukan dan hasilnya dikurang
 *    999999
 * 3. Hasil pengurangan dibagi 5
 * 4. Jika hasil bagi 0, maka tampilkan "Jalan"
 * 5. Jika hasil bagi bukan 0, maka tampilkan "Berhenti"   
 * 
 * @author Aini Nurul Azizah
 * @since 2022-02-18
 */
public class BukaTutupJalan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Deklarasi Scanner
		String plat = input.nextLine();			// Terima input dalam bentuk string
		String numberString = "";				// Deklarasi string penampung plat
		// Masukkan ditokeniasasi dengan delimiter spasi
		StringTokenizer token = new StringTokenizer(plat, " ");		
		while(token.hasMoreTokens()) {
			// Tiap hasil token dimasukkan ke numberString
			numberString = numberString + token.nextToken();
		}
		// Nomor plat yang sudah disatukan dikonversi ke long integer
		long number = Long.parseLong(numberString);
		int rule = (int)((number - 999999) % 5); // number dioperasikan sesuai ketentuan
		if(rule == 0) {		// Jika hasil operasi tadi 0
			System.out.println("Jalan");	// Tampilkan "Jalan"
		} else {			// Jika bukan 0
			System.out.println("Berhenti");	// Tampilkan "Berhenti"
		}
	}

}

