package strategy;
public class StoreData1 extends StoreData
{
	
	@Override
    public void storeData()
    {
      float a, b;
      a=dataobj.getfloata();
      dataobj.setregularprice(a);
      b=dataobj.getfloatb();
      dataobj.setsuperprice(b);
     }
    
}

