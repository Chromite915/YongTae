package p1202;

import java.util.Random;

public class 배열로또디버그 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// 로또번호 추첨
				// 중복금지, 랜덤한 1~45의 숫자 6개, 넣을때 기존에 넣은 숫자랑 중복되는게 있는지 점검
				// 할당해야하는 변수 : 1~45 / 뽑힌 숫자들 / 기존 숫자들
				// break = 반복문을 빠져나간다
				
				Random random = new Random();
				int lotto[] = new int[6];
				
				int r; // 1 ~ 6 번호
				for(int i = 0; i<lotto.length; i++) {
					lotto[i] = random.nextInt(45)+1;
					for(int j=0; j<i; j++) { 
						if(lotto[i] == lotto[j]) {// 계속 돌면서 비교
							i--; // 중복이 나오면 i값 1 줄이고
							break; // 위로 돌아가겠다
						}
					}
				}
					for(int i=0; i<lotto.length; i++) {
						System.out.println(lotto[i]);
					}
			}
		}
// f6
// f8 건너뛰기
