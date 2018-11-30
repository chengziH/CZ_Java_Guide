package base180830;

public class Person {
	private String name;
	private int age;
	{
		name = "橙子";
		age = 29;
	}
	public Person(){
	}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String getPerson(){
		return "姓名："+name+"    年龄："+age;
	}
}
