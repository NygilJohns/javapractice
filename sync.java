package yahoo;
class MultiplicationTable{
	 synchronized void MultiTable(int number) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+"X"+number+"="+i*number);
		}
		}
	
}
class MyThread extends Thread{
	MultiplicationTable t;
	MyThread(MultiplicationTable t){
		this.t=t;
		
	}
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		t.MultiTable(2);
	}
}
class MyThread1 extends Thread{
	MultiplicationTable t;
	MyThread1(MultiplicationTable t){
		this.t=t;
		
	}
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		t.MultiTable(8);
	}
}
public class syncchro {
	public static void main(String [] args) {
		MultiplicationTable m=new MultiplicationTable();
		MyThread t=new MyThread(m);
		MyThread1 t1=new MyThread1(m);
		t1.setPriority(2);
		t.start();
		t1.start();
		
	}

}

