/*Write a program to print the following pattern
10  10  10  10
11  11  11
12  12
13
 */

class TenToThiteen{
    public static void main(String []args){
        int n=10;

        for(int i=1;i<=4;i++){
            for(int j=i;j<=4;j++){
                System.out.print(n+ " ");
            }
            n++;
            System.out.println();
        }
    }
}