package strategy;
public class SetPrice1 extends SetPrice
{
	@Override
    public void setPrice(int g)
    {
       float a=dataobj.getregularprice();
       float b=dataobj.getsuperprice();
       if( g== 1)
       dataobj.setprice(a);
       else if (g == 2)
           dataobj.setprice(b);
    }
    
}

