import java.util.Arrays;

public class SortingAlgorithm{

    /*A sorting algorithm that sorts strings based on the ASCII code 
    of the third letter first, then second letter and then the first letter.*/

    private static String [] arrayStrings = {"BOAT", "Locomotive", "Poet", "Accelerate", "GOLF", "ACCIDENTAL", "Submarine"};
     
    public static void main(String[] args) {
        
        sort(arrayStrings);
        System.out.println(Arrays.toString(arrayStrings));

    }

    public static void sort(String [] arrayStrings){

        for(int i = 0; i < arrayStrings.length; i++){

            for(int j = 1; j < (arrayStrings.length - 1); j++){

                int k = j - 1;
                int compare3 = Character.compare(arrayStrings[j].charAt(2), arrayStrings[k].charAt(2));

                if(compare3 < 0){
                swap(arrayStrings, j, k);
                }
    
            }

            for(int j = 1; j < (arrayStrings.length - 1); j++){

                int k = j - 1;
                int compare2 = Character.compare(arrayStrings[j].charAt(1), arrayStrings[k].charAt(1));

                if(compare2 < 0){
                swap(arrayStrings, j, k);
                }
    
            }

            for(int j = 1; j < (arrayStrings.length - 1); j++){

                int k = j - 1;
                int compare1 = Character.compare(arrayStrings[j].charAt(0), arrayStrings[k].charAt(0));

                if(compare1 < 0){
                swap(arrayStrings, j, k);
                }
    
            }
        }

    }
        
    public static <T> void swap(T [] array, int first, int second){

        T temp = array[first];
        array[first] = array[second];
        array[second] = temp;

    }
    
}