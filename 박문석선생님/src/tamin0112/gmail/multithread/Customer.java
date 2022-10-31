package tamin0112.gmail.multithread;

public class Customer extends Thread{
	
	public Product myList;
	
	public Customer(Product myList) {
		this.myList = myList;
	}
	
	@Override
	public void run() {
		for(int i=0; i<26; i++) {
			myList.get();
		}
	}

}
