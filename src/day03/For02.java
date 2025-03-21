package day03;

public class For02 {

	public static void main(String[] args) {
		// for 예제
		// 1부터 10까지 출력
		// for(1초기화; 258조건식; 47증감식){
		// 	36실행문;
		// }
		// 증감식은 참이여야 실행 (true가 될수있게 설정)
		// 초기화한 변수가 조건식을 만족하면 실행 -> 증감식(증가/감소)
		// 증가한 변수를 다시 조건식 비교 -> 만족하면 실행 -> 증감식
		// 증가한 변수를 다시 조건식 비교 -> 불만족하면 -> 종료
		
		// 단순 for 문에서는 i 값을 보통 1로 주지만,
		// 배열은 배열의 인덱스가 0부터 시작하기 때문에, int = 0; 을 기본으로 준다.
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("----------------------------");
		
		// 1부터 10까지 짝수만 출력
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("----------------------------");
		
		// 1부터 10까지의 합계 출력
		// 지역변수는 반드시 초기값이 있어야한다. 숫자 = 0, 문자 = "", null
		
//		String str = null;
//		System.out.println(str);
		
		int sum = 0; 
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("----------------------------");
		
		// 1부터 10까지 짝수의 합/ 홀수의 합 출력
		
		int sum1 = 0; // 짝수의 합을 저장할 변수 sum1
		int sum2 = 0; // 홀수의 합을 저장할 변수 sum2
		
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				sum1 += i;
			}else {
				sum2 += i;
			}
		}
		System.out.println("짝수의 합 = " + sum1);
		System.out.println("홀수의 합 = " + sum2);
		
		System.out.println("----------------------------");
		
	}

}
