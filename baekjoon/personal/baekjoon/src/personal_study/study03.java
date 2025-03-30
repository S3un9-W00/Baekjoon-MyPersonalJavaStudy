package personal_study;

import java.util.Arrays; //출력을 위해 불러온 라이브러리

public class study03 {
	public static void main(String[] args) {
//		배열
		
		int[] array1 = new int[5]; //5칸의 정수형 배열을 생성
		//int면 저 다섯칸에 {0,0,0,0,0}이 들어있는것이다.
		//String이면 저 다섯칸에{null, null, null, null, null}이 있는것이다.
		
		//array1의 다섯칸에 다 값을 넣는 모습이다.
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		array1[4] = 5;
		//배열이름[번지] 형식이다.
		//배열은 1부터 5까지 시작하는것이 아니고 무조건 첫번째는 0부터시작한다(제로인덱싱)
//		그러므로 5칸이여서 0,1,2,3,4가 되는것이다.
		
		System.out.println(array1[3]);
		//특정 원소만 출력 가능하다. >> 출력 결과 : 4
		
		int[] array2 = {1,2,3,4,5}; //선언과 동시에 값을 넣는것도 가능하다.
		
		//배열의 길이를 알고싶으면 배열이름.length를 출력하면된다. length는 무조건 알아야 한다.
		
		System.out.println(array2.length); //출력 결과 : 5
		
		//배열은 for문과 같이쓰는것이 국룰을 넘어선 국제룰이다.
		
		//아래 코드는 for문을 사용한 0번째부터 4번째까지 하나씩 출력하는것이다.
		for(int i = 0; i < array2.length; i++) { //배열의 길이만큼 반복 즉 배열의 길이는 5이므로 5번 반복
			System.out.print(array2[i] + " "); //하나씩 다 출력
		}	//출력 결과 : 1 2 3 4 5
		
		System.out.println(array1);
		// 출력 결과 : [I@6193b845
		//왜 이런 값이 나오냐면 그냥 출력하면 리스트의 주소가 출력된다.
		//배열을 제대로 출력을 할거면 Arrays라는 라이브러리를 이용해서
		//Arrays.toString(array1)이렇게 써서 출력한다.
		
		System.out.println(Arrays.toString(array1));
		//출력 결과 : [1, 2, 3, 4, 5]
		
	}
}
