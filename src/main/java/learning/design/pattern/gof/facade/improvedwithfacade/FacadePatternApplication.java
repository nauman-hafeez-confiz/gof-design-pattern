package learning.design.pattern.gof.facade.improvedwithfacade;

public class FacadePatternApplication {
    public static void main(String[] args) {
        FinancialSystemFacade financialSystemFacade = new FinancialSystemFacade();
        financialSystemFacade.invoice(3200);
    }
}
