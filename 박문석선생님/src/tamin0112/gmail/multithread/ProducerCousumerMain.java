package tamin0112.gmail.multithread;

public class ProducerCousumerMain {
	
	public static void main(String[] args) {
		
		//자원 생성
		Product product = new Product();
		//하나의 자원을 이용해서 2개의 스레드를 생성해서 실행
		new Producer(product).start();
		new Customer(product).start();
		
	}

}
