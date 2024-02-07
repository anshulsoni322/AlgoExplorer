
//  Selection Sort
//  
//  Idea -> Pick the smallest (from unsorted),
//          put it at the beginning
//
// Time Complexity -> O(n^2)
// Space Complexity -> O(1)

public class SelectionSort{
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
        printArr(arr);
    }

    public static void selectionSort(int arr[]){
        for(int turn = 0; turn < arr.length - 1; turn++){
            int minPos = turn;

            // Find the index of the minimum element in the unsorted portion of the array
            for(int j = turn + 1; j < arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            
            // Swap the minimum element with the first element of the unsorted portion
            int temp = arr[minPos];
            arr[minPos] = arr[turn];
            arr[turn] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}