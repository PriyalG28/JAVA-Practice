package module1Java2;

public class PrintLikeWave {
	public static void wavePrint(int mat[][]){
		//Your code goes here
        int row = mat.length;
        int col = mat[0].length;
     
        for(int j=0; j<col; j++){
            for(int i=0; i<row; i++){
                if(j%2 == 0){
                   System.out.print(mat[i][j]+" "); 
                }
                else{
                    System.out.print(mat[mat.length -1 -i][j]+" ");

                }
                

            }
                

            }
        }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{1, 2, 3, 4 },
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}};
		wavePrint(arr);
		String s = "";
		
	}

}
