
// Counting Sort
//
// Idea -> Store frequency in count array 
//         then we will store the numbers in original
//         array by frequency
//
// Time Complexity -> O(n)
// Space Complexity -> O(n)

public class CountingSort{
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        countingSort(arr);
        printArr(arr);
    }
    public static void countingSort(int arr[]){

        //Finding the size of count array
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest,arr[i]);
        }

        //Filling the frequency of element in count array
        int count[] = new int[largest+1];
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }
        
        //Sorting
        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}