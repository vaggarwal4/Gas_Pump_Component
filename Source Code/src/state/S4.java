package state;
import output_processor.output;

public class S4 extends State
{
	@Override
    public void StartPump()
    {
      output.setInitialValues();
      output.readyMsg();
      
    }
}
