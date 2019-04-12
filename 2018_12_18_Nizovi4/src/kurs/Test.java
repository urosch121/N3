package kurs;

import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		int n,m;
		Scanner in = new Scanner(System.in);
		System.out.print("Koliko clanova niza zelite: ");
		n = in.nextInt();
		
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			System.out.print("a[" + i + "] = ");
			a[i] = in.nextInt();
		}
		
		System.out.print("Koliko clanova niza zelite: ");
		m = in.nextInt();
		
		int b[] = new int[m];
		
		for(int i = 0; i < m; i++)
		{
			System.out.print("b[" + i + "] = ");
			b[i] = in.nextInt();
		}
		
		System.out.print("a: ");
		for(int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();

		System.out.print("b: ");
		for(int i = 0; i < m; i++)
			System.out.print(b[i] + " ");
		System.out.println();

		// Podskup skupa
		int br = 0;
		boolean flag = true; // svi koje smo trenutno gledali iz b (ni jedan) se nalaze u a
		for(int i = 0; i < m && flag == true; i++)
		{
			boolean ind = false; // nema elemanta b[i] u nizu a
			// trazim da li postoji b[i] u nizu a
			for(int j = 0; j < n && ind == false; j++) // isto je pitati ind == false ili !ind
				if(a[j] == b[i])
					ind = true; // nasao sam - postoji
			
			/*if(ind)
				System.out.println("postoji " + b[i]);
			else
				System.out.println("ne postoji " + b[i]);*/
			
			/*if(ind)
				br++;*/ // prebrojimo one koje pronasli iz b u a
		
			if(!ind) // ako se b[i] ne nalazi u a
				flag = false; 
		}
		
		/*if(br == m)
			System.out.println("Nalazi se ceo b u a");
		else
			System.out.println("NE nalazi se ceo b u a");*/
		
		if(flag)
			System.out.println("Nalazi se ceo b u a");
		else
			System.out.println("NE nalazi se ceo b u a");
	}

}
