class Month {
    public static void main(String [] args){
        int month=-1;

        if(month>12){
            System.out.println("Invalid month");
        }
        else if(month<1){
            System.out.println("Invalid Month type");
        }
        else if(month%2==0){
            System.out.println("30 days");
        }
        else{
            System.out.println("31 days");
        }
    }
}
