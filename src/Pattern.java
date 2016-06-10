import java.util.Scanner;

public class Pattern 
{
	public static void main(String[] args)
	{
		System.out.println("Enter Pallendrom Width in Integer Value: ");
		Scanner input = new Scanner(System.in);
		int Pallendrom_height,Pallendrom_width = input.nextInt();
		Pallendrom_height = Pallendrom_width*2-1;
		
		String result = ""; 
		for (int i=1; i<=(Pallendrom_height); i++)
		{
			result = "";
			if (i<=Pallendrom_width){
				for (int j=1; j<=i; j++){
					result +=j;
				}
				System.out.println(result);
			}
			else
			{
				for (int j=1; j<=(Pallendrom_height+1-i); j++){
					result +=j;
				}
				System.out.println(result);
			}
		}	
	}
}