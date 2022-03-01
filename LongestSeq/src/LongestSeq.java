import java.sql.SQLOutput;

public class LongestSeq {
    public static void main(String[] args) {
        String str = "2222222Asasdssd11111111111111111111111";
        //System.out.println(str.length());
        int count =1;
        int max = 0;
        boolean onlyDigit = Character.isDigit(str.charAt(0));
        if(str.length()==1 && (onlyDigit))
        {
            System.out.println(count);
        }
        else {
            for (int i = 0; i < str.length() - 1; i++) {
                boolean digit = Character.isDigit(str.charAt(i));
                //System.out.println(digit);
                if (digit) {
                    boolean newDigit = Character.isDigit(str.charAt(i + 1));
                    // System.out.println(newDigit);
                    if (newDigit) {
                        if (str.charAt(i) == str.charAt(i + 1)) {
                            count = count + 1;
                        } else {
                            count = 1;
                        }
                    }
                } else
                    count = 1;
                max = Math.max(max, count);
            }
            System.out.println(max);
        }
    }
}