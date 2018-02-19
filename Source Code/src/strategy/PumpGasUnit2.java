package strategy;
public class PumpGasUnit2 extends PumpGasUnit
{
	@Override
    public void pumpGasUnit()
    {
       int l=dataobj.getL();
       l=l+1;
       int total1;
       int price1 = dataobj.getprice1();
       total1 =price1*l;
       dataobj.setL(l);
       dataobj.settotal1(total1);  
     }
    
}
