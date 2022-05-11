import java.util.Scanner;

public class SearchElement {
    public static void main(String [] Args){
        int Arr[]={21,23,91,982,82,71,90,12};
        int key;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Key ");
        key=sc.nextInt();
        for (int i=0;i<Arr.length;i++)
        {
         if (Arr[i]==key)
         {
             System.out.println("Element found at index : "+ i );
             System.exit(0);
         }
        }
        System.out.println("Element not found");
    }
}

