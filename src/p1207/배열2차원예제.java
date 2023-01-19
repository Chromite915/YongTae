package p1207;

public class 배열2차원예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double score[][] = {{3.3, 3.4},		// 1학년 1, 2학기 평점
				  		{3.5, 3.6},		// 2학년 1, 2학기 평점
			  			{3.7, 4.0},		// 3학년 1, 2학기 평점
		  				{4.1, 4.2}};	// 4학년 1, 2학기 평점
	
	double sum = 0;
	for(int year=0; year<score.length; year++) { // 각 학년별로 반복
		for(int term=0; term<score[year].length; term++) { // 각 학년의 학기별로 반복, y가 0이면 length는 2개
			sum += score[year][term]; // 전체평점 합
			
		}
	}
	int n = score.length; // 배열의 행 개수, 4
	int m = score[0].length; // 배열의 열 개수, 2
	System.out.println("4년 전체 평균은 " + sum/(n*m));
	}

}
