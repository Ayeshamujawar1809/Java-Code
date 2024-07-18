/*Write a program to take a size of array from the user and also the integer elements from the user print sum of even elemets only
Input : Enter Size  : 9
Enter array elements : 1 2 3 2 5 10 55 77 99
OUTPUT: 9 

USING BUFFEREDREADER
*/

import java.io.*;

class ProductOfEle {
    public static void main(String []args)throws IOException{
        int product=1;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of array : ");
        int size=Integer.parseInt(br.readLine());

        System.out.println("Enter the array elements : ");
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
            if(arr[i]%2==0){
                product=product*arr[i];
            }
        }
        System.out.println(product+ " ");
    }
    
}
