package Corejava;

public class Multidimenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multidimenarray g = new Multidimenarray();
		
	//	int a[][] = new int [3][3];
		int a[][] = {{3,4,2},{22,5,66},{77,8,99}};
		/*a[0][0]=11;
		a[0][1]=23;
		a[1][0]=22;
		a[1][1]=99;
		a[2][0]=87;
		a[2][1]=56;
		int b[][] = {{2,3,4},{99,88}};
		System.out.println(b[0][1]);
		System.out.println(a[2][0]); */
		int min = a[0][0];
		int mincol=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
					mincol=j;
				}
			//	System.out.print(a[i][j]);
			//	System.out.print("\t");
			}//System.out.println();
		}
		System.out.println("Min num is "+min);
		System.out.println("length of array is "+ a.length);
		int k=0;
		int maxnum=a[k][mincol];
		while(k<3)
		{
			if(maxnum<a[k][mincol]) {
			maxnum=a[k][mincol];
			}
		}
		System.out.println("Max num is "+maxnum);
		
		

	}

}