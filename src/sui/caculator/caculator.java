
package sui.caculator;

public class caculator{


	public static void main(String args[]){
		calcontroller calcon=new calcontroller();
		inoutput inout = new inoutput();
		inout.printHeader();
		while(true){
			int option = inout.getOption();
			
			if(option==1){
				calcon.dosum();
			}
			else if(option==2){
				calcon.dodiff();
			}
			else if(option==3){
				calcon.domul();
			}
			else if(option==4){
				calcon.dodiv();
			}else if(option==5){
				calcon.doexit();
				break;
			}
			else{
				inout.printErrorMessage();
			}
		}
	}
}

