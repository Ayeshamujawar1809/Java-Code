/*WAP to search a specific element from an array and return its index.
Input: 1 2 4 5 6
Enter element to search: 4
Output: element found at index: 2 */

import java.util.*;

class ArrayIndex {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of an Array : ");
        int size=sc.nextInt();

        System.out.println("Enter the Array Elements : ");
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
            System.out.println("Enter element to search : ");
            int num=sc.nextInt();

            for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
               System.out.println("element found at : " +i);
            }
            }
    }
    
}
