import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);  
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallest = MainProgram.smallest(array);
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == smallest){
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int index = startIndex;
        int smallest = table[startIndex];
        for (int i = startIndex; i < table.length; i++){
            if (table[i] < smallest){
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int one = array[index1];
        int two = array[index2];
        
        array[index1] = two;
        array[index2] = one;
    }
    
    public static void sort(int[] array){
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++){
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }
}
