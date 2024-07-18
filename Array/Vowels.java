/*Write a program, take 7 character as an input, Print only vowels from the array

Input : a b c o d p e

Output : a e o
 */

import java.util.*;

class Vowels {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of an Element " );
        int size=sc.nextInt();

        System.out.println("Enter array elements : ");
        char arr[]=new char[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next().charAt(0);
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
                System.out.print(arr[i]+ "  ");
            }
        }
        System.out.println();
    }
    
}
