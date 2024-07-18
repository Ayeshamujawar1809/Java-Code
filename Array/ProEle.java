/*Write a program to take a size of array from the user and also the integer elements from the user print sum of even elemets only
Input : Enter Size  : 9
Enter array elements : 1 2 3 2 5 10 55 77 99
OUTPUT: 9 

USING SCANNER
*/

import java.util.*;

class ProEle {
    public static void main(String []args){
        int product=1;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of an Array : ");
        int size=sc.nextInt();

        System.out.println("Enter the Array Elements : ");
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                product=product*arr[i];
            }
        }
        System.out.println("OUTPUT : "+product);

        
    }
    
}
