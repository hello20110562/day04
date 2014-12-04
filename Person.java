//怎么自定义类
public class Person{ //同名  
	//属性：成员变量：系统会默认初始化，取决于成员类型
	String name;
	int age;
	//方法：成员方法
	
	//构造器：是特殊的成员方法（无返回值），初始化成员变量，那么也可以【重载】
	//与类同名，无返回值
	Person(){ 
		System.out.println("自定义无参构造器");
	}
	//2、一参构造函数
	Person (String name){
		System.out.println("一参构造器");
		this.name = name;
	}
	//3、两参构造器
	Person(String name,int age){
		System.out.println("两参构造器");
		this.name=name;
		this.age=age;
		
	}
	
	void setName(String name){
		this.name=name;
		//
	}
	//void不可以做形参
		String getName(){
			return this.name;
		}


	void info(){
		System.out.println("Name:"+this.name+"\tAge:"+this.age);
    }
	}