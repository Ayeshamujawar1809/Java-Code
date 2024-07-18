class SumOfEvenDigit {
    public static void main(String []args){
        int arr[]=new int[]{1,2,3,5,15,16,14,28,17,29,123};
        int rem;
        int div;
        int sum;

        for(int i=0;i<arr.length;i++){
            rem=arr[i]%10;
            div=arr[i]/10;
            sum=rem+div;
            if(sum%2==0){
                System.out.println(arr[i]+" ");
            }
        }

        
    }   
}