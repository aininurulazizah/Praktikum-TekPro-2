import java.util.*;

/**
 * <h1>MultiDimensional Array</h1>
 * Program MultiDimensional Array ini digunakan 
 * latihan penggunaan array multidimensi
 * 
 * @author Aini Nurul Azizah
 * @since 2022-02-18
 */
public class MDArrayJava
{
	public static void main(String[] args)
	{
		//One Dimensional Arrays
		int[] fisrtArray = {2, 5, 3}; 
		int[] secondArray = {9, 5, 3}; 
		int[] thirdArray = {2, 4, 9}; 
		int[] fourthArray = {10, 11, 12}; 
		int[] fifthArray = {13, 14, 15}; 
		int[] sixthArray = {16, 17, 18}; 
		int[] seventhArray = {19, 20, 21}; 
		int[] eighthArray = {22, 23, 24}; 
		int[] ninthArray = {25, 26, 27}; 
		//Two Dimensional Arrays
		int[][] twoDimensionalArray1 = {fisrtArray, secondArray, thirdArray}; 
		int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
		int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
		//Three Dimensional Array
		int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};	
		//Access element 3D Array And Print it 
		for(int i = 0; i < 3; i++) {
			System.out.printf("{");
			for(int j = 0; j < 3; j++) {
				System.out.printf("{");
				for(int k = 0; k < 3; k++) {
					System.out.printf("%d ", threeDimensionalArray[i][j][k]);
				}
				System.out.printf("} ");
			}
			System.out.printf("}");
			System.out.printf("\n");
		}
		
 }
}

