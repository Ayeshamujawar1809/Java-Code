/*WAP to find the number of even and odd integers in a given array of integers
Input: 1 2 5 4 6 7 8
Output:
Number of Even Elements: 4
Number of Odd Elements : 3 */

import java.util.*;

class CountOfEvenOdd {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of an array : ");
        int size=sc.nextInt();

        System.out.println("Enter the Array elemets : ");
        int arr[]=new int[size];

        int even=0;
        int odd=0;

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Number of Even elements : "+even);
        System.out.println("Number of Odd Elements : " +odd);
    }
    
}
