//Write a program to find the largest and smallest numbers in an array.


package Day3;

public class FindLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int smallNo=  Integer.MAX_VALUE;
        int largeNo = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largeNo) largeNo=arr[i];
            if (arr[i]<smallNo) smallNo=arr[i];
        }
        System.out.println("Largest No : "+largeNo+"\nSmall No : "+smallNo);
    }
}
