/*Write a program to print the following pattern
F
E   F
D   E   F
C   D   E   F
B   C   D   E   F
A   B   C   D   E   F
 */

class AvghadPattern {
    public static void main(String []args){
        int row=6;
        char ch='F';  

        for(int i=1;i<=row;i++){  
            char gh=ch;
            for(int j=1;j<=i;j++){
                System.out.print(gh+" ");
                gh++;
            }
            ch--;
            System.out.println();

        }
    }

}
