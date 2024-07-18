//Write a program to print Product of first ten number

class ProductOfTen {
    public static void main(String []args){
        int n=10;
        int product=1;

        for(int i=1;i<=n;i++){
            product=product*i;
        }
        System.out.println("Product is : " +product);
    }
}
