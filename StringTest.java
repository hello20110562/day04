public class StringTest{
	public static void main(String  args[]){
		String getting ="hello";
		String s=getting.substring(0,3);
		System.out.println(""+getting);
		System.out.println(""+s);
		String message=getting+s;
		System.out.println("the answer is" );System.out.println(""+message);
	}
}