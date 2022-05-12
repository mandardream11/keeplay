public class SecondLargestElement {
    public static void main(String[] args){
        int Arr[] = {21,91,88,211,32,9811,8911,9812};
        int max1,max2;
        max1=Arr[0];
        max2=Arr[0];
        for (int i=0;i<Arr.length;i++){
            if(Arr[i]>max1){
                max2=max1;
                max1=Arr[i];
            }
        }
        System.out.println("Largest Number in Array is : " + max1);
        System.out.println("Second Largest Number in Array is : "+ max2);
    }
}
