package strategy;
import data_store.data;
public abstract class PayMsg
{
    data dataobj;
    public abstract void payMsg();
    
    public void setdata(data dt)
    {
    	dataobj=dt;
    }
}

