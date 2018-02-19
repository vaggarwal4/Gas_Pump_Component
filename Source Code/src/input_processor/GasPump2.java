package input_processor;
import abstract_factory.AF;
import data_store.data;
import mdaefsm.mdaefsm;
public class GasPump2 
{
	AF afobj;
	mdaefsm mdaobj;
	data dataobj;
	
    public void setMDA(mdaefsm x)
	{
		mdaobj = x;
	}
	public void setdata(data x)
	{
		dataobj = x;
	}
	public void setfactory(AF x)
	{
		afobj = x;
	}
    public void Activate(int a,int b,int c)
    {
    	if((a>0)&&(b>0)&&(c>0))
    	{
         dataobj.setfloata1(a);
         dataobj.setfloatb1(b);
         dataobj.setfloatc1(c);
         mdaobj.Activate();
                      
    	}
    }
    public void Start()
    {
        mdaobj.Start();
                
    }
    public void PayCash(int c)
    {
    	if(c>0)
    	{
    		dataobj.setfloatc1(c);
    
    	mdaobj.PayCash();
    	}
    }
    public void Cancel()
    {
        mdaobj.Cancel();
    }
    public void Premium()
    {
        mdaobj.SelectGas(2);
    }
    public void Regular()
    {
    	mdaobj.SelectGas(1);
    }
    public void Super()
    {
    	mdaobj.SelectGas(3);
    }
     public void StartPump()
    {  
       mdaobj.StartPump();
    }
    public void PumpLiter()
    {
    
    	int cash = dataobj.getcash1();
    	
    	int price =dataobj.getprice1();
    	
    	int L = dataobj.getL();  	
    	if(cash<(L+1)*price)
    	{
    		mdaobj.StopPump();
    	}
    	else
    	{
    		mdaobj.Pump();
    	}
    }
    public void Stop()
    {
       mdaobj.StopPump();
    }
    public void Receipt()
    {
    	mdaobj.Receipt();
    }
    public void NoReceipt()
    {
    	mdaobj.NoReceipt();
    }
}
    