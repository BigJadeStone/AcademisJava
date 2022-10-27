package tamin0112.gmail.bytefileprocessing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		//바이트 단위로 파일에 기록하기
		try {
			//오늘 날짜를 문자열로 만들기
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					
			//기록할 파일 만들기 (프로젝트 디렉토리에 파일이 만들어짐)
			FileOutputStream fos = new FileOutputStream(
					"./" + sdf.format(date) + ".txt", true);
			//기록할 메시지 생성
			String msg = " 고니의 인기도 +1 ";
			
			//파일에 기록
			fos.write(msg.getBytes());
			
			//파일을 닫기
			fos.close();
			
			
			
		} catch (Exception e) {
			System.out.println("파일 기록 실패");
			System.out.println(e.getLocalizedMessage()); //이게 더 구체적인 문제상황을 말해주기에 더 좋아보임.
		}
		
		//앞에서 작성한 파일 읽기
		try {
			//읽기 위한 파일 생성
			FileInputStream fis = new FileInputStream("./2022-10-27.txt");
			//읽어서 저장할 바이트 배열 생성
			byte[] b = new byte[fis.available()];
			//읽기
			fis.read(b);
			//읽은 내용 확인 - 문자열로 변환
			System.out.println(new String(b));
			
			fis.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
		
		
		
		
		
		
		
		
	}//main

}
