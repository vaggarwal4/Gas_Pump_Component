package strategy;
import data_store.data;
public abstract class StoreData
{
    data dataobj;
    public abstract void storeData();
    public void setdata(data dt)
    {
        dataobj=dt;
    }
}
