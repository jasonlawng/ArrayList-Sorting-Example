import java.util.ArrayList;
import java.util.Collections;

public class Main {

public static void main (String[] args) throws Exception {
    System.out.println(largestNum());
}

public static int largestNum() {
  
ArrayList<Integer> Numbers = new ArrayList<Integer>();
int[] myArray = {15, 42, 3, 64, 72, 89, 415};

for (int i = 0; i <= myArray.length - 1; i++) {
  Numbers.add(myArray[i]);
}

Collections.sort(Numbers);
return (Numbers.get(Numbers.size() - 1));
    }

}

// example of a method that returns the largest integer in an array
