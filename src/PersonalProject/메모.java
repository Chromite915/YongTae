package PersonalProject;

public class 메모 {
	/* DBMS 관련해서는 자유롭게 질문 가능
	 * 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 - 깃허브 토큰
	 * 문의댓글 확인하기
	 * 
	 * 
	 * [오류해결]
	 * 갤럭시북에서 오류가 났던 이유는 Properties - Java Build Path - Libraries - MySQL Connector의 경로가 학원컴과 갤북이 달랐기때믄. 경로 다시 잡아주니 해결.
	 * 
	 * 
	 * 
	 * [주의사항]
	 * buyer테이블에 insert는 [판매 등록 버튼] 으로만 한다
	 * 
	 * 
	 * 
	 * [My Project]
	 * 인터페이스 완성 - 내용물 수정
	 * OS별 검색 안됨
	 * 판매버튼, 재고버튼, Detail버튼 화면 구성하기(창크기 조절에 따른 내용물 재구성하기) - 기능 구현하기
	 * 이후 추가적인 개발
	 * 1. 일련번호 중복 불가
	 * 2. 판매기록 검색(고객명별, 날자별, 기종별, imei별)
	 * 
	 * 
	 * 
	 * [Base Project]
	 * 1. EMPLOYEE 테이블의 attribute들 출력
	 * EMPLOYEE, DEPARTMENT 테이블에서 Left outer join을 이용하고 e.super_ssn=s.ssn 와 e.dno = dnumber 의 조건을 이용해서 Super_ssn 대신 SUPERVISOR, Dno 대신 DEPARTMENT를 출력해서 보여준다.
	 * (정상 작동)
	 * 2. 전체 직원 출력 또는 선택한 부서의 직원만을 검색하여 출력
     * 검색범위를 전체에서 부서별로 바꾸고 오른쪽에 부서명을 원하는 부서명으로 설정한 후 검색버튼을 누르면 원하는 부서의 employee 정보만 보여준다.
     * (정상 작동)
     * 검색 항목을 하나도 선택하지 않은 채 검색을 하게 되면 경고창이 뜨게 된다. 최소한 하나의 검색 항목을 선택해야 원하는 결과 table이 출력된다.
     * (정상 작동)
     * 3. 출력하고 싶은 attribute들을 선택하여 선택된 attribute만을 출력
     * (정상 작동)
     * 4. 검색된 직원을 선택하고 DB에서 삭제
     * 검색된 직원 중에서 John B Smith와 Joyce A English를 선택한다. 선택된 직원은 왼쪽 아래에 표시해서 보여준다.
     * 검색 항목 중 Name, Ssn을 체크 후 검색해야만 선택된 직원이 삭제되도록 설정했다.
     * (정상 작동)
     * 5. 검색된 직원을 선택하고 Salary를 입력하여 그 직원의 Salary를 수정
     * Salary를 포함해서 attribute가 모두 선택되어 있을 때만 Salary의 값을 정상적으로 바꿀 수 있다. 6번째 column name이 Salary일 때에 수정이 가능하도록 했기 때문이다.
     * (정상 작동)
	 * 
	 * 
	 * 
	 * [참고]
	 * 다이얼로그
	 * 이미지 넣기
	 * Exception
	 * 마우스 커서 액션
	 */

}
