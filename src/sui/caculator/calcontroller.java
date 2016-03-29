package sui.caculator;

public class calcontroller {
	calfun c1=new calfun();
	inoutput i1=new inoutput();
	void dosum(){ 
		i1.input();
		int sum1=c1.sum(i1.a,i1.b);
		System.out.println("sum= "+sum1);
	}
	void dodiff(){
		i1.input();
		int diff1=c1.diff(i1.a, i1.b);
		System.out.println("diff "+diff1);
	}
	void domul(){
		i1.input();
		int mul1=c1.mulp(i1.a, i1.b);
		System.out.println("mul= "+mul1);
	}
	void dodiv(){
		i1.input();
		int div=c1.div(i1.a, i1.b);
		System.out.println("div= "+div);

	}
	void doexit(){
		System.out.println("exit");
	}
}
