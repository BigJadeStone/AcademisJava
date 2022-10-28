package tamin0112.gmail.stream;

import java.util.ArrayList;

public class LoopinMain {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("프로그래밍 언어");
		list.add("데이터베이스");
		list.add("프레임워크");
		list.add("소프트웨어 공학");
		list.add("Toy Project");
		
		//전체 데이터 출력 - 실행 속도는 가장 빠르지만 list 의 데이터 개수가변경되면
		//수정을 해야 함
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		//반복문 이용
		//list의 데이터 개수를 이용해서 순회를 하면 list의 데이터 개수가 변경되도 수정할 필요없음
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//변하지 않는 메소드의 호출 결과를 반복문에서 여러 번 호출하는 것은 자원의 낭비
		int len = list.size(); // 위에보다 이게 좋은 이유는, 메서드를 부르는 것보다 변수를 부르는것이 더 빠르기 떄문. 메모리 할당의 이유때문.
		for(int i=0; i<len; i++) {
			System.out.println(list.get(i));
		}
		
		//모든 데이터를 순회하는 경우라면 빠른 열거를 이용하는 것이 효율적
		for(String subject : list) {
			System.out.println(subject);
		}
		
		//빠른 열거는 반복자를 외부에 만들어서 사용하는데 스트림 API는 내부 반복자를 사용
		//데이터가 많을 때 효율적입니다.
		list.stream().forEach(subject -> {
			System.out.println(subject);
		});
		
		
	}

}
