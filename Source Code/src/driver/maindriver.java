package driver;

import mdaefsm.mdaefsm;
import output_processor.output;
import java.io.IOException;
import java.util.Scanner;
import abstract_factory.AF;
import abstract_factory.concretefactory1;
import abstract_factory.concretefactory2;
import data_store.data;
import input_processor.GasPump1;
import input_processor.GasPump2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import state.Start;
import state.S0;
import state.S1;
import state.S2;
import state.S3;
import state.S4;
import state.S5;
import state.S6;


public class maindriver
{
	static Scanner input=new Scanner(System.in);
	static BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException
    {
        System.out.println("\n ***Gas Pump Model*** ");
		System.out.println("\n	Select the Gas Pump ");
		System.out.println("\n 1. GasPump-1 ");
		System.out.println("\n 2. GasPump-2 ");
		System.out.println("\n Enter your choice ");
		int choice = input.nextInt();
        switch(choice)
        {
                case 1:
                {       	
                	GasPump1 gaspump1obj = new GasPump1(); //gaspump1 represents the object of Gas Pump 1
                	Start s0obj  = new Start();//s0obj represents the object Of state 0
                    S0 s1obj = new S0();//s1obj represents the object Of state 1
                    S1 s2obj = new S1();//s2obj represents the object Of state 2
                    S2 s3obj = new S2();//s3obj represents the object Of state 3
                    S3 s4obj = new S3();//s4obj represents the object Of state 4
                    S4 s5obj = new S4();//s5obj represents the object Of state 5
                    S5 s6obj = new S5();//s6obj represents the object Of state 6
                    S6 s7obj = new S6();//s7obj represents the object Of state 7
                    mdaefsm mdaobj = new mdaefsm();
                    output outputobj = new output();
                    concretefactory1 concretefactory1obj = new concretefactory1();
                    data d_o;
                    d_o = concretefactory1obj.getdata();
                    gaspump1obj.setMDA(mdaobj); //Setting the mda with the mda object created
                    gaspump1obj.setfactory(concretefactory1obj);// Setting the object of the concrete factory 1 
                    gaspump1obj.setdata(d_o);
                    s0obj.setoutput(outputobj);
                    s0obj.setStateId(0);
                    s1obj.setoutput(outputobj);
                    s1obj.setStateId(1);
                    s2obj.setoutput(outputobj);
                    s2obj.setStateId(2);
                    s3obj.setoutput(outputobj);
                    s3obj.setStateId(3);
                    s4obj.setoutput(outputobj);
                    s4obj.setStateId(4);
                    s5obj.setoutput(outputobj);
                    s5obj.setStateId(5);
                    s6obj.setoutput(outputobj);
                    s6obj.setStateId(6);
                    s7obj.setoutput(outputobj);
                    s7obj.setStateId(7);
                    outputobj.setData(d_o);
                    outputobj.setfactory(concretefactory1obj);
                    mdaobj.setStates(s0obj);    
                    mdaobj.setStatesList(s0obj,s1obj,s2obj,s3obj,s4obj,s5obj,s6obj,s7obj);  
                    String input=null;
                    int ch;
                    while(true)
                    {
                    	System.out.println("\n\n Please Select the option from the Available Choices for GasPump-1 ");
						System.out.println("\n 0.\t Activate (Regular,Super) "); 
						System.out.println("\n 1.\t Start ");
						System.out.println("\n 2.\t PayCredit ");
						System.out.println("\n 3.\t Reject");
						System.out.println("\n 4.\t Cancel ");
						System.out.println("\n 5.\t Approved  ");
						System.out.println("\n 6.\t Super ");
						System.out.println("\n 7.\t Regular ");
						System.out.println("\n 8.\t StartPump");
						System.out.println("\n 9.\t PumpGallon");
						System.out.println("\n 10.\t StopPump");
						System.out.println("\n 11.\t Quit");
//						System.out.println("\n 12.\t NoReceipt()");
						System.out.println("\n Press any other key to exit \n\n ");
						input=buf.readLine();
                        ch=Integer.parseInt(input);
                        switch(ch)
                        {
							case 0: System.out.println(" \n\n Enter the value of a to activate");
                    			float a=Float.parseFloat(buf.readLine());
                    			System.out.println("\n\n Enter the value of b to activate");
                    			float b=Float.parseFloat(buf.readLine());
                    			gaspump1obj.Activate(a,b);      // Calls method Activate in Gas Pump 1
                    			break;

							case 1: gaspump1obj.Start();   // Calls method Start in Gas Pump 1
                        		break;
                        		
							case 2: gaspump1obj.PayCredit();   // Calls method PayCredit in Gas Pump 1
                    			break;
                    			
							case 3: gaspump1obj.Reject();   // Calls method Reject in Gas Pump 1
                        		break;
                        		
							case 4: gaspump1obj.Cancel();   // Calls method Reject in Gas Pump 1
                        		break;
                        		
							case 5: gaspump1obj.Approved();   // Calls method Approved in Gas Pump 1
                        		break;
                        		
							case 6:gaspump1obj.Super();       // Calls method Super in Gas Pump 1
                    			break;
                    			
							case 7:gaspump1obj.Regular();      // Calls method Regular in Gas Pump 1
                    			break;
	
							case 8: gaspump1obj.StartPump();   // Calls method StartPump in Gas Pump 1
                        		break;
                        		
							case 9: gaspump1obj.PumpGallon();   // Calls method PumpGallon in Gas Pump 1
                        		break;
                        		
							case 10: gaspump1obj.StopPump();   // Calls method StopPump in Gas Pump 1
									 gaspump1obj.Receipt();      // Calls method Receipt in Gas Pump 1
									 break;
                        		
	                        case 11:System.exit(0);      // Calls method Receipt in Gas Pump 1
                    		break;
//                    		
//	                        case 12:gaspump1obj.NoReceipt();    // Calls method NoReceipt in Gas Pump 1
//                    		break;
	                    default: 
                        System.out.println("\n Please enter Correct Option ");
                    }
                }
              }
                
              case 2:
              {
                    GasPump2 gaspump2obj = new GasPump2(); //gaspumpobj2 represents the object of Gas Pump 2
                	Start s0obj  = new Start();//s0obj represents the object Of state 0
                    S0 s1obj = new S0();//s1obj represents the object Of state 1
                    S1 s2obj = new S1();//s2obj represents the object Of state 2
                    S2 s3obj = new S2();//s3obj represents the object Of state 3
                    S3 s4obj = new S3();//s4obj represents the object Of state 4
                    S4 s5obj = new S4();//s5obj represents the object Of state 5
                    S5 s6obj = new S5();//s6obj represents the object Of state 6
                    S6 s7obj = new S6();//s7obj represents the object Of state 7
                    mdaefsm mdaobj = new mdaefsm();
                    output outputobj = new output();
                    concretefactory2 concretefactory2obj = new concretefactory2();
                    data d_o;
                    d_o = concretefactory2obj.getdata();
                    gaspump2obj.setMDA(mdaobj);//set the mda with the mda object created
                    gaspump2obj.setfactory(concretefactory2obj);
                    gaspump2obj.setdata(d_o);
                    s0obj.setoutput(outputobj);
                    s0obj.setStateId(0);
                    s1obj.setoutput(outputobj);
                    s1obj.setStateId(1);
                    s2obj.setoutput(outputobj);
                    s2obj.setStateId(2);
                    s3obj.setoutput(outputobj);
                    s3obj.setStateId(3);
                    s4obj.setoutput(outputobj);
                    s4obj.setStateId(4);
                    s5obj.setoutput(outputobj);
                    s5obj.setStateId(5);
                    s6obj.setoutput(outputobj);
                    s6obj.setStateId(6);
                    s7obj.setoutput(outputobj);
                    s7obj.setStateId(7);
                    outputobj.setData(d_o);
                    outputobj.setfactory(concretefactory2obj);
                    mdaobj.setStates(s0obj);    
                    mdaobj.setStatesList(s0obj,s1obj,s2obj,s3obj,s4obj,s5obj,s6obj,s7obj);  
                    String input=null;
                    int ch;
                    while(true)
                    {
                    	System.out.println("\n Select your option from the Available choices for GasPump-2 ");
						System.out.println("\n 0.\t Activate (Regular, Premium, Super)"); 
						System.out.println("\n 1.\t Start()");
						System.out.println("\n 2.\t PayCash()");
						System.out.println("\n 3.\t Cancel()");
						System.out.println("\n 4.\t Premium()");
						System.out.println("\n 5.\t Regular()");
						System.out.println("\n 6.\t Super()");
						System.out.println("\n 7.\t StartPump()");
						System.out.println("\n 8.\t PumpLiter()");
						System.out.println("\n 9.\t Stop()");
						System.out.println("\n 10.\t Receipt()");
						System.out.println("\n 11.\t NoReceipt()");
						System.out.println("\n 12.\t Quit");
						System.out.println("\n Press any other key to exit \n\n ");
						input=buf.readLine();
                        ch=Integer.parseInt(input);
                        switch(ch)
                        {
                        	case 0: System.out.println(" \n\n Enter the value of a to activate");
                            	int a=Integer.parseInt(buf.readLine());
                            	System.out.println(" \n\n Enter the value of b to activate");
                            	int b=Integer.parseInt(buf.readLine());
                            	System.out.println(" \n\n Enter the value of c to activate");
                            	int c=Integer.parseInt(buf.readLine());
                            	gaspump2obj.Activate(a,b,c);      //Calls method Activate
                            	break;

                        case 1: gaspump2obj.Start();   // Calls method Start 
                        		break;
                        		
                        case 2: System.out.println("\n Enter the cash amount "); 
                        		int c2=Integer.parseInt(buf.readLine());
                        		gaspump2obj.PayCash(c2);  //Calls method PayCash
                        		break;
                        		
                        case 3: gaspump2obj.Cancel();   //Calls method Cancel
                            	break;
                            	
                        case 4: gaspump2obj.Premium();  //Calls method Premium
                            	break;
                            	
                        case 5: gaspump2obj.Regular();   //Calls method Regular
                            	break;
                            	
                        case 6: gaspump2obj.Super();   //Calls method Super
                    			break;       
                    			
                        case 7: gaspump2obj.StartPump();   //Calls method StartPump
                            	break;
                            	
                        case 8:gaspump2obj.PumpLiter();    //Calls method PumpLiter
                        		break;

                        case 9: gaspump2obj.Stop();       //Calls method Stop
                            	break;
                            
                        case 10:gaspump2obj.Receipt();     //Calls method Receipt
                        		break;
                        	
                        case 11:gaspump2obj.NoReceipt();    //Calls method NoReceipt
                        		break;
                        case 12:System.exit(0);      
                				break;
                        default: 
                        		System.out.println("\n Please Enter Correct Option. \n ");
                    }
                }     
            }         
            }
    }
}