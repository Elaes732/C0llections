package com.example.new_1.Figures;

public class Triangle extends Figure{
	private boolean isisoScales;
	Triangle(float a,float b,float c){
		this.a=a;
		this.b=b;
		this.c=c;
		isisoScales=IsisoScales();

	}

	private boolean IsisoScales(){		return a==b && b==c;}



	//3 sides
	
	public void calcArea(double a, double b, double c) {
		if (isisoScales){

		}
	}
	
	public double calcPer(double a, double b, double c) {
		P=a+b+c;
		return P;
	}
	
	//2 sides and angle between
	
	public void calcArea(double a, double b, int alpha) {
		double aRad = Math.toRadians(alpha);
		s = (a * b * Math.sin(aRad)) / 2;
		System.out.println(s);
	}
	
	public void calcPer(double a, double b, int alpha) {
		double aRad = Math.toRadians(alpha);
		double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(aRad));
		P = a + b + c;
		System.out.println(P);
	}
	
	//side, angle, side
	
	public void calcArea(double a, int alpha, double b) {
		double aRad = Math.toRadians(alpha);
		double bRad = Math.asin(a * Math.sin(alpha) / b);
		double yRad = Math.toRadians(180 - Math.toDegrees(bRad) - Math.toDegrees(aRad));
		s = (a * b * Math.sin(yRad)) / 2;
		System.out.println(s);
	}
	
	public void calcPer(double a, int alpha, double b) {
		double aRad = Math.toRadians(alpha);
		double bRad = Math.asin(a * Math.sin(alpha) / b);
		double yRad = Math.toRadians(180 - Math.toDegrees(bRad) - Math.toDegrees(aRad));
		double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(yRad));
		P = a + b + c;
		System.out.println(P);
	}
	
	//2 angles. side
	
	public void calcArea(int alpha, int beta, double a) {
		double aRad = Math.toRadians(alpha);
		double bRad = Math.toRadians(beta); 
		double yRad = Math.toRadians(180 - alpha - beta);
		s = (a * a * Math.sin(aRad) * Math.sin(bRad)) / (2 * Math.sin(yRad));
		System.out.println(s);
	}
	
	public void calcPer(int alpha, int beta, double a) {
		double aRad = Math.toRadians(alpha);
		double bRad = Math.toRadians(beta); 
		double yRad = Math.toRadians(180 - alpha - beta);
		double b = a * Math.sin(bRad) / Math.sin(yRad);
		double c = a * Math.sin(aRad) / Math.sin(yRad);
		P = a + b + c;
		System.out.println(b);
	}
	
	// side, angle, angle
	
	public void calcArea(double a, int alpha, int beta) {
		double aRad = Math.toRadians(alpha);
		double bRad = Math.toRadians(beta); 
		double yRad = Math.toRadians(180 - alpha - beta);
		s = (a * a * Math.sin(aRad) * Math.sin(yRad)) / (2 * Math.sin(bRad));
		System.out.println(s);
	}
	
	public void calcPer(double a, int alpha, int beta) {
		double aRad = Math.toRadians(alpha);
		double bRad = Math.toRadians(beta); 
		double yRad = Math.toRadians(180 - alpha - beta);
		double b = a * Math.sin(yRad) / Math.sin(bRad);
		double c = a * Math.sin(aRad) / Math.sin(bRad);
		P = a + b + c;
		System.out.println(P);
	}
	
	//side and height
	
	public void calcArea(double a, double h) {
		s = a * h / 2;
		System.out.println(s);
	}
	
	public void calcPer(double a, double h) {
		System.out.println("Perimeter cannot be found. Choose another arguments, please");
	}


}
