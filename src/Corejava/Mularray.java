package Corejava;

public class Mularray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{2,5,77},{66,4,99},{8,65,1}};
		int min=a[0][0];
		int mincol=0;
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if(min>a[i][j])
				{
					min=a[i][j];
					mincol=j;
				}
			}
		}
		System.out.println("Min num is "+min);
		int k=0;
		int maxnum=a[0][mincol];
		while(k<3)
		{
			if(maxnum<a[k][mincol])
			{
				maxnum=a[k][mincol];
			}
			k++;
		}
		System.out.println("Max num is min num col is " +maxnum);
		System.out.println("Hi this is asian guy");
	}

}
