public class InsertElementInArray {
    public static void main(String[] args) {
    int Arr[] = new int[10];
    Arr[0]=20;
    Arr[1]=143;
    Arr[2]=343;
    Arr[3]=29;
    Arr[4]=33;
    Arr[5]=309;
    int n=6;
    for (int i= 0;i<n;i++) {
        System.out.print(Arr[i] + " | ");
    }
    int x=20;
    int index = 2;

    for (int i=n;i>index;i--)
        Arr[i] = Arr[i - 1];
        Arr[index] = x;
        System.out.println("");
        for (int i= 0;i<Arr.length;i++) {
            System.out.print(Arr[i] + " | ");
        }
    }
}
