//����person��
public class PersonTest{
	public static void main(String [] args){
		//ʵ����:���ã�������ʵ����
		//�ڶ�����ʱ��û�С��Զ����޲ι�����������ϵͳ�Զ����빹����
	  //�ڶ�����ʱ���С��Զ����޲ι�������ʹ���Զ��幹����
		Person geminno = new Person();
		Person gem=new Person("globle");
		Person gemnet=new Person("globle",12);
	
		
		//����ʹ�ã����ó�Ա���������ó�Ա������
		geminno.info();
		gem.info();
		gemnet.info();
		gem.setName("jay");
		gem.info();
		//System.out.println("Name:"+geminno.name);
		//System.out.println("Age:"+geminno.age);
	}
}