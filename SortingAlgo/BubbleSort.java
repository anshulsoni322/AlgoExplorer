
//  Bubble Sort 

// Idea -> Largest element come ot the end of array by 
//         swapping with adjacent elements
//
// Time Complexity -> O(n^2)
// Space Complexity -> O(1)

public class BubbleSort{
    public static void main(String args[]){
        int arr[] = {5,4,1,3,0};
        bubbleSort(arr);
        printArr(arr);
    }

    public static void bubbleSort(int arr[]){
        for(int turn = 0; turn < arr.length; turn++){
            for(int j = 0; j < arr.length - 1 - turn; j++){
                if(arr[j] >  arr[j+1]){
                    // Swap elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}