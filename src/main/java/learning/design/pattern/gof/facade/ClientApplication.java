package learning.design.pattern.gof.facade;

import learning.design.pattern.gof.facade.improvedwithfacade.FinancialSystemFacade;

public class ClientApplication {

    public static void main(String[] args) {

        BillingSystem billingSystem = new BillingSystem();
        InvoiceCustomerSystem invoiceCustomerSystem = new InvoiceCustomerSystem();

        Bill bill = billingSystem.createBill(1000);
        invoiceCustomerSystem.createInvoiceForBill(bill);
    }
}
