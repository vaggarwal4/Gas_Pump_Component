package strategy;
import data_store.data;
public abstract class RejectMsg
{
    data dataobj;
    public abstract void rejectMsg();
    public void setdata(data dt)
    {
        dataobj=dt;
    }
}
