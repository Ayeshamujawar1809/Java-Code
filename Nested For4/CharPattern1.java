/*Write a program to print the following pattern
A   B   C   D
B   C   D
C   D
D
 */

class CharPattern1 {
    public static void main(String []args){
        int row=4;
        char ch='A';

        for(int i=1;i<=row;i++){
            char gh=ch;
            for(int j=i;j<=row;j++){
                System.out.print(gh+ "  ");
                gh++;
            }
            ch++;
            System.out.println();
        }
    }

}
