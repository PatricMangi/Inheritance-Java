package interfacesPlus;

/**
 * Created by shuxford
 */
public class DoingIt {
    Window myWindow;

    public void doIt(Window win){
        myWindow = win;

        payableInterfaceDriverTest();

    }

    private void payableInterfaceDriverTest(){
        //POLYMORPHISM USING INTERFACES DEMO DRIVER CODE
        myWindow.clearOut();

        // create four-element Payable array
        Payable payableObjects[] = new Payable[ 6 ];

        // populate array with objects that implement Payable
        payableObjects[ 0 ] = new Invoice( "01234", "seat", 2, 375.00 );
        payableObjects[ 1 ] = new Invoice( "56789", "tire", 4, 79.95 );
        payableObjects[ 2 ] = new SalariedEmployee( "John", "Smith", "111-11-1111", 800.00);
        payableObjects[ 3 ] = new HourlyEmployee( "Karen", "Price", "222-22-2222", 16.75, 40);
        payableObjects[ 4 ] = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
        payableObjects[ 5 ] = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);

        myWindow.writeOutLine("Invoices and Employees processed polymorphically:\n");

        // polymorphically process each element in array payableObjects
        for ( int i = 0; i < payableObjects.length; i++) {
            // output currentPayable and its appropriate payment amount
            myWindow.writeOutLine(String.format("%s \n%s: $%,.2f\n\n", payableObjects[i].toString(), "payment due", payableObjects[i].getPaymentAmount()));

        }


//        for ( Payable currentPayable : payableObjects ){
//           // output currentPayable and its appropriate payment amount
//           myWindow.writeOutLine(String.format( "%s \n%s: $%,.2f\n\n", currentPayable.toString(), "payment due", currentPayable.getPaymentAmount() ));
//        }
    }

}
