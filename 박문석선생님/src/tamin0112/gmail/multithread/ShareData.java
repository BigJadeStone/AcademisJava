package tamin0112.gmail.multithread;

import java.util.concurrent.locks.ReentrantLock;

//자원을 가지고 연산을 하는 스레드에 사용할 클래스
public class ShareData implements Runnable {
	
	//연산 결과를 저장할 속성
	private int result;
	
	//연산에 사용할 인덱스
	private int idx;
	
	//공유 코드 영역을 설정하기 위한 객체
	static final ReentrantLock Lock = new ReentrantLock();
	
	//result의 getter 메서드
	public int getResult() {
		return result;
	}
	
	
	public void run() {
		try {
			for(int i=0; i<10; i++) {
				//자물쇠를 채워서 unlock 을 만날때 까지는 이 영역의 자원을 수정할 수 없음
				Lock.lock();
					idx++;
					Thread.sleep(10);
					result = result + idx;
				Lock.unlock();
			}
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
	}
	

}
