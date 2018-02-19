package strategy;
import data_store.data;
public abstract class DisplayMenu
{
  data dataobj;
  public abstract void displayMenu();
  public void setdata(data dt)
    {
        dataobj=dt;
    }
}

