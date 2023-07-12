package task;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Уважно подивіться на розміщення точок в квадраті");
			System.out.println(" A       B");
			System.out.println(" --------");
			for(int i=0; i<3; i++) {
				System.out.println("|        |");
			}
			System.out.println(" --------");
			System.out.println(" D       C");

			System.out.println("Введіть координати точки A(x; y), або дробовим або цілим числом");
			System.out.print("Координата х точки A: ");
			double Ax=sc.nextDouble();
			System.out.print("Координата y точки A: ");
			double Ay=sc.nextDouble();
			
			System.out.print("Введіть довжину сторони квадрата: ");
			double lengthSide=sc.nextDouble();
			if(lengthSide<=0) {
				System.out.print("Введіть (довжину строни >0): ");
				lengthSide=sc.nextDouble();
			}
			
			System.out.println("\nВведіть координати точки X(x; y), відстань від якої буде обраховуватися");
			System.out.print("Координата х точки X: ");
			double Xx=sc.nextDouble();
			System.out.print("Координата y точки X: ");
			double Xy=sc.nextDouble();
			
			isCheckedInside(Ax, Ay, lengthSide, Xx, Xy);
		} catch (Exception e) {
			System.out.println("Будь ласка, перевірте чи правильно ввели координати у формати 0.0 або 0");
		}		
	}
	
	public static void isCheckedInside(double Ax, double Ay, double length, double Xx, double Xy) {
		double Bx=Ax+length;
		double Dy=Ay+length;
				
		if(Xx >= Ax && Xx <= Bx && Xy >= Ay && Xy <= Dy) {
			System.out.println("Точка Х знаходиться всередині або на стороні квадрату");
		}else{
			System.out.println("Точка Х знаходиться поза межами квадрату");
		}
	}

}
