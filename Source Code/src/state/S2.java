package state;
import output_processor.output;
public class S2 extends State
{
	@Override
    public void Approved()
    {
      output.setW(1);
      output.displayMenu();
      
    }
    public void Reject()
    {
     output.rejectMsg();
    
    }
}
