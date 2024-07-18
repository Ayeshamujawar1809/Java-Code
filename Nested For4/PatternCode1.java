/*Write a program to print the following pattern
1   2   3   4
2   3   4
3   4
4
*/  

class PatternCode1 {
    public static void main(String []args){
        int row=4;
        int num=1;

        for(int i=1;i<=row;i++){
            int n=num;
            for(int j=i;j<=row;j++){
                System.out.print(n+ "  ");
                n++;
            }
            num=num+1;
            System.out.println();
        }
    }
    
}   
