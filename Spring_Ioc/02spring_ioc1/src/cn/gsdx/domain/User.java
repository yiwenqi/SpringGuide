package cn.gsdx.domain;

public class User {
	public String name ;
	
	public User(){
		System.out.println("���󱻴�����");
	}
	public void setName(String name){
		this.name = name;	
	}
	
	public void show(){
		System.out.println("name="+this.name);
	}

}
