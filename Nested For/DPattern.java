/*Write a program to print the following pattern
D D D D
D D D D
D D D D
D D D D */

class DPattern{
    public static void main(String []args){
        int n=4;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("D ");
            }
            System.out.println();
        }
    }
}