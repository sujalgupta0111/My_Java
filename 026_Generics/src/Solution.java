import java.util.ArrayList;

public class Solution
{
	public static void main(String ...strings )
	{
		ArrayList<Integer> a = new ArrayList<>();
		//a.add("String");/*compile time error*/
		
		a.add(898);/*it beame type safe now */
	}
}