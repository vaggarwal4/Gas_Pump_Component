package strategy;
import data_store.data;
public abstract class PrintReceipt {
    public data dataobj;
    public abstract void printReceipt();
    
    public void setdata(data dt)
    {
        dataobj=dt;
    }
}
