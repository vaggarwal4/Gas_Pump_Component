package strategy;
import data_store.data;
public abstract class StopMsg
{
    data dataobj;
    public abstract void stopMsg();
    public void setdata(data dt)
    {
        dataobj=dt;
    }
}