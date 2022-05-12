import com.sun.org.apache.bcel.internal.generic.NEW;

public class RotationOfElements {
    public static void main(String [] args)
    {
        //Left rotation of Elements
        System.out.println("Left rotation of Elements ");
        System.out.println("=========================");
        int Arr [] = {21,23,82,988,92,837,736,81,72,71};
        for(int j:Arr)
        {
            System.out.print(j+"|");
        }
        int temp = Arr[0];
        for (int i=1;i<Arr.length;i++){
            Arr[i-1]=Arr[i];
        }
        Arr[Arr.length-1] = temp;
        System.out.println("");
        for(int j:Arr)
        {
            System.out.print(j+"|");
        }
        System.out.println("");
        System.out.println("");



        //Right rotation of Elements
        System.out.println("Right rotation of Elements ");
        System.out.print("=========================");
        int NewArr[]={21,32,34,43,54,654,76,87,90,91,1};
        System.out.println("");
        for (int k:NewArr)
        {
            System.out.print(k+"|");
        }
        int lasttemp = NewArr[NewArr.length-1];
        int len = NewArr.length;
        for (int l=len-2;l>=0;l--)
        {
            NewArr[l+1] =NewArr[l];
        }
        NewArr[0]=lasttemp;
        System.out.println("");
        for (int m:NewArr)
        {
            System.out.print(m+"|");
        }
    }
}
