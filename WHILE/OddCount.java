class OddCount {
    public static void main(String []args){
        int i=942111423;
        int count=0;
        while(i!=0){
            int rem=i%10;
            if(rem%2!=0){
              count++;
            }
            i=i/10; 
            }
            System.out.println(count);
    }
}
