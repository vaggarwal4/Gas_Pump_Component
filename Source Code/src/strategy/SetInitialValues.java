package strategy;
import data_store.data;
public abstract class SetInitialValues
{
	data dataobj;
    public abstract void setInitialValues();
    public void setdata(data dt)
    {
        dataobj=dt;
    }
}
