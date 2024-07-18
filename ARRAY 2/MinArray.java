/*WAP to take size of array from user and also take integer elements from user
find the minimum element from the array
input : Enter size : 5
Enter array elements: 1 2 5 0 4
output: min element =0 */

import java.util.*;

class MinArray {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of an Array : ");
        int size=sc.nextInt();

        System.out.println("Enter the array elements : ");
        int arr[]=new int[size];

        int minEle=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

            if(arr[i]<minEle)
                minEle=arr[i];
        }
        System.out.println(minEle);
    }
    
}
