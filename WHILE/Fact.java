class Fact{
    public static void main(String []args){
        int n=6;
        int i=1;
        int fact=1;

        while(i<=n){
            fact=fact*i;
            System.out.println(fact+ " ");
            i++;
        }
    }
}