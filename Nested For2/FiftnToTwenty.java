/*Write a program to print the following pattern
14 15 16 17
15 16 17 18
16 17 18 19
17 18 19 20
 */

class FiftnToTwenty {
    public static void main(String []args){
    int n=14;

    for(int i=1;i<=4;i++){
        int num=n;
        for(int j=1;j<=4;j++){
            System.out.print(num+ "  ");
            num++;
        }
        n++;
        System.out.println();
    }
}
    
}
