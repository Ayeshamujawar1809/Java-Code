/*Write a program to print the following pattern
 A  b  C  d
 E  f  G  h
 I  j  K  l
 M  n  O  p
 */

class CharPattern {
    public static void main(String []args){
        char ch='A';
        char gh='a';

        for(int i=1;i<=4;i++){
            
            for(int j=1;j<=4;j++){
                if(j%2==0){
                    System.out.print(gh + " ");
                    gh++;
                    ch++;
                }
                else{
                    System.out.print(ch + " ");
                    ch++;
                    gh++;
                }
                
            }
            System.out.println();
        }
    }
    
}
