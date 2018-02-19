package state;
import output_processor.output;
public class S6 extends State
{
	@Override
    public void Receipt()
    {
     output.printReceipt();
     
    }
	public void NoReceipt()
    {
     output.NoReceipt();
     
    }
}
