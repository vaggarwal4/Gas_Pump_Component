package strategy;
import data_store.data;
public abstract class ReadyMsg
{
    data dataobj;
    public abstract void readyMsg();
    public void setdata(data dt)
    {
        dataobj=dt;
    }
}
