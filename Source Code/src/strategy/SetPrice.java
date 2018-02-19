package strategy;
import data_store.data;
public abstract class SetPrice
{
   data dataobj;
    public abstract void setPrice(int g);
    public void setdata(data dt)
    {
       dataobj=dt;
    }
}
