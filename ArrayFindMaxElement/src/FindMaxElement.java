public class FindMaxElement {
    public static void main(String [] args)
    {
        int Arr [] = {21,22,17,872,928,7182,7263,8173,9191};
        int max=Arr[0];
        for (int i=0;i<Arr.length;i++)
        {
            if(Arr[i]>max)
            {
                max=Arr[i];
            }
        }
        System.out.println("Maximum value in an array is : " +max);
    }
}
