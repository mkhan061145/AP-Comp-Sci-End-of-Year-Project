/**
 * @(#)BinarySearchTester.java
 *
 * BinarySearchTester application
 *
 * @Mariam Khan
 * @version 1.00 2017/3/22
 */
 import java.util.Arrays;
public class BinarySearchTester {
    
    public static void main(String[] args) {
    	
    	int[] array = {15, 62, 32, 72, 31, 17, 18, 100, 59, 95, 34, 65, 99};
    	int x = 45;
    	int y = 17;	
    	int z = 60;
    	System.out.println((System.nanoTime())/6/Math.pow(10, 10));	
    	MergeSorter sorter = new MergeSorter(array);
    	BinarySearcher searcher = new BinarySearcher(array);
    	
    	System.out.println("Original array: " + Arrays.toString(array));
    	sorter.sort();
    	System.out.println("Sorted array: " + Arrays.toString(array));
    	
    	System.out.println("Search for " + x + " should return -7");
    	System.out.println("Search for " + x + " returns " + searcher.search(x));
    	
    	System.out.println("Search for " + y + " should return 1");
    	System.out.println("Search for " + y + " returns " + searcher.search(y));
    	
    	System.out.println("Search for " + z + " should return -8");
    	System.out.println("Search for " + z + " returns " + searcher.search(z));
    	System.out.println((System.nanoTime())/6/Math.pow(10, 10));
    }
}
