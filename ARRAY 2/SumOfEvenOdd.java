/*Write a Java program to find the sum of even and odd numbers in an array.
Display the sum value.

Input: 11 12 13 14 15
Output
Odd numbers sum = 39
Even numbers sum = 26 */

import java.util.*;

class SumOfEvenOdd {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of an Array : ");
        int size=sc.nextInt();

        System.out.println("Enter the Array Elements : ");
        int arr[]=new int[size];

        int evenSum=0;
        int oddSum=0;

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                evenSum=evenSum+arr[i];
            }else{
                oddSum=oddSum+arr[i];
            }
        }
        System.out.println("Odd number Sum : " +oddSum);
        System.out.println("Even numbers Sum : " +evenSum);
    }
    
}
