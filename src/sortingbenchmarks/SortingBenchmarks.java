/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingbenchmarks;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Siam
 */
public class SortingBenchmarks{

    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int[] testCase;
        Random r = new Random();
        
        System.out.println("How many different sizes of arrays do you wish to try? ");
        int intMax = input.nextInt();
        
        int num = 10;
        for ( int j = 1; j <= intMax; j++){
            testCase = new int[num];
            for (int i = 0; i < num; i++){
                testCase[i] = r.nextInt(num);
            }
        
            long startTimeBubble = System.nanoTime();
            int[] bubbleSorted = BubbleSort(testCase);
            long stopTimeBubble = System.nanoTime();
        
            long startTimeSelection = System.nanoTime();
            int[] selectionSorted = SelectionSort(testCase);
            long stopTimeSelection = System.nanoTime();
        
            long startTimeInsertion = System.nanoTime();
            int[] insertionSorted = InsertionSort(testCase);
            long stoptTimeInsertion = System.nanoTime();
            
            long startTimeQuick = System.nanoTime();
            QuickSort(testCase, 0, num - 1);
            long stopTimeQuick = System.nanoTime();
            
            long bubbleTime = stopTimeBubble - startTimeBubble;
            long selectionTime = stopTimeSelection - startTimeSelection;
            long quickTime = stopTimeQuick - startTimeQuick;
            long insertionTime = stoptTimeInsertion - startTimeInsertion;
            
            System.out.println("Test " + j + ": " + num + " elments");
            System.out.println("Time required for bubble sort of " + num + " Terms: " + bubbleTime);
            System.out.println("Time required for selection sort of " + num + " Terms: " + selectionTime);
            System.out.println("Time required for insertion sort of " + num + " Terms: " + insertionTime);
            System.out.println("Time required for quick sort of " + num + " Terms: " + quickTime + "\n");
            num *= 10;
        }
    }
    public static int[] BubbleSort(int[] values){
        int intTemp;
        for (int i = values.length - 1; i >= 0; i--){
            for (int j = 0; j < i; j++){
                if(values[j] > values[j + 1]){
                    intTemp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = intTemp;
                }
            }
        }
        return values;
    }
    
    public static int[] SelectionSort(int[] values){
        int intPlace = 0;
        int intTemp;
        for (int i = 0; i < values.length; i++){
            for (int j = i + 1; j < values.length; j++){
                if (values[j] < values[intPlace]){
                    intPlace = j;
                }
            }
            intTemp = values[i];
            values[i] = values[intPlace];
            values[intPlace] =  intTemp;
            intPlace = i + 1;
        }
        return values;
    }
    
    public static void QuickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			QuickSort(arr, low, j);
 
		if (high > i)
			QuickSort(arr, i, high);
	}
    
    public static int[] InsertionSort(int[] values){
        int intTemp;
        
        for ( int i = 1; i < values.length; i++){
            int j = i;
            while (j > 0 && values[j - 1] > values[j]){
                intTemp = values[j];
                values[j] = values[j - 1];
                values[j - 1] = intTemp;
                j--;
            }
        }
        return values;
    }
    
    
    
    
    
}
