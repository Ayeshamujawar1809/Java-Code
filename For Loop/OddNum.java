//Write a program to print odd numbers form 1-50

class OddNum {
    public static void main(String []args){
        int n=50;

        for(int i=1;i<=50;i++){
            if(i%2!=0){
                System.out.println(i+ " ");
            }
        }
    }
}
