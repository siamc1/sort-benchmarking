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
        
        /*boolean boolBubble = true;
        boolean boolSelection = true;
        boolean boolInsertion = true;
        boolean boolQuick = true;
        int num = 10;
        
        
        System.out.print("What is the most time it can take for a sorting algorithm to sort any given set of values?\t");
        
        
        long bubbleTime = 0, selectionTime = 0, insertionTime = 0, quickTime = 0;
        while(boolQuick && boolInsertion){
            testCase = new int[num];
            for (int i = 0; i < num; i++){
                testCase[i] = r.nextInt(num);
            }
            if(boolBubble){
                long startTimeBubble = System.nanoTime();
                int[] bubbleSorted = BubbleSort(testCase);
                long stopTimeBubble = System.nanoTime();
                bubbleTime = stopTimeBubble - startTimeBubble;
                System.out.println("Time required for Bubble sort of " + num + " integers: " + bubbleTime);
            }
            if(boolSelection){
                long startTimeSelection = System.nanoTime();
                int[] selectionSorted = SelectionSort(testCase);
                long stopTimeSelection = System.nanoTime();
                selectionTime = stopTimeSelection - startTimeSelection;
                System.out.println("Time required for Selection sort of " + num + " integers: " + selectionTime);
            }
            if(boolInsertion){
                long startTimeInsertion = System.nanoTime();
                int[] insertionSorted = InsertionSort(testCase);
                long stoptTimeInsertion = System.nanoTime();
                insertionTime = stoptTimeInsertion - startTimeInsertion;
                System.out.println("Time required for Insertion sort of " + num + " integers: " + insertionTime);
            }
            if(boolQuick){
                long startTimeQuick = System.nanoTime();
                int[] quickSorted = QuickSort(testCase, 0, num);
                long stopTimeQuick = System.nanoTime();
                quickTime = stopTimeQuick - startTimeQuick;
                System.out.println("Time required for Quick sort of " + num + " integers: " + quickTime);
            }
            System.out.println("");
            if(bubbleTime > intMax * Math.pow(10, 9)){
                boolBubble = false;
            }
            if(selectionTime > intMax * Math.pow(10, 9)){
                boolSelection = false;
            }
            if(insertionTime > intMax * Math.pow(10, 9)){
                boolInsertion = false;
            }
            if(quickTime > intMax * Math.pow(10, 9)){
                boolQuick = false;
            }
            num*=10;*/
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
            int[] quickSorted = QuickSort(testCase, 0, num);
            long stopTimeQuick = System.nanoTime();
            
            long bubbleTime = stopTimeBubble - startTimeBubble;
            long selectionTime = stopTimeSelection - startTimeSelection;
            long quickTime = stopTimeQuick - startTimeQuick;
            long insertionTime = stoptTimeInsertion - startTimeInsertion;
            
            System.out.println("Time required for bubble sort of " + num + " Terms: " + bubbleTime);
            System.out.println("Time required for selection sort of " + num + " Terms: " + selectionTime);
            System.out.println("Time required for insertion sort of " + num + " Terms: " + insertionTime);
            System.out.println("Time required for quick sort of " + num + " Terms: " + quickTime + "\n");
            System.out.println(j);
            num *= 10;
        }
    }
        /*
        int[] testCase;
        
        for ( int j = 1; j <= 10000; j *= 10){
            int num = 10 * j;
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
            int[] quickSorted = QuickSort(testCase, 0, num);
            long stopTimeQuick = System.nanoTime();
            
            long bubbleTime = stopTimeBubble - startTimeBubble;
            long selectionTime = stopTimeSelection - startTimeSelection;
            long quickTime = stopTimeQuick - startTimeQuick;
            long insertionTime = stoptTimeInsertion - startTimeInsertion;
            
            System.out.println("Time required for bubble sort of " + num + " Terms: " + bubbleTime);
            System.out.println("Time required for selection sort of " + num + " Terms: " + selectionTime);
            System.out.println("Time required for insertion sort of " + num + " Terms: " + insertionTime);
            System.out.println("Time required for quick sort of " + num + " Terms: " + quickTime + "\n");
        }
        
        System.out.println("\nBubble Sort has been eliminated for taking too long\nSelection Sort has been eliminated for taking too long\n");
        
        for ( int j = 100000; j < 100000000; j *= 10){
            int num = 10 * j;
            testCase = new int[num];
            for (int i = 0; i < num; i++){
                testCase[i] = r.nextInt(num);
            }
        
            long startTimeQuick = System.nanoTime();
            int[] quickSorted = QuickSort(testCase, 0, num - 1);
            long stopTimeQuick = System.nanoTime();
            long quickTime = stopTimeQuick - startTimeQuick;
            System.out.println("Time required for quick sort of " + num + " Terms: " + quickTime);
            
            long startTimeInsertion = System.nanoTime();
            int[] insertionSorted = InsertionSort(testCase);
            long stoptTimeInsertion = System.nanoTime();
            long insertionTime = stoptTimeInsertion - startTimeInsertion;
            System.out.println("Time required for insertion sort of " + num + " Terms: " + insertionTime + "\n");  
        }
            
        
    }
    */ 
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
    
    public static int[] QuickSort(int[] values, int low, int high){
        try{
        if ( low < high){
            int pivot = values[low];
            int leftWall = low;
            int intTemp;
        
            for (int i = low + 1; i < high; i++){
                if(values[i] < pivot){
                    intTemp = values[i];
                    values[i] = values[leftWall];
                    values[leftWall] = intTemp;
                    leftWall++;
                }
            }
            intTemp = pivot;
            pivot = values[leftWall];
            values[leftWall] = pivot;
            
            int pivotLocation = leftWall;
            
            QuickSort(values, low, pivotLocation);
            QuickSort(values, pivotLocation + 1, high);
        }
        }catch(StackOverflowError e){}
        return values;
    }
    
    /*public static int Partition(int[] values, int low, int high){
        int pivot = values[low];
        int leftWall = low;
        int intTemp;
        
        for (int i = low + 1; i <= high; i++){
            if(values[i] < pivot){
                intTemp = values[i];
                values[i] = values[leftWall];
                values[leftWall] = intTemp;
                leftWall++;
            }
        }
        intTemp = pivot;
        pivot = values[leftWall];
        values[leftWall] = pivot;
        return leftWall;
    }*/
    
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
