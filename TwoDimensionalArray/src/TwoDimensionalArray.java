public class TwoDimensionalArray {
    public static void main(String[] args){
        //Printing 2D array
        int A[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for (int i=0;i<A.length;i++)
        {
         for (int j=0;j<A[0].length;j++)
         {
             System.out.print(A[i][j]);
         }
            System.out.print("|");
        }
    }
}
