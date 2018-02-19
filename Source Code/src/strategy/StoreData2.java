package strategy;
public class StoreData2 extends StoreData
{
	@Override
    public void storeData()
    {
      int a, b,c;
      a=dataobj.getfloata1();
      dataobj.setregularprice1(a);
      b=dataobj.getfloatb1();
      dataobj.setpremiumprice(b);
      c=dataobj.getfloatc1();
      dataobj.setsuperprice1(c);
    }
    
}