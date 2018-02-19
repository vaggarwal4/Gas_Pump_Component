package strategy;
public class SetPrice2 extends SetPrice
{
	@Override
    public void setPrice(int g)
    {
		int a=dataobj.getregularprice1();
        int b=dataobj.getpremiumprice();
        int c=dataobj.getsuperprice1();
        if( g== 1)
        dataobj.setprice1(a);
        else if (g == 2)
        dataobj.setprice1(b);
        else
        	 dataobj.setprice1(c);
    }
    
}
