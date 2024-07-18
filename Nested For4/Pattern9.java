/*Write a program to print the following pattern
1
2   3
3   4   5
4   5   6   7
 */

class Pattern9 {
    public static void main(String []args){
        int row=4;
        int num=1;

        for(int i=1;i<=row;i++){
            int n=num;
            for(int j=1;j<=i;j++){
                System.out.print(n+ " ");
                n++;
            }
            num++;
            System.out.println();
        }
    }
    
}
