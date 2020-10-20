package com.vladancupric;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private int godiste;
	private String ime;
	
	public Student() {
		
	}
	public Student(int godiste, String ime) {
		super();
		this.godiste = godiste;
		this.ime = ime;
	}
	public int getGodiste() {
		return godiste;
	}
	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public void polaziIspit() {
		System.out.println(" Student: "+ ime + " polaze ispit");
	}
	

}
