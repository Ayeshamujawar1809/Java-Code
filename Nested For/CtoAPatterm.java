/*Write a program to print the following pattern
C B A
C B A
C B A */

class CtoAPatterm {
    public static void main(String []args){

        for(int i=1;i<=3;i++){
            char ch='D';
            for(int j=1;j<=3;j++){
                ch--;
                System.out.print(ch+ " ");
                
            }
            System.out.println();
        }
    }
    
}
