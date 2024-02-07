
// Insertion Sorting 
//
// Idea -> Pick an element (form unsorted)
//         place in the right position in sorted part.
//
// Time Complexity -> O(n^2)
// Space Complexity -> O(1)

public class InsertionSort{
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
        printArr(arr);
    }
    public static void insertionSort(int arr[]){
        for(int turn = 1; turn <  arr.length; turn++){
            int curr = arr[turn];
            int prev = turn - 1;

            //Finding out the correct pos to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }

            //insertion
            arr[prev + 1] = curr;
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}