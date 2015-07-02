import java.util.Scanner;


public class LiczbyPierwsze {
	
	private static int iloscLiczb;
	private static Scanner scan;
	private static int[] tablicaLiczb;
	private static int licznik = 0;
	
	//Mutator - utawienie wartoœci pola
	public void setIloscLiczb(int iloscLiczbDoSprawdzenia)
	{
		iloscLiczb = iloscLiczbDoSprawdzenia;
	}
	
	//Akcessor - wyrzucenie wartoœci pola
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
		tablicaLiczb = new int[iloscLiczb];
		
		for(int i = 0; i < getIloscLiczb(); i++)
		{
			tablicaLiczb[i] = scan.nextInt();
		}
		
		System.out.println("Liczby pierwsze: to");
		LiczeniePierwszej liczeniePierwszej = new LiczeniePierwszej();
		liczeniePierwszej.czyPierwsza(tablicaLiczb);		
	}
}
