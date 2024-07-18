/*Write a program to print the following pattern
1   2   3   4
4   5   6
6   7
7
 */

class Pattern6 {
    public static void main(String []args){
        int n=1;

        for(int i=1;i<=4;i++){
            
            for(int j=i;j<=4;j++){
                System.out.print(n+ " ");
                n++;
            }
            n--;
            System.out.println();
        }
    }
    
}
