/*Write a program to create an array of ‘n’ integer elements.
Where ‘n’ value should be taken from the user.
Insert the values from users and find the sum of all elements in the array.

Input:
n=6
Enter elements in the array: 2 3 6 9 5 1
Output:26   */

import java.util.*;

class SumOfArrayEle{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of an Array : ");
        int n=sc.nextInt();

        System.out.println("Enter the Array Elements : ");
        int arr[]=new int[n];

        int sum=0;

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("OUTPUT : "+sum);
    }
}