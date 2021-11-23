package example_09_10_static;

public class Circle {
	static final double PI = 3.141592;		// ��������, Ŭ��������, ���
	double r;		// �������, �ν��Ͻ�����, ��ü�� property
	
	Circle(){}
	
	Circle(double r){
		this.r = r;
	}
	
	double getArea() {
		return Circle.PI*r*r;
	}
	
	double getRoundLength() {
		return 2*Circle.PI*r;
	}
}
