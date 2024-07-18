/*Write a program to print the following pattern
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7*/

class OneTOSeven {
    public static void main(String []args){
        int n=1;
        for(int i=1;i<=4;i++){
            int num=n;
            for(int j=1;j<=4;j++){
                System.out.print(num+ " ");
                num++;
            }
            n++;
            System.out.println();
        }
    }
    
}
