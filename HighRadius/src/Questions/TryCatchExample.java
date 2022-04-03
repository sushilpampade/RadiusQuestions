package Questions;

public class TryCatchExample {
	public static void main(String[] args) {
		System.out.println(getNoMethod(2));
	}
	public static int getNoMethod(int val) {
		try {
			int x=val/1;
		   	return 1;
		}catch(Exception e) {
			e.printStackTrace();
			return 2;
		}
		finally {
			return 3;
		}
	}
	                                      
                     }
