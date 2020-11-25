package arrays;

public class SecondLargestNumberInAnIntegerArray {

    static int findSecondLargestElement(int arr[], int arrayLength){
        int largest, secondLargest ;
        largest = secondLargest = Integer.MIN_VALUE;

        //check whether there a minimum of 2 elements in the array
        if(arrayLength < 2){
            System.out.println("There are less than 2 elements in the array. Please provide valid input");
        }
        //Find the largest element in the array
        for(int i = 0; i < arrayLength; i++){
            largest = Math.max(largest, arr[i]);
        }
        //Find the second largest element
        for(int i = 0 ; i < arrayLength ; i++){
            if(arr[i] != largest){
                secondLargest = Math.max(secondLargest, arr[i]);
            }
        }
        //check if second largest number is unavailable(if all array elements are the same)
        if(secondLargest == Integer.MIN_VALUE){
            System.out.println("There is no second largest number available in the array");
        }
        return secondLargest;
    }

    public static void main(String[] args){
        int [] arr = {13, 24, 56, 128, 279, 26, 9087,3};
        int arrayLength = arr.length;
        System.out.println("The second largest number in the array is : " + findSecondLargestElement(arr, arrayLength));
    }
}
