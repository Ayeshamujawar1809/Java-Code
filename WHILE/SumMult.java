class SumMult {
    public static void main(String []args){
        int i=1;
        int sum=0;
        int mult=1;

        while(i<=10){
            if(i%2==0){
                sum=sum+i;
                i++;
            }
            else{
                mult=mult*i;
                i++;
            }
        }
        System.out.println(sum+ " ");
        System.out.println(mult+" ");
    }
    
}
