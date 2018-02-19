package strategy;

public class PrintReceipt2 extends PrintReceipt
{
	int total1=0,cash=0,cr=0;
	@Override
    public void printReceipt()
    {
    	
    	System.out.println("Receipt");
    	total1=dataobj.gettotal1();
    	cash=dataobj.getcash1();
    	cr=cash-total1;
      	System.out.printf(" \n The total amount the gas has been pumped is \t "+total1);
      	int L=dataobj.getL();
      	System.out.printf(" \n The total Litres of Gas that has been pumped is \t "+L);
      	System.out.println("\nCash Returned= "+cr);
    }
    
}

