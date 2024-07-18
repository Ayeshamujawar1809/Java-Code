/*Write a program to print the follwoing pattern
10
I   H
7   6   5
D   C   B   A
 */

class PatternCode2 {
    public static void main(String []args){
        char ch='I';
        int n=10;
        int row=4;

        for(int i=1;i<=row;i++){
            
            for(int j=1;j<=i;j++){
               
                if(i%2==0){
                    System.out.print(ch+" ");
                    ch--;
                }
                else{
                    System.out.print(n+" ");
                    n--;
                }
            }
            ch--;
            n--;
            System.out.println();
        }

    }
    
}
