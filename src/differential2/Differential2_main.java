package differential2;

import java.util.Scanner;

import differential2.Differential2_lib;

public class Differential2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input value of a> ");
		double a = Double.parseDouble(scan.next());
		System.out.print("Input value of h> ");
		double h = Double.parseDouble(scan.next());
		Differential2_lib dlib = new Differential2_lib(a,h);
		System.out.println("f(x)=x^2のx="+a+"における微分係数は"+dlib.getRx());
		System.out.println("f(x)=x^2のx="+a+"における数値積分は"+dlib.getDx());
		System.out.println("相対誤差は"+dlib.getMx()+" %");
	}
}
