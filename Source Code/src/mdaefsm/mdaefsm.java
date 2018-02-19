package mdaefsm;
import strategy.*;
import data_store.data;
import data_store.datastore2;
import output_processor.output;
import state.State;
public class mdaefsm extends PrintReceipt2
{
	
	int total1=0,cash=0,cr=0;
	
    State currentstateobj; //currentstateobj state is used to point to the current state object
    State[] list = new State[8];   
    public void setStates(State a)
    {
    currentstateobj = a;
    }
    public void setStatesList( State a1, State a2, State a3, State a4, State a5, State a6,State a7,State a8)//setting the states
    {
    	list[0] = a1; //start state
    	list[1] = a2; //S0 state
    	list[2] = a3; //S1 state
    	list[3] = a4; //S2 state 
    	list[4] = a5; //S3  state
    	list[5] = a6; //S4 state
    	list[6] = a7; //S5 state
    	list[7] = a8; //S6 state
    }
    public void Activate()
    {
    	int cur = currentstateobj.getStateId();
    	System.out.print(cur);
    	switch(cur)
    	{
        	case 0: 
        	{
        		System.out.println("\n Gas Pump is now Activated");
        		System.out.println("\n Changing State from Start to S0");
        		currentstateobj.Activate();
        	  currentstateobj = list[1];
        	  break; 
        	}
        	case 1: break; 
        	case 2: break; 
        	case 3: break; 
        	case 4: break; 
        	case 5: break; 
        	case 6: break; 
        	case 7: break; 
    	} 
    }
    public void Start()
    {   
    	int cur = currentstateobj.getStateId();
    	switch(cur)
    	{
        case 0:break; 
        case 1: 
        {
        	System.out.println("\n Gas Pump has now Started");
        	System.out.println("\n Changing State from S0 to S1");
        	currentstateobj.Start();
            currentstateobj = list[2];
            break; 
        }
        case 2:  break; 
        case 3:  break; 
        case 4:  break; 
        case 5:  break; 
        case 6:  break; 
        case 7:  break; 
     
    	}
    }

    public void PayCash()
    { 
    int cur = currentstateobj.getStateId();
    switch(cur)
    {
        case 0:  break; 
        case 1:  break; 
        case 2:
        {
        	System.out.println("\n You Selected Pay by Cash Option");
        	System.out.println("\n Changing State from S1 to S3");
        	currentstateobj.PayCash();
            currentstateobj = list[4];
         }
        case 3:  break; 
        case 4:  break; 
        case 5:  break; 
        case 6:  break; 
        case 7: break; 
    	}
    }
    public void PayCredit()
    { 
    int cur = currentstateobj.getStateId();
    switch(cur)
    {
        case 0: break; 
        case 1:  break; 
        case 2: 
        {
        	System.out.println("\n You Selected Pay by Credit Card Option");
        	System.out.println("\n Changing State from S1 to S2");
        	currentstateobj.PayCredit();
            currentstateobj = list[3];
        }
        case 3:  break; 
        case 4:  break; 
        case 5:  break; 
        case 6:  break; 
        case 7:  break; 
       
    }
}


    public void Approved()
    {
    int cur = currentstateobj.getStateId();
    switch(cur)
    {
        case 0:  break; 
        case 1:  break; 
        case 2:  break; 
        case 3:
        {
        	System.out.println("\n Your Credit Card has been Approved");
        	System.out.println("\n Changing State from S2 to S3");
        	System.out.println("\n Please Select the Gas");
        	currentstateobj.Approved();
           currentstateobj = list[4];
           break;
        }
        case 4: break; 
        case 5: break; 
        case 6: break; 
        case 7: break; 

    }
}

public void Reject()
{
    int cur = currentstateobj.getStateId();
    switch(cur)
    {
        case 0:  break; 
        case 1:  break; 
        case 2:  break; 
        case 3:
        {
        	System.out.println("\n Your Credit Card has been Rejected");
        	System.out.println("\n Changing State from S2 to S0");
        	currentstateobj.Reject();
           currentstateobj = list[1];
           break; 
        }
        case 4:break; 
        case 5:break; 
        case 6:break; 
        case 7:break; 
    }
}

public void Cancel()
{
int cur = currentstateobj.getStateId();
switch(cur)
{
    case 0:  break; 
    case 1:  break; 
    case 2:  break; 
    case 3:  break; 
    case 4: 
    { 
    	 currentstateobj.Cancel();
        currentstateobj = list[1];
        System.out.println("\n You Selected Cancel Option");
        System.out.println("\n Changing State from S3 to S0");
        break;
    }
    case 5:  break; 
    case 6:  break; 
    case 7:  break; 
}
}
public void SelectGas(int g)
{
    int cur = currentstateobj.getStateId();
    switch(cur)
    {
        case 0: break; 
        case 1: break; 
        case 2: break; 
        case 3:  break; 
        case 4: 
        { 
        	System.out.println("\n Gas selected");
        	System.out.println("\n s3 to s4");
        	System.out.println("\n Start the pump");
        	currentstateobj.SelectGas(g);
            currentstateobj = list[5];
            break;
        }
        case 5: break; 
        case 6: break; 
        case 7: break; 
    }
}

	


	public void StartPump()
	{
    int cur = currentstateobj.getStateId();
    switch(cur)
    {
        case 0:  break; 
        case 1:  break; 
        case 2:  break; 
        case 3:  break; 
        case 4:  break; 
        case 5:
        {
        	currentstateobj.StartPump();
            currentstateobj = list[6];
            System.out.println("\n The Pump has been Started");
            System.out.println("\n Changing State from S4 to S5");
            break;
        }
        case 6:  break; 
        case 7:  break; 
    }
}

	public void Pump()
	{
    int cur = currentstateobj.getStateId();
    switch(cur)
    {
        case 0:  break; 
        case 1:  break; 
        case 2:  break; 
        case 3:  break; 
        case 4:  break; 
        case 5:  break; 
        case 6: 
        { 
        	System.out.println("\n The gas is being Pumped");
        	System.out.println("\n Changing State from S5 to S5");
            currentstateobj.Pump();
            currentstateobj = list[6];
            break; 
       }
        case 7:  break; 
    }
}

	public void StopPump()
 	{
    int cur = currentstateobj.getStateId();
    switch(cur)
    {
        case 0: break; 
        case 1: break; 
        case 2: break; 
        case 3: break; 
        case 4:  break; 
        case 5:  break; 
        case 6:
        { 
        	 currentstateobj.StopPump();
            currentstateobj = list[7];
            System.out.println("\n The Pump has now been Stopped");
            System.out.println("\n Changing State from S5 to S6");
           
            total1=    PumpGasUnit.dataobj.gettotal1();
        	cash=   StoreCash.dataobj.getcash1();
            
            break;
        }
        case 7:  break; 
    	}
}
 	public void Receipt()
 	{
    int cur = currentstateobj.getStateId();
    switch(cur)
    {
        case 0:  break; 
        case 1:  break; 
        case 2: break; 
        case 3:  break; 
        case 4:  break; 
        case 5:  break; 
        case 6: break;
        case 7:
        { 
        	
        	 System.out.println("Receipt");
        	 currentstateobj.Receipt();
            currentstateobj = list[0];
            System.out.println("\n The Receipt is being Generated");
            System.out.println("\n Changing State from S6 to S0");
            break;
       }

    }
}

 	public void NoReceipt()
 	{
 		
    int cur = currentstateobj.getStateId();
    switch(cur)
    {
        case 0: break; 
        case 1: break; 
        case 2: break; 
        case 3: break; 
               
        case 4: break; 
        case 5: break; 
        case 6: break;
        case 7:
        	{ 
        		int cr=cash-total1;
        		
        			System.out.println("Cash returned="+cr);
        		
        		
            	//cr=cash-total1;
        	 currentstateobj.NoReceipt();
            currentstateobj = list[0];
            System.out.println("\n You Selected No Receipt Option");
            System.out.println("\n Changing State from S6 to S0");
            break;
        	}

    	}
 	}

}
