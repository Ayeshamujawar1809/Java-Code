/*Write a program to print the following pattern
1
8   9
27  16  125
64  25  216 49
 */

class PatternCode3 {
    public static void main(String []args){
        int row=4;
        int m=1;
        for(int i=1;i<=row;i++){
            int n=m;
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print(n*n+ "  ");
                    n++;
                }else{
                    System.out.print(n*n*n+ "  ");
                    n++;
                }
            }
            m++;
            System.out.println();
        }
    }
}
