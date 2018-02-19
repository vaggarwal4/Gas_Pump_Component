package strategy;
import data_store.data;
public abstract class CancelMsg
{
    data dataobj;
    public abstract void cancelMsg();
    public void setdata(data dt)
    {
        dataobj=dt;
    }
}
