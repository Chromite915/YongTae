package p1214;

class Point {							// 부모
	private int x, y;
	
	public Point(int x, int y) {		// 부모 생성자
		this.x = x; this.y = y; 
		}
	public int getX() {
		return x;
		}
	public int getY() {
		return y;
		}
	protected void move(int x, int y) {
		this.x =x; this.y = y;
		}
}

class Point3D extends Point {			// 자식
	private int z ;
	
	Point3D (int x, int y, int z){		// 자식 생성자
		super(x, y);
		this.z = z;
	}
	public void moveUp() {
		this.z += 1;
	}
	public void moveDown() {
		this.z -= 1;
	}
	void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public String toString() {
		return "(" + getX() + "," + getY() + "," + getZ() +  ")의 점";
	}
	
}

public class testMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p = new Point3D(1,2,3); // 1,2,3은 각각 x, y, z축의 값.
		
		System.out.println(p.toString()+"입니다.");
		p.moveUp(); 				// z 축으로 위쪽 이동
		System.out.println(p.toString()+"입니다.");
		p.moveDown(); 				// z 축으로 아래쪽 이동
		p.move(10, 10); 			// x, y 축으로 이동
		System.out.println(p.toString()+"입니다.");
		p.move(100, 200, 300); 		// x, y, z축으로 이동
		System.out.println(p.toString()+"입니다.");
	}

}
