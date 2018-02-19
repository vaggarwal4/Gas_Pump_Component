package strategy;
import data_store.data;
public abstract class GasPumpedMsg{
   data dataobj;
    public abstract void gasPumpedMsg();
    
    public void setdata(data dt)
    {
    	dataobj=dt;
    }
}
