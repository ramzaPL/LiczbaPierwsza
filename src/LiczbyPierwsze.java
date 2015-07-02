import java.util.Scanner;


public class LiczbyPierwsze {
	
	private static int iloscLiczb;
	private static Scanner scan;
	private static int[] tablicaLiczb;
	private static int licznik = 0;
	
	//Mutator - utawienie warto�ci pola
	public void setIloscLiczb(int iloscLiczbDoSprawdzenia)
	{
		iloscLiczb = iloscLiczbDoSprawdzenia;
	}
	
	//Akcessor - wyrzucenie warto�ci pola
	public static int getIloscLiczb()
	{
		return iloscLiczb;
	}	
	
	public static void main(String[] args) {
		
		LiczbyPierwsze liczbyP = new LiczbyPierwsze();
		
		System.out.println("Podaj ilosc liczb do sprwdzenia:");
		scan = new Scanner(System.in);
		liczbyP.setIloscLiczb(scan.nextInt());
		
		while (getIloscLiczb() < 1)
		{
			liczbyP.setIloscLiczb(scan.nextInt());
		}
		
		System.out.println("Podaj kolejne liczby:");
		
		//teraz to		
		tablicaLiczb = new int[iloscLiczb];
		
		for(int i = 0; i < getIloscLiczb(); i++)
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
