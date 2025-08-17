import java.util.Arrays;

public class arrays_function {
	public static void main(String[] args) {
		int a[]= {7,5,2,58,14,58,1,5,5,7,5,74};
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println();
		//Arrays.sort(a);//sort help in sort of array
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(a));//this is use to print array in one go
		
		int x[]= {2,3,9};
		int y[]= {2,3,9};
		int z[]= {8,7,5,6};
		int yy[]= {9,2,3};
		int[][] m2 = {
    		    {1, 2, 3},
    		    {4, 5, 6},
    		    {7, 8, 9}
    		};
		int[][] m1 = {
    		    {1, 2, 3},
    		    {4, 5, 6},
    		    {7, 8, 9}
    		};
		System.out.println(Arrays.equals(x, y));//equals compare two arrarys 
		System.out.println(Arrays.equals(x, z));
		System.out.println(Arrays.equals(x, yy));
		System.out.println(Arrays.deepEquals(m1, m2));//deep equale compare 
	}
}
