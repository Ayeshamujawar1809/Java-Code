class ProfitLoss{
    public static void main(String []args){
        int sellingPrice=1200;
        int costPrice=1200;
        if(sellingPrice>costPrice){
            System.out.println("Profit of 200");
        }
        else if(sellingPrice<costPrice){
            System.out.println("Loss of 200");
        }
        else{
            System.out.println("No Profit and No Loss");
        }
    }
}