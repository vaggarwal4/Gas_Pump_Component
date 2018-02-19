package state;
import output_processor.output;
public class State 
{
	output outputobj;//object of the output processor
	int Stateid;    
    public int getStateId()
    {
        return Stateid;
    }
    public void setoutput(output o)
    {
        outputobj = o;
    }
    public void setStateId(int a)
    {
        Stateid = a;
    }
    public void Activate(){}
    public void Start(){}
    public void PayCash(){}
    public void PayCredit(){}
    public void Approved(){}
    public void Reject(){}
    public void SelectGas(int g){}
    public void Cancel(){}
    public void StartPump(){}
    public void Pump(){}
    public void StopPump(){}
    public void Receipt(){}
    public void NoReceipt(){}
    
}
