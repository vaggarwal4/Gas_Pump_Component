package state;
import output_processor.output;
public class S1 extends State
{
	@Override
    public void PayCash()
    {
     output.storeCash();
     output.setW(0);
     output.displayMenu();
     }
}
