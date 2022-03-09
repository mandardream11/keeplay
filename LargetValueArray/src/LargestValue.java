import com.sun.codemodel.internal.JArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestValue {

        public static String findLargestNumber(List<Integer> nums)
        {
            Collections.sort(nums, (a, b) -> (String.valueOf(b) + a).compareTo(String.valueOf(a) + b));
            return nums.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(""));
        }

        public static void main(String[] args)
        {
            List<Integer> numbers = Arrays.asList(1, 34, 3, 98, 9, 76, 45, 4);

            String largestNumber = findLargestNumber(numbers);
            System.out.println("The largest number is " + largestNumber);
        }
    }


