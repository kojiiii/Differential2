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
		System.out.println("f(x)=x^2��x="+a+"�ɂ���������W����"+dlib.getRx());
		System.out.println("f(x)=x^2��x="+a+"�ɂ����鐔�l�ϕ���"+dlib.getDx());
		System.out.println("���Ό덷��"+dlib.getMx()+" %");
	}
}
