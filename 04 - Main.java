import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] array2 = {"Hi", "Bye"};
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(8);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hi");
        strings.add("Bye");
        sort(array);
        sort(array2);
        sortIntegers(numbers);
        sortStrings(strings);
        
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(numbers);
        System.out.println(strings);
    }
    
    public static void sort(int[] array){
        Arrays.sort(array);
    }
    
    public static void sort(String[] array){
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }
}
