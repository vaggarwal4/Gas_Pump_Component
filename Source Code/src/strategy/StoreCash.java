package strategy;
import data_store.data;
public abstract class StoreCash
{
    public static data dataobj;
    public abstract void storeCash();
    public void setdata(data dt)
    {
        dataobj=dt;
    }
}
