/*Write a program to take a size of array from the user and also the integer elements from the user print product of odd index only
Input : Enter Size  : 6
Enter array elements : 1 2 3 4 5 6
OUTPUT: 48

USING Scanner
*/

import java.util.*;

class ProOfOddIndex {
    public static void main(String []args){
        int pro=1;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of an Array : ");
        int size=sc.nextInt();

        System.out.println("Enter the Array Elements : ");
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(i%2!=0){
                pro=pro*arr[i];
            }
        }
        System.out.println("OUTPUT :" +pro);
    }
    
}
