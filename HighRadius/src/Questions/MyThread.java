package Questions;

public class MyThread implements Runnable{

		public void run() {
			
		}

	public static void main(String[] args) {
		MyThread myT1=new MyThread();
		MyThread myT2=new Thread(new MyThread());
		//MyThread myT3=new Thread(myT1);
	}


}
