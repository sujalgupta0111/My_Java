
class MyException extends RuntimeException{ //Reported Exception(Unchecked Exception)
	@Override
	public String getMessage() {
		return "Invalid Age";
	}
}
class MeraException extends Throwable{ //UnReported Exception(Checked Exception)
	@Override
	public String getMessage() {
		return "Invalid Age";
	}
}
class Employee{
	private int age;
	public void setAge(int a) throws MeraException {
		if(a<=0 || a>120) {
			throw new MeraException();
		}else {
			age=a;
		}
	}
	public int getAge() {
		return age;
	}
}
public class myownexception
{
	public static void main(String[] args)   {
		Employee s=new Employee();
		try {
			s.setAge(-12);
			System.out.println("Your age: "+s.getAge());
		}catch (MeraException e) {
			System.out.println(e);
		}
		
	}
}
