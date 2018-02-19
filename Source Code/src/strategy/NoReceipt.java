package strategy;
import data_store.data;
public abstract class NoReceipt
{
	data dataobj;
    public abstract void noReceipt();
    
    public void setdata(data dt)
    {
    	dataobj=dt;
    }
}