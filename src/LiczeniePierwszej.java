//zak�adamy �e dostajemy wype�niona tablic�
//dwie metody
//1. sprawdzanie czy liczba jest pierwsza\
//2. wy�wietalnie liczby pierwszej
public class LiczeniePierwszej {
	
	private int licznik = 0;
	
	public void czyPierwsza(int[] tablicaLiczba)
	{
		for(int i = 0; tablicaLiczba.length > i; i++)
		{
			for (int j = 1; j < tablicaLiczba[i]; j++)
			{
				if (tablicaLiczba[i] % j == 0)
				{		
					licznik ++;	
				}
			}
			
			if (licznik == 1)
			{
				System.out.println(tablicaLiczba[i]);
			}
			
			licznik = 0;
		}	
	}
}
