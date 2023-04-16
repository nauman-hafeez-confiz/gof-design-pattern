package learning.design.pattern.gof.facade;

public class Bill {
    private int amount;

    public Bill(int amount){
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }
}
