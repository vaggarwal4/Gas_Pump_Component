package strategy;
import data_store.data;
public abstract class PumpGasUnit
{
   public static data dataobj;
    public abstract void pumpGasUnit();
    public void setdata(data dt)
    {
        dataobj=dt;
    }
}
