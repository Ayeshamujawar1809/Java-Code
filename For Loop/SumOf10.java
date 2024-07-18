//Write a program to print sum of first ten number

class SumOf10 {
    public static void main(String []args){
        int n=10;
        int sum=0;

        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Sum Of First Ten Number is : " +sum);
    }
    
}
