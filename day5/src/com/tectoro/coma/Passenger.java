package com.tectoro.coma;

import java.util.TreeSet;

class TrainA implements Comparable<TrainA> 
{
	private String Name;
	private int TrainNo;
	private String Departure;
	
public TrainA(String Name,int TrainNo,String Departure)
{
	this.Name=Name;
	this.TrainNo=TrainNo;
	this.Departure=Departure;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public int getTrainNo() {
	return TrainNo;
}

public void setTrainNo(int trainNo) {
	TrainNo = trainNo;
}

public String getDeparture() {
	return Departure;
}

public void setDeparture(String departure) {
	Departure = departure;
}

@Override
public String toString() {
	return "TrainA [Name=" + Name + ", TrainNo=" + TrainNo + ", Departure=" + Departure + "]";
}

@Override
public int compareTo(TrainA o) {
	String s1=this.Departure;
	String s2=o.Departure;
	return s1.compareTo(s2);
}

}


public class Passenger 
{
	public static void main(String[] args) 
	{	
		TrainA t1=new TrainA("sabari",123,"10:00");
		TrainA t2=new TrainA("ganga",124,"11:00");
		TrainA t3=new TrainA("venkatadri",128,"12:00");
		TrainA t4=new TrainA("neeladri",129,"01:00");
		TrainA t5=new TrainA("rajadhani",125,"02:00");
		
		
		TreeSet<TrainA> st=new TreeSet<TrainA>();
		st.add(t1);
		st.add(t2);
		st.add(t3);
		st.add(t4);
		st.add(t5);
		for (TrainA tr : st)
		{
			System.out.println(tr);
		}
		
		
	}

	}
