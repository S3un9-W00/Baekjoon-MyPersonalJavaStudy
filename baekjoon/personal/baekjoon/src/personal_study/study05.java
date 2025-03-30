package personal_study;

public class study05 {
	public static void main(String[] args) {
//		if문
//		쉽게 말해 참이면 밑에 구문을 실행한다.
		boolean bus = true; //버스가 도착했다.
		
//		아래의 코드 두개는 똑같은 코드이다.
//		if(bus == true) 버스가 도착했으면(true이면)
//		if(bus) 버스가 도착했으면(true이면) 단 true를 생략
		
//		이것도 역시 같은 코드이다
//		if(bus == false) 버스가 아직 안왔으면
//		if(!bus) 버스가 아직 안왔으면(false는 !로 줄여 말한다)
		
		if(bus) { //버스가 도착했으면
			System.out.println("버스가 도착했습니다."); //"버스가 도착했습니다"를 출력한다.
		} //위 조건은 참이므로 밑의 구문을 실행한다 그러므로 >> 출력 결과 : 버스가 도착했습니다.
		
		
		//거짓일때도 특정 코드를 실행하는 법도 있다.
		
		boolean train = false; //아직 기차가 도착하지 않았다.
		
		if(train) { //기차가 도착했으면
			System.out.println("기차가 도착했습니다."); //옆 코드 실행
		} else { //아니면(false이면)
			System.out.println("기차가 도착하지 않았습니다."); //옆 구문 실행
		} //출력 결과 : 기차가 도착하지 않았습니다.
		//이렇게 else를 써서 거짓일때 실행하게 하는것도 있다.
		
		//else에 if를 써서 거짓일때 다른 조건을 실행하는 방법도 있다.
		
		int score = 60; //점수가 60점이다.
		
		if(score == 80) { //점수가 80점이면
			System.out.println("참잘했어요"); //옆 코드 실행
		} else if(score == 70) { //아니면 점수가 70점이면
			System.out.println("잘했어요"); // 옆 구문 실행
		} else if(score == 60) { //아니면 점수가 60점이면
			System.out.println("조금만 더 분발하세요"); //옆 구문 실행
		} else { //아니면(마지막 조건은 else쓰기)
			System.out.println("더 노력하세요"); //옆 구문 실행
		} //출력 결과 : 조금만 더 분발하세요
	}
}
