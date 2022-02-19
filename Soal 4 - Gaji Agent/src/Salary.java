import java.util.*;

/**
 * <h1>Salary</h1>
 * Program Salary digunakan untuk menghitung gaji
 * plus bonus yang didapatkan oleh agen penjualan
 * sesuai dengan kriteria tertentu dari penjualan
 * yang berhasil dicapai agen. Kriteria :
 * 1. Bonus 25% dari total penjualan jika penjualan minimal 40 item
 * 2. Bonus 35% dari total penjualanjika penjualan lebih dari 80 item
 * 3. Denda 15% dari total 15 item dikurang penjualan, jika penjualan 
 *    kurang dari 15 item
 * 4. Selain dari ketiga ketentuan, bonus 10% dari total penjualan
 * 
 * @author Aini Nurul Azizah
 * @since 2022-02-18
 */
public class Salary {

	public static void main(String[] args) {
		int mainSalary = 500000;				// Besar gaji
		int price = 50000;						// Harga per item
		Scanner input = new Scanner(System.in);	// Deklarasi Scanner
		int item = input.nextInt();				// Terima input banyak item
		if(item < 15) {							// Ketentuan 3
			int salary = mainSalary - (((15 - item) * price) * 15/100);	// Denda 15%
			System.out.println(salary);
		}
		if(item >= 15 && item < 40) {			// Ketentuan 4
			int salary = mainSalary + ((item * price) * 10/100);		// Bonus 10%
			System.out.println(salary);
		}
		if(item >= 40 && item <= 80) {			// Ketentuan 1
			int salary = mainSalary + ((item * price) * 25/100);		// Bonus 25%
			System.out.println(salary);
		}
		if(item > 80) {							// Ketentuan 2
			int salary = mainSalary + ((item * price) * 35/100);		// Bonus 35%
			System.out.println(salary);
		}
		
	}

}

