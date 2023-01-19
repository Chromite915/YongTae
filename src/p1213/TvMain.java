package p1213;

class TV {
	private int size;
	public TV(int size) { 
		this.size = size; 
	}
	protected int getSize() { return size; }
}


class ColorTV extends TV{
	int color;
	ColorTV(int size, int color){
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.println(getSize() + "인치 " + this.color + "컬러");
	}
} 


class IPTV extends ColorTV{
	String ip;
	IPTV(String ip, int size, int color){
		super(size, color);
		this.ip = ip;
	}
	public void printProperty() {
		System.out.println("나의 IPTV는 " 
				+ this.ip + "주소의 " + getSize() + "인치 " + this.color + "컬러");
	}
}





public class TvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048컬러
		iptv.printProperty();
	}
}