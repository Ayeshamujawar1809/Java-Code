/*Write a program to print the following pattern
 1 2 9
 4 25 6
 49 8 81
 */

class PatternDemo4{
    public static void main(String []args){
        int n=1;
        int k=3;
        for(int i=1;i<=k;i++){
            for(int j=1;j<=k;j++){
                if(n%2!=0){
                    System.out.print(n*n+ " ");
                    n++;
                }            
               else {
                    System.out.print(n+ " ");
                    n++;
                }
                
            }
            System.out.println();
        }
    }  
}
