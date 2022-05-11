public class SumOfElements {

    public static void main(String[] args)
    {
        int Arr [] = {21,23,22,34,42,12,43,41,32};

        int sum=0;

        for (int i=0;i< Arr.length;i++)
        {
            sum = sum + Arr[i];
        }
        System.out.println("Sum of Array is : " + sum);

    }
}
