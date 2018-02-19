package output_processor;

import abstract_factory.AF;
import data_store.data;
import output_processor.output;
import strategy.StoreData;
import strategy.PayMsg;
import strategy.StoreCash;
import strategy.RejectMsg;
import strategy.SetW;
import strategy.SetPrice;
import strategy.ReadyMsg;
import strategy.SetInitialValues;
import strategy.PumpGasUnit;
import strategy.GasPumpedMsg;
import strategy.StopMsg;
import strategy.CancelMsg;
import strategy.PrintReceipt;
import strategy.DisplayMenu;
import strategy.NoReceipt;
public class output
{
		static AF afobj;
	   data dataobj;
	   public void setfactory(AF af1)
	    {
	        afobj=af1;
	    }
	    public void setData(data d1)
	    {
	        dataobj=d1;
	    }
	    public static void storeData()
	    {

		   StoreData object;
		   object=afobj.getStoreData();
		   object.storeData();
	    }
	    public static void displayMenu()
	    {
	    	DisplayMenu object;
	    	object=afobj.getDisplayMenu();
	    	object.displayMenu();
	    }
	    public static void payMsg() 
	    {
	    	PayMsg object;
	    	object=afobj.getPayMsg();
	    	object.payMsg();
	    }
	    public static void rejectMsg()
	    {
	    	RejectMsg object;
	    	object=afobj.getRejectMsg();
	    	object.rejectMsg();
	    }
	    public static void printReceipt()
	    {
	    	PrintReceipt object;
	    	object=afobj.getPrintReceipt();
	    	object.printReceipt();
	     }    
	    public static void cancelMsg()
	    {
	    	CancelMsg object;
	    	object=afobj.getCancelMsg();
	    	object.cancelMsg();
	    }
	   
	   public static void gasPumpedMsg()
	    {
	    	GasPumpedMsg object;
	    	object=afobj.getGasPumpedMsg();
	    	object.gasPumpedMsg();
	    }
	     public static void pumpGasUnit()
	    {
	    	    PumpGasUnit object;
		    	object=afobj.getPumpGasUnit();
		    	object.pumpGasUnit();
	    }
public static void storeCash()
	    {
	    	StoreCash object;
	    	object=afobj.getStoreCash();
	    	object.storeCash();
	        
	    }
	    public static void readyMsg()
	    {
	    	ReadyMsg object;
	    	object=afobj.getReadyMsg();
	    	object.readyMsg();
	    }
	    public static void stopMsg()
	    {
	    	StopMsg object;
	    	object=afobj.getStopMsg();
	    	object.stopMsg();
	    }
	    
	    public static void setPrice(int g)
	    {
	    	SetPrice object;
	    	object=afobj.getSetPrice();
	    	object.setPrice(g);
	    }
	    public static void setInitialValues()
	    {

	    	SetInitialValues object;
	    	object=afobj.getSetInitialValues();
	    	object.setInitialValues();
	    }
	    public static void setW(int t)
	    {
	    	SetW object;
	    	object=afobj.getsetW();
	    	object.setW(t);
	    }
	    public static void NoReceipt()
	    {

	    	NoReceipt object;
	    	object=afobj.getNoReceipt();
	    	object.noReceipt();
	    }
		public static int getW() {
			
			return 0;
		}
	    
	

}