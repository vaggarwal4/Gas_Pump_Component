package strategy;
public class GasPumpedMsg1 extends GasPumpedMsg
{
    public void gasPumpedMsg()
    {
    	float g = dataobj.getG();
    	System.out.printf("The Gas pump has sucessfully pumped units :" +g);
    }
    
}
