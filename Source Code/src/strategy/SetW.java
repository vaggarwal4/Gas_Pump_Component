package strategy;
import data_store.data;
public abstract class SetW
{
    data dataobj;
    public abstract void setW(int t);
    public void setdata(data dt)
    {
        dataobj=dt;
    }
}