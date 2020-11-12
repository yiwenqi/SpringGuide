package cn.gsdx.domain;

import java.util.List;
import java.util.Map;

public class Student {
	private String name;
	private Address addr;
	private String [] books;
	private List<String> hobbies;
	private Map<String,String> bank;
	
	//Ê¡ÂÔMap
	public void setBooks(String [] books){
		this.books =books;
	}
	
	public void setAddress(Address addr){
		this.addr = addr ; 
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHobbies (List<String> hobbies){
		this.hobbies = hobbies ;
	}
	
	public String [] getBooks(){
		return this.books;
	}
	
	public Address getAddress(){
		return this.addr;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void show(){
		System.out.println("name:"+this.name+" ,address:"+this.addr.getAddress());
		System.out.println("books=");
		for(int i = 0; i<books.length;i++){
			System.out.print(" "+books[i]);
		}
		System.out.println();
		System.out.println("hobbies="+ hobbies);
		//map
		System.out.println("bank="+ bank);
		
	}
}
