/*Write a program to print the following pattern
3C  3C  3C  3C
3C  3C  3C
3C  3C
3C
 */

class PatternOF3C {
    public static void main(String []args){
        for(int i=1;i<=4;i++){
            for(int j=i;j<=4;j++){
                System.out.print("3C  ");
            }
            System.out.println();
        }
    }
    
}
