package abstract_factory;
import strategy.StoreData;
import strategy.StoreData1;
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
import data_store.datastore1;
import strategy.CancelMsg;
import strategy.NoReceipt;
import strategy.NoReceipt1;
import strategy.PayMsg1;
import strategy.StoreCash1;
import strategy.DisplayMenu1;
import strategy.RejectMsg1;
import strategy.SetW1;
import strategy.SetPrice1;
import strategy.ReadyMsg1;
import strategy.SetInitialValues1;
import strategy.PumpGasUnit1;
import strategy.GasPumpedMsg1;
import strategy.StopMsg1;
import strategy.PrintReceipt1;
import strategy.CancelMsg1;

public class concretefactory1 extends AF
{
     datastore1 datastore1obj= new datastore1();  
	 public PrintReceipt getPrintReceipt()
    {
		 PrintReceipt printobj =new PrintReceipt1();
		 printobj.setdata(datastore1obj);	       
	        return printobj;
    }
	 public StoreData getStoreData()
    {
		 StoreData storedataobj =new StoreData1();
		 storedataobj.setdata(datastore1obj);
		 return storedataobj;
    }
	 public SetInitialValues getSetInitialValues()
    {
		 SetInitialValues intialvalueobj = new SetInitialValues1();
        intialvalueobj.setdata(datastore1obj);
        return intialvalueobj;
    }
	 public SetPrice getSetPrice()
    {
		 SetPrice setpriceobj = new SetPrice1();
	        setpriceobj.setdata(datastore1obj);
	        return setpriceobj;
    }
	 public StoreCash getStoreCash()
     {
		    StoreCash storecashobj = new StoreCash1();
	        storecashobj.setdata(datastore1obj);
	        return storecashobj;
    }
	 public data getdata()
	 {
	        return datastore1obj;
	 }

	  public GasPumpedMsg getGasPumpedMsg()
    {
		  GasPumpedMsg gaspumpedmsgobj = new GasPumpedMsg1();
	        gaspumpedmsgobj.setdata(datastore1obj);
	        return gaspumpedmsgobj;

    }
	  public ReadyMsg getReadyMsg()
    {
		   ReadyMsg readymsgobj = new ReadyMsg1();
	        readymsgobj.setdata(datastore1obj);
	        return readymsgobj;
    }
	  public PayMsg getPayMsg()
    { 
		  PayMsg paymsgobj = new PayMsg1();
          paymsgobj.setdata(datastore1obj);
          return paymsgobj;

    }
	  public CancelMsg getCancelMsg()
	  {
		  CancelMsg ccancelmsgobj = new CancelMsg1();
          ccancelmsgobj.setdata(datastore1obj);
          return ccancelmsgobj;
	  }
	  public StopMsg getStopMsg()
	  {
		  StopMsg stopmsgobj = new StopMsg1();
          stopmsgobj.setdata(datastore1obj);
          return stopmsgobj;
	  }
	  public DisplayMenu getDisplayMenu()
	    {
		  DisplayMenu displaymenuobj = new DisplayMenu1();
          displaymenuobj.setdata(datastore1obj);
          return displaymenuobj;
	    }
	    public PumpGasUnit getPumpGasUnit()
	    {
	    	 PumpGasUnit pumpgasunitobj = new  PumpGasUnit1();
	          pumpgasunitobj.setdata(datastore1obj);
	          return pumpgasunitobj;
	    }
	    
	    public RejectMsg getRejectMsg()
	    {
	    	RejectMsg rejectmsgobj = new RejectMsg1();
	          rejectmsgobj.setdata(datastore1obj);
	          return rejectmsgobj;
	    }
	    
	    public SetW getsetW()
	    {
	    	  SetW setwobj = new SetW1();
	          setwobj.setdata(datastore1obj);
	          return setwobj;
	    }
	    public NoReceipt getNoReceipt()
	    {
	    	NoReceipt noreceiptobj = new NoReceipt1();
	          noreceiptobj.setdata(datastore1obj);
	          return noreceiptobj;
	    }
	    
}
