package tamin0112.gmail.nestedclass;

public class Outer {
	//내포 클래스 - 다른 클래스 안에 만들어진 클래스
	class Inner{
		public int num;
	}
	
	static class StaticInner{
		//내포 클래스 안에 static 멤버가 있으면 인스턴스 생성없이 사용할 수 있도록 static을 추가해야됨.
		public int num;
		public static int share;
	}
	
	public void method() {
		//메서드 안에 만들어진 클래스 - Local Inner
		//메서드 안에서만 사용이 가능한 클래스
		//보통은 로컬 이너 클래스로 사용하다가 나중에 다른 곳에서도 사용해야하게되면 안에 있는 로컬이너 클래스를 밖에다가 빼서 쓰면됨.
		class LocalInner{
			public int num;
		}
	}

}
