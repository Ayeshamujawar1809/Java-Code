/*WAP to find the uncommon elements between two arrays.
Input :
Enter first array : 1 2 3 5
Enter Second array: 2 1 9 8
Output: Uncommon elements :
3
5
9
8 */

class UncmnEle{
    public static void main(String []args){
        int arr[]=new int[]{1,2,3,5};
        int arr2[]=new int[]{2,1,9,8};

        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr2.length;j++){
                if(arr[i]!=arr2[j]){
                    count++;
                }
            }
            if(count==arr.length){
                System.out.println(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr2.length;j++){
                if(arr2[i]!=arr[j]){
                    count++;
                }
            }
            if(count==arr2.length){
                System.out.println(arr2[i]);
            }
        }
    }
}