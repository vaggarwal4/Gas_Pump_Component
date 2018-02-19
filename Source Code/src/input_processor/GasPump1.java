package input_processor;
import abstract_factory.AF;
import data_store.data;
import mdaefsm.mdaefsm;
public class GasPump1
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
    public void Activate(float a,float b)
    {
    	if((a>0)&&(b>0))
    	{
         dataobj.setfloata(a);
         dataobj.setfloatb(b);
         mdaobj.Activate();
                      
    	}
    }
    public void Start()
    {
        mdaobj.Start();
    }
    public void PayCredit()
    {
        mdaobj.PayCredit();
    }
    public void Reject()
    {
        mdaobj.Reject();
    }
    public void Cancel()
    {
        mdaobj.Cancel();
    }
    public void Approved()
    {
       mdaobj.Approved();
       
    }
    public void Super()
    {
    	mdaobj.SelectGas(2);
    }
    public void Regular()
    {
    	mdaobj.SelectGas(1);
    }
     public void StartPump()
    {  
       mdaobj.StartPump();
    }
    public void PumpGallon()
    {
    	mdaobj.Pump();    	
    }
    public void StopPump()
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

