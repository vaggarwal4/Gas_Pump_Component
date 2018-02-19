package state;
import output_processor.output;
public class S5 extends State
{
	@Override
    public void Pump()
    {
		output.pumpGasUnit();
		output.gasPumpedMsg();
		output.storeCash();
     
    }
    public void StopPump()
    {
    	
    	output.stopMsg();
    }
}