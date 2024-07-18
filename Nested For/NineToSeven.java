/*Write a program to print the following pattern
9 9 9
8 8 8
7 7 7 */

class NineToSeven {
    public static void main(String []args){
        int n=9;

        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.print(n+ "  ");
            }
            n--;
            System.out.println();
        }
    }
    
}
