package tamin0112.gmail.multithread;

public class MutexMain {
	
	public static void main(String[] args) {
		//Runnable 인터페이스로 부터 상속받은 클래스
		ShareData shareData = new ShareData();
		//스레드 생성
		Thread th1 = new Thread(shareData);
		th1.start();
		Thread th2 = new Thread(shareData);
		th2.start();
		
		try {
			//30초 대기 - 앞의 작업이 스레드로 동작하기 때문에 작업이 끝날때까지 대기하고
			//결과를 출력
			Thread.sleep(30000);
			System.out.println(shareData.getResult());
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
