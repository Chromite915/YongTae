package p1205;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int wincount = 0; // 사용자 승리 횟수
		int losecount = 0; // 컴퓨터 승리 횟수
		while(true) {
			System.out.println("가위(0), 바위(1) 보(2) 입력 :");
			// 인간측 변수
			int a = s.nextInt();
			if (a==0) {
				System.out.println("Player : 가위");
			}
			if (a==1) {
				System.out.println("Player : 바위");
			}
			if (a==2) {
				System.out.println("Player : 보");
			}
			
			
			// 컴퓨터측 변수
			Random r = new Random();
			int ran = r.nextInt(3); // 0 ~ 2
			int com=(int)(ran);
			if(com==0)	{
				System.out.println("컴퓨터 : 가위");
			}
			if(com==1)	{
				System.out.println("컴퓨터 : 바위");
			}
			if(com==2)	{
				System.out.println("컴퓨터 : 보");
			}
			
			if(com-a==-2 || com-a==1)	{       // 0(가위), 1(바위), 2(보) 사이의 덧셈뺄셈을 이용
				System.out.println("컴퓨터 Win");
				losecount++;
			}
			if(com-a==-1 || com-a==2){
				System.out.println("Player Win");
				wincount++;
			}
			if(com-a==0){
				System.out.println("비겼습니다.");
			}
			System.out.println("Player ==> " + wincount + "승 " + losecount + "패");
			System.out.println("재대결(1), 종료(2)");
				int re = s.nextInt(); // 재대결 변수
			if(re == 2) {             // 꼭 1이 아니라도 2 아닌거만 입력하면 재대결 할 상태
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}
}