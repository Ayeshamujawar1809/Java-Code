/*Write a program to print the following pattern
 C2W
 C2W  C2W
 C2W  C2W  C2W
 C2W  C2W  C2W  C2W
 */

class Pattern7 {
    public static void main(String []args){
        int row=4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("C2W   ");
            }
            System.out.println();
        }
    }
    
}
