package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		   
		   int n=in.nextInt();
		   
		   int[] a=new int [n+1];
		   
		   int i,j;
		   
		   for (i=2;i<=n;i++)
		   {
			   a[i]=1;
		   }
		   int sqrtn=(int) Math.sqrt((n));
		   for (i=2;i<=sqrtn;i++)
		   {
			   if (a[i]==1)
			   {
				   for (j=i+1;j<=n;j++) 
				   {
					   if (j%i==0)
						   a[j]=0;
				   }
			   }
		   }
		   for (i=0;i<=n;i++)
		   {
			   if (a[i]==1)
				   System.out.println(i);
		   }
	}

}
