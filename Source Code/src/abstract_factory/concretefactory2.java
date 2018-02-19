package abstract_factory;

import strategy.StoreData;
import strategy.StoreData2;
import strategy.PayMsg;
import strategy.StoreCash;
import strategy.DisplayMenu;
import strategy.RejectMsg;
import strategy.SetW;
import strategy.SetPrice;
import strategy.ReadyMsg;
import strategy.SetInitialValues;
import strategy.PumpGasUnit;
import strategy.GasPumpedMsg;
import strategy.StopMsg;
import strategy.PrintReceipt;
import data_store.data;

import data_store.datastore2;
import strategy.CancelMsg;
import strategy.NoReceipt;
import strategy.NoReceipt1;
import strategy.PayMsg1;
import strategy.StoreCash2;
import strategy.DisplayMenu2;
import strategy.RejectMsg1;
import strategy.SetW1;
import strategy.SetPrice2;
import strategy.ReadyMsg1;
import strategy.SetInitialValues1;
import strategy.PumpGasUnit2;
import strategy.GasPumpedMsg2;
import strategy.StopMsg1;
import strategy.PrintReceipt2;
import strategy.CancelMsg1;

public class concretefactory2 extends AF
{
     datastore2 datastore2obj= new datastore2(); 
	 public PrintReceipt getPrintReceipt()
    {
		
		 PrintReceipt printrecieptobj =new PrintReceipt2();
		 printrecieptobj.setdata(datastore2obj);
		       
	        return printrecieptobj;
    }
	 public StoreData getStoreData()
    {
		 StoreData storedataobj =new StoreData2();
		 storedataobj.setdata(datastore2obj);
		 return storedataobj;
    }
	 public SetInitialValues getSetInitialValues()
    {
		 SetInitialValues initialvalueobj = new SetInitialValues1();
		 initialvalueobj.setdata(datastore2obj);
        return initialvalueobj;
    }
	 public SetPrice getSetPrice()
    {
		 SetPrice setpriceobj = new SetPrice2();
		 setpriceobj.setdata(datastore2obj);
	        return setpriceobj;
    }
	 public StoreCash getStoreCash()
     {
		    StoreCash storecashobj = new StoreCash2();
		    storecashobj.setdata(datastore2obj);
	        return storecashobj;
     }
	 public data getdata()
	 {
	        return datastore2obj;
	 }

	  public GasPumpedMsg getGasPumpedMsg()
	  {
		  GasPumpedMsg gaspumpdmsgobj = new GasPumpedMsg2();
	        gaspumpdmsgobj.setdata(datastore2obj);
	        return gaspumpdmsgobj;

	  }
	  public ReadyMsg getReadyMsg()
	  {
		   ReadyMsg readymsgobj = new ReadyMsg1();
	        readymsgobj.setdata(datastore2obj);
	        return readymsgobj;

	  }
	  public PayMsg getPayMsg()
	  { 
		  PayMsg paymsgobj = new PayMsg1();
          paymsgobj.setdata(datastore2obj);
          return paymsgobj;

	  }
	  public CancelMsg getCancelMsg()
	  {
		  CancelMsg cancelmsgobj = new CancelMsg1();
		  cancelmsgobj.setdata(datastore2obj);
          return cancelmsgobj;
	  }
	  public StopMsg getStopMsg()
	  {
		  StopMsg stopmsgobj = new StopMsg1();
		  stopmsgobj.setdata(datastore2obj);
          return stopmsgobj;
	  }
	  public DisplayMenu getDisplayMenu()
	  {
		  DisplayMenu displaymenuobj = new DisplayMenu2();
		  displaymenuobj.setdata(datastore2obj);
          return displaymenuobj;
	   }
	    public PumpGasUnit getPumpGasUnit()
	    {
	    	 PumpGasUnit pumpgasunitobj = new  PumpGasUnit2();
	    	 pumpgasunitobj.setdata(datastore2obj);
	          return pumpgasunitobj;
	    }
	    
	    public RejectMsg getRejectMsg()
	    {
	    	RejectMsg rejectmsgobj = new RejectMsg1();
	    	rejectmsgobj.setdata(datastore2obj);
	          return rejectmsgobj;
	    }
	    public SetW getsetW()
	    {
	    	  SetW setwobj = new SetW1();
	    	  setwobj.setdata(datastore2obj);
	          return setwobj;
	    }
	    public NoReceipt getNoReceipt()
	    {
	    	NoReceipt noreceiptobj = new NoReceipt1();
	    	noreceiptobj.setdata(datastore2obj);
	          return noreceiptobj;
	    }
	    
}
