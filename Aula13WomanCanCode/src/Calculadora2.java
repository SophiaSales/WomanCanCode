
public class Calculadora2 {
	double n1,n2;
	
	public double getSoma() {
		return n1+n2;
	}
	public void setSoma(double n1, double n2) {
		this.n1= n1;
		this.n2= n2;
	}
	public double getSubtracao() {
		return n1-n2;
	}
	public void setSubtracao(double n1, double n2) {
		this.n1= n1;
		this.n2= n2;	
	}
	public double getMultiplicacao() {
		return n1*n2;
	}
	public void setMultiplicacao(double n1, double n2) {
		this.n1= n1;
		this.n2= n2;
	}
	public double getDivisao() {
		if(n2==0) {
			return-1;
		}else
			return n1/n2;
	}
	public void setDivisao(double n1, double n2) {
		this.n1= n1;
		this.n2= n2;
	}

}
