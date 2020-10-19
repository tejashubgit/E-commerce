
public class multidimensionalArray {

	public static void main(String[] args) {
		
		
		//[row], [column]
		
			int a[][]= new int[2][3];
			
			a[0][0]=2;
			a[0][1]=4;
			a[0][2]=4;
			a[1][0]=5;
			a[1][1]=6;
			a[1][2]=5;
			
			int b[][]= {{1,2,3}, {4,5,6}};
			
			for(int i=0; i<2; i++) // row
			{
				for(int j=0; j<3; j++)
				{
				System.out.println(b[i][j]);
				}
			}
	}

}
