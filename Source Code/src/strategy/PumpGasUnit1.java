package strategy;

public class PumpGasUnit1 extends PumpGasUnit
{
	@Override
    public void pumpGasUnit()
    {
      
       float g=dataobj.getG();
       g=g+1;
       float total;
       float price = dataobj.getprice();
       total =price *g;
       dataobj.setG(g);
       dataobj.settotal(total);  
      }
}
