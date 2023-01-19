package p1215;

class a03TV {
	private boolean onoff;
	private int chNum;
	private int sndNum;
	
	
	public boolean isOnoff() {
		return onoff;
	}
	public void setOnoff(boolean onoff) {
		this.onoff = onoff;
	}
	public int getChNum() {
		return chNum;
	}
	public void setChNum(int chNum) {
		this.chNum = chNum;
	}
	public int getSndNum() {
		return sndNum;
	}
	public void setSndNum(int sndNum) {
		this.sndNum = sndNum;
	}
	
}
class a03IPTV extends a03TV {
	
}

public class a03TVMain extends a03IPTV{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
