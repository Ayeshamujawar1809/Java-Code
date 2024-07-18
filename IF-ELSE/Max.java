class Max {
    public static void main(String [] args){
        int num1=42;
        int num2=32;
        int num3=42;

        if(num1>num2&&num1>num3){
            System.out.println(num1+ "is maximum between" +num2+ "," +num3);
        }
        else if(num2>num1&&num2>num3){
            System.out.println(num2+ "is maximum between" +num1+ "," +num3);
        }
        else if(num3>num1&&num3>num2){
            System.out.println(num3+   "is maximum between" +num1+ "," +num2);
        }
        else if(num1>num2&&num1==num3){
            System.out.println(num1+ "is greater than" +num2+ "and" +num1+ "is equal to" +num3);
        }
        else if(num2>num3&&num2==num1){
            System.out.println(num2+ "is greater than" +num3+ "and" +num2+ "is equal to" +num1);
        }
        else if(num3>num1&&num3==num2){
            System.out.println(num3+ "is greater than" +num1+ "and" +num3+ "is equal to" +num2);
        }
        else{
            System.out.println("All numbers are equal");
        }
    }
}
