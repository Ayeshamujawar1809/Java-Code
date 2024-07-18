/*Write a program to take a size of array from the user and alsp tahe integer elements from the user print sum of odd elemets only
Input : Enter Size  : 5
Enter array elements : 1 2 3 4 5
OUTPUT: 9 

USING BUFFERED READER
*/

import java.io.*;

class SumOfOddEle2 {
    public static void main(String []args)throws IOException{
        int sum=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Size ");
        int size=Integer.parseInt(br.readLine());

        int arr[]=new int[size];

        System.out.println("Enter array elements ");

        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(br.readLine());
            if(arr[i]%2==1){
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);
    }
    
}
