package differential2;

public class Differential2_lib implements Differential2_if{
	private double a,h;

	public Differential2_lib(double a, double h) {
		super();
		this.a = a;
		this.h = h;
	}

	@Override
	public double getRx() {
		// TODO Auto-generated method stub
		return 2*this.a;
	}

	@Override
	public double getDx() {
		// TODO Auto-generated method stub
		return (Math.pow(this.a+this.h,2)-Math.pow(this.a,2))/h;
	}

	@Override
	public double getMx() {
		// TODO Auto-generated method stub
		double answer = 0,tmp;
		//while(answer < tmp){
			if(getRx() < getDx()) {
				answer = (getDx() - getRx())/getRx()*100;
				
			}else {
				answer = (getRx() - getDx())/getRx()*100; 
			}
		//}
		return answer;
	}
	
}
