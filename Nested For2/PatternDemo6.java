/*Write a program to print the following pattern
F   5   D   3   B   1   
F   5   D   3   B   1   
F   5   D   3   B   1
F   5   D   3   B   1
F   5   D   3   B   1
F   5   D   3   B   1
 */

class PatternDemo6 {
    public static void main(String []args){

        for(int i=1;i<=6;i++){
            char ch='F';
        int n=5;
            for(int j=1;j<=6;j++){
                if(j%2==0){
                    System.out.print(n+ "  ");
                    n=n-2;   
                    ch--;    
                 }
                 else{
                    System.out.print(ch+ "  ");
                    ch--;
                    
                 }
            }
            System.out.println();
        }
    }
    
}
