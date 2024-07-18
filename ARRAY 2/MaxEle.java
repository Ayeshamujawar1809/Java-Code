/*WAP to take size of array from user and also take integer elements from user
find the maximum element from the array
input : Enter size : 5
Enter array elements: 1 2 5 0 4
output: max element = 5 */

import java.util.*;

class MaxEle {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of an Array : ");
        int size=sc.nextInt();

        System.out.println("Enter the Array Elements : ");
        int arr[]=new int[size];

        int maxEle=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

            if(arr[i]>maxEle)
               maxEle=arr[i];
        }
        System.out.println("Max Element : "+maxEle);
    }
    
}
