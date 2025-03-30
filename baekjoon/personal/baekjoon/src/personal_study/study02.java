package personal_study;

public class study02 {
	public static void main(String[] args) {
//		스트링버퍼와 스트링
		
		String s = ""; //String변수 생성
		
		s += "Hello"; //"Hello"라는 문자열 넣기
		s += " Java"; //" Java"라는 문자열 넣기
		System.out.println(s); //출력결과 : Hello Java
		
//		String은 +로 추가할때마다 새로운 String이 추가되는것이여서 총 4개의 String이 쓰였다
//		또 String은 한번 값이 생성되면 변경활 수 없다.
//		String은 StringBuffer보다 가볍기 때문에 문자를 많이 바꾸지 않는것이면
//		String을 사용하는게 좋다.
		
		
//		----------------------------------------------
		
		StringBuffer sb = new StringBuffer(); //스트링버퍼 인스턴스 생성
		
		sb.append("Hello"); //"Hello"라는 문자열 넣기
		sb.append(" Java"); //" Java"라는 문자열 넣기
		
		System.out.println(sb); //출력 결과 : Hello Java
		
//		StringBuffer는 객체를 한번만 생성하고 거기서 자유롭게 수정이 가능하다.
//		그러나 String보다 무겁기에 문자를 많이 바꾸는 것이 아니라면 메모리도 많이 잡아먹고
//		속도도 느려서 문자를 많이 바꾸지 않을거면 사용하지 않는게 좋다.
		
		
	}
}
