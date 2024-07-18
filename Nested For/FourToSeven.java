/*Write a program to print the following pattern
4 5 6 7
4 5 6 7
4 5 6 7
4 5 6 7 */

class FourToSeven {
    public static void main(String []args){

        for(int i=1;i<=4;i++){
            int n=3;
            for(int j=1;j<=4;j++){
                n++;
                System.out.print(n+ "  ");
            }
            System.out.println();
        }
    }
    
}
