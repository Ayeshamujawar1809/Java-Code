/*Write a program, take 10 input from the user and print only elements that are divisible by 5

Input : 10 2 2 3 3 3 4 4 25 55
OUTPUT:10 25 55
 */

import java.util.*;

class DivisibleBy5 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size on an array : ");
        int size=sc.nextInt();

        System.out.println("Enter the array elements : ");
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%5==0){
                System.out.print(arr[i]+ "  ");
            }
        }
        System.out.println();
    }
    
}
