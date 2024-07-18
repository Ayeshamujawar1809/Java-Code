/*Write a program to merge two given arrays
Array 1=[10,20,30,40,50]
Array 2=[9,18,27,36,45]
 */

class MergeArray {
    public static void main(String []args){
        int arr[]=new int[]{10,20,30,40,50};
        int arr2[]=new int[]{9,18,27,36,45};
        int n=arr.length+arr2.length;

        int arr3[]=new int[n];
       
        for(int i=0;i<arr.length;i++){
            arr3[i]=arr[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[arr.length+i]=arr2[i];
        }
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
        
    }
    
}
