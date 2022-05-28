
public class TotalSumOnBoundariesAndDiagonals {
	public static void totalSum(int[][] mat) {
        if (mat.length == 0)
        {
            System.out.print("0");
        }
        else
        {
            int sum=mat[0][0];
            //System.out.println("Elements added: row 0 col 0");
            //System.out.println(sum);
            for (int i=1;i<mat.length;i++)
        	{
                //System.out.println("Elements added: " + "row " + i + " col 0, " + "row 0 col " + i + ", row " + i + " col " + i);
                //System.out.println("Elements added: " + mat[i][0] + ", " + mat[0][i] + ", " + mat[i][i]);
            	sum += mat[i][0];
            	sum += mat[0][i];
            	sum += mat[i][i];
                //System.out.println(sum);
        	}
        
        	for (int i=1;i<mat[0].length-1;i++)
        	{
                //System.out.println("Elements added: " + "row " + (mat[0].length-1) + " col " + i + ", row " + i + " col " + (mat[0].length-1));
                //System.out.println("Elements added: " + mat[mat[0].length-1][i] + ", " + mat[i][mat[0].length-1]);
            	sum += mat[mat[0].length - 1][i];
            	sum += mat[i][mat[0].length - 1];
                //System.out.println(sum);
                
                for (int j=1;j<mat.length - 1;j++)
                {
                    if (i+j == (mat.length - 1) && i != j)
                    {
                        //System.out.println("Elements added: " + "row " + i + " col " + j);
                        sum += mat[i][j];
                        //System.out.println(sum);
                    }
                }
            
        	}
            System.out.print(sum);
            
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{1, 2, 3, 4 },
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}};
		totalSum(arr);

	}

}
