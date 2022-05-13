public class TwoDimensionalArrayMatrix {
    public static void main(String[] args){
        int A[][]= {{1,2,3},{2,1,4},{3,1,5}};
        int B[][]= {{2,1,1},{3,5,8},{7,5,6}};
        int C[][] = new int[3][3];

        System.out.println("Addition of 2D Matrix");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(" ");
                System.out.print(C[i][j]);
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Multiplication of 2D Matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                C[i][j]=0;
                for (int k=0;k<3;k++)
                {
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
                System.out.print(" ");
                System.out.print(C[i][j]);
            }
            System.out.println("");
        }
    }
}
