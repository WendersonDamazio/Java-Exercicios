package aulapoo;

public class fidubiu {

		public double n1, n2, res;
	
		public void Calc(){
		res = Notas(n1,n2);
		System.out.println("Sua média é de: " + res);
		}
		public double Notas(double n1, double n2) {
			res = (n1+n2)/2;
			return res;
		}
	}


