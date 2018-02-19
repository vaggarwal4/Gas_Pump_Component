package state;
import output_processor.output;

public class S3 extends State
{
	@Override
	public void Cancel()
    {
      output.cancelMsg();
     
    }
	public void SelectGas(int g)
    {
      output.setPrice(g);
     
    }
    
}
