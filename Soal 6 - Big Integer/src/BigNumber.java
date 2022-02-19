import java.util.*;
import java.math.*;

/**
 * <h1>Big Number</h1>
 * Program Big Number digunakan untuk latihan penggunaan
 * Big Integer, yakni proses terima input BigInteger,
 * proses aritmatika penjumlahan dan perkalian
 * 
 * @author Aini Nurul Azizah
 * @since 2022-02-18
 */
public class BigNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	 // Deklarasi Scanner
		BigInteger a = input.nextBigInteger();	 // Terima Input a
		BigInteger b = input.nextBigInteger();	 // Terima Input b
		BigInteger sum = a.add(b);				 // Penjumlahan a dan b
		BigInteger multi = a.multiply(b);		 // Perkalian a dan b
		System.out.println(sum);
		System.out.println(multi);
	}

}

