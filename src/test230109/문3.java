package test230109;

class ThreadTest extends Thread {
	public void run() {
		long id = Thread.currentThread().getId(); // 스레드 id 얻기
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority(); // 스레드 우선순위 값 얻기
		Thread.State s = Thread.currentThread().getState(); // 스레드 상태값 얻기
		System.out.println("현재 스레드 이름 = " + name);
		System.out.println("현재 스레드 ID = " + id);
		System.out.println("현재 스레드 우선순위 값 = " + 3);
		System.out.println("현재 스레드 상태 = " + s);
	}
}

public class 문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest th = new ThreadTest();
		th.start();
		
		long id = Thread.currentThread().getId(); // 스레드 id 얻기
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority(); // 스레드 우선순위 값 얻기
		Thread.State s = Thread.currentThread().getState(); // 스레드 상태값 얻기
		System.out.println("현재 스레드 이름 = " + name);
		System.out.println("현재 스레드 ID = " + id);
		System.out.println("현재 스레드 우선순위 값 = " + priority);
		System.out.println("현재 스레드 상태 = " + s);

	}

}
