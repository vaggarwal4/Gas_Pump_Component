package state;
import output_processor.output;
public class Start extends State
{
	@Override
    public void Activate()
    {
    	System.out.println("\n \n The Gas pump is  Activated ");
    	output.storeData();
    }
}

