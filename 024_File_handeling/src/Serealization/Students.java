package Serealization;
import java.io.Serializable;

public class Students implements Serializable{
	static String al="9";
	public  String al2="8";
	
	private String name;
	private int rollno;
	private int classroom;
	private transient String baap;
	public int getClassroom() {
		return classroom;
	}
	public Students setClassroom(int classroom) {
		this.classroom = classroom;
		return this;
	}
	public String getBaap() {
		return baap;
	}
	public Students setBaap(String baap) {
		this.baap = baap;
		return this;
	}
	public String getName() {
		return name;
		
	}
	public Students setName(String name) {
		this.name = name;
		return this;
	}
	public int getRollno() {
		return rollno;
	}
	public Students setRollno(int rollno) {
		this.rollno = rollno;
		return this;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", rollno=" + rollno + ", classroom=" + classroom + ", baap=" + baap +", al="+al+",al2="+al2+"]";
	}
	
	
	

}
