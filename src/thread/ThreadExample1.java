package thread;

public class ThreadExample1 {

	public static void main(String [] args){
		
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		obj1.start();
	/*	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		obj2.start();
		
	}
	
}

class Hi extends Thread{
	
	public void run(){
	
		for(int i=0; i<6;i++){
			
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}

class Hello extends Thread{
	public void run(){

		for(int i=0; i<6;i++){

			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}

}
