
public class Hello {


//added one line

	//block
	static{
		System.out.print("static block executed...");
	}
	
	//method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method executed...");
		
		float f=12.345f;
		int i=(int) f;
		System.out.println(i);//0.345
		
		byte b=(byte) 200;//-128..-127..-126.....72nd to 127 ----> 72
		System.out.println(b);	
		
		
	}
	
	{
		System.out.print("non static block executed...");
	}

}
