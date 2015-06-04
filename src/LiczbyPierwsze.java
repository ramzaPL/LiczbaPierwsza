import java.util.Scanner;


public class LiczbyPierwsze {
	
	static int iloscLiczb;
	static Scanner scan;
	static int[] tablicaLiczb;
	static int licznik = 0;
	
	public static void main(String[] args) {
		System.out.println("Podaj ilosc liczb do sprwdzenia:");
		scan = new Scanner(System.in);
		iloscLiczb = scan.nextInt();
		
		while (iloscLiczb < 1)
		{
			iloscLiczb = scan.nextInt();
		}
		
		System.out.println("Podaj kolejne liczby:");
		tablicaLiczb = new int[iloscLiczb];
		
		for(int i = 0; i < iloscLiczb; i++)
		{
			tablicaLiczb[i] = scan.nextInt();
		}
		
		System.out.println("Liczby pierwsze: to");
		
		for(int i = 0; iloscLiczb > i; i++)
		{
			for (int j = 1; j < tablicaLiczb[i]; j++)
			{
				if (tablicaLiczb[i] % j == 0)
				{		
					licznik ++;	
				}
			}
			
			if (licznik == 1)
			{
				System.out.println(tablicaLiczb[i]);
			}
			
			licznik = 0;
		}
		
		
	}

}
