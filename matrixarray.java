package Practice;

public class matrixarray {

	public static void main(String[] args) {
        int[][] a= new int[4][4];
       int row=0;int val=1;int col=0;
       for(col=0;col<4;col++)
       {
  
		a[row][col]=val;
    	   val++;
       }
       col=3;
       for(row=1;row<4;row++)
       {
    	   a[row][col]=val;
    	   val++;
       }
       row=3;
       for(col=2;col>=0;col--)
       {
    	   a[row][col]=val;
    	   val++;
       }
       col=0;
       for(row=2;row>=1;row--)
       {
    	   a[row][col]=val;
    	   val++;
       }
       row=1;
       for(col=1;col<3;col++)
       {
    	   a[row][col]=val;
    	   val++;
       }
       row=2;
       for(col=2;col>=1;col--)
       {
    	   a[row][col]=val;
    	   val++;
       }
        	for(row=0;row<4;row++)
        	{
                	for(col=0;col<4;col++)
        	{
        		System.out.print(a[row][col]+" ");
        	}
        	System.out.println();
        }
	}
	

}
