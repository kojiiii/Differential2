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
		System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”÷•ªŒW”‚Í"+dlib.getRx());
		System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”’lÏ•ª‚Í"+dlib.getDx());
		System.out.println("‘Š‘ÎŒë·‚Í"+dlib.getMx()+" %");
	}
}
