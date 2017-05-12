/**
 * @(#)InsertionSortTester.java
 *
 * InsertionSortTester application
 *
 * @Mariam Khan 
 * @version 1.00 2017/3/23
 */
import java.util.Arrays; 
public class InsertionSortTester {
    
    public static void main(String[] args) {
    
    String[] array = {"Bob", "AppLe", "PIe", "Cake", "Pizza", "pasta", "CUSTARD", "pineApPle", "crUMBLE", "texas", "HOWDy", "SAMOSAS"};
    System.out.println("Orignal array: " + Arrays.toString(array));
    
    InsertionSorter sorter = new InsertionSorter(array);
    sorter.sort();
    
    System.out.println("Sorted array: " + Arrays.toString(array)); 	

    }
}
