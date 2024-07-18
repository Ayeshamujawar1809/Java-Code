/*WAP to find the common elements between two arrays.
Input :
Enter first array : 1 2 3 5
Enter Second array: 2 1 9 8
Output: Common elements :
1
2 */


class CmnBtn2Array {
    public static void main(String []args){

        int arr[]=new int[]{1,2,3,5};
        int arr2[]=new int[]{2,1,9,8};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr[i]==arr2[j]){
                    System.out.println(arr[i]+ "  ");
                }
            }
        }

    }
    
}
