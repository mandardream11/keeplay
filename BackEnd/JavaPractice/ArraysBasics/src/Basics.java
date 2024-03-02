public class Basics {

    public static void main(String[] Args)
    {
        int values [] = new int[100];
        values[0]= 100;
        values[1]=12222;
        values[2]=222;
        values[3]=3222;
        values[4]=4222;
        values[5]=5222;
        values[6]=6222;
        values[7]=7222;
       /* System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        System.out.println(values[3]);
        System.out.println(values[4]);
        System.out.println(values[5]);
        System.out.println(values[6]);
        System.out.println(values[7]);*/
        for(int j =0;j<values.length;j++)
        {
            System.out.println(values[j]);
        }

        String words[] = new String[]  {"Why","Testing","is","needed?"};
        for (int i=0;i<words.length;i++) {
            System.out.println(words[i]);
        }
        }


}
