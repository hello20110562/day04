//测试person类
public class PersonTest{
	public static void main(String [] args){
		//实例化:引用（变量、实例）
		//在定义类时【没有】自定义无参构造器，编译系统自动插入构造器
	  //在定义类时【有】自定义无参构造器，使用自定义构造器
		Person geminno = new Person();
		Person gem=new Person("globle");
		Person gemnet=new Person("globle",12);
	
		
		//对象使用：引用成员变量、引用成员方法。
		geminno.info();
		gem.info();
		gemnet.info();
		gem.setName("jay");
		gem.info();
		//System.out.println("Name:"+geminno.name);
		//System.out.println("Age:"+geminno.age);
	}
}