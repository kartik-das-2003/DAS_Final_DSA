import java.util.*;

public class pattern_1
{
	public static void main(String[] args)
	{
		Scanner MyObj = new Scanner(System.in);
		System.out.printf("Enter Range:");
		int n = MyObj.nextInt();
		int A = 65 - (n - 1);

		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if( i+j >= (n-1)){
					System.out.printf(" %c ",A+i+j);
				}
				else{
					System.out.printf("   ");
				}
			}
			System.out.println();
		}
	}
}
