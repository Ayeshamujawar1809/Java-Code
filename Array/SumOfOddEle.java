/*Write a program to take a size of array from the user and alsp tahe integer elements from the user print sum of odd elemets only
Input : Enter Size  : 5
Enter array elements : 1 2 3 4 5
OUTPUT: 9 

USING SCANNER
*/


import java.util.*;

class SumOfOddEle{
    public static void main(String []args){
        int sum=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of an array :");
        int n=sc.nextInt();

        System.out.println("Enter array elements : ");
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2!=0){
                sum=sum+arr[i];
            }
        }
        System.out.println(sum+" ");
    }
}