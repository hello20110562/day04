//��ô�Զ�����
public class Person{ //ͬ��  
	//���ԣ���Ա������ϵͳ��Ĭ�ϳ�ʼ����ȡ���ڳ�Ա����
	String name;
	int age;
	//��������Ա����
	
	//��������������ĳ�Ա�������޷���ֵ������ʼ����Ա��������ôҲ���ԡ����ء�
	//����ͬ�����޷���ֵ
	Person(){ 
		System.out.println("�Զ����޲ι�����");
	}
	//2��һ�ι��캯��
	Person (String name){
		System.out.println("һ�ι�����");
		this.name = name;
	}
	//3�����ι�����
	Person(String name,int age){
		System.out.println("���ι�����");
		this.name=name;
		this.age=age;
		
	}
	
	void setName(String name){
		this.name=name;
		//
	}
	//void���������β�
		String getName(){
			return this.name;
		}


	void info(){
		System.out.println("Name:"+this.name+"\tAge:"+this.age);
    }
	}