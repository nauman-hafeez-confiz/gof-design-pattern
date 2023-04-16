package learning.design.pattern.gof.facade.improvedwithfacade;

public class Bill {
    private int amount;

    public Bill(int amount){
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }
}
