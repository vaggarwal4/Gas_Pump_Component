package strategy;
public class StoreCash1 extends StoreCash
{
    public void storeCash()
    {
        int c =dataobj.getintc();
        float d =(float)c;
        dataobj.setcash(d);
    }
    
}

