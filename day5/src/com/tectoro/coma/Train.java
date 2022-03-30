package com.tectoro.coma;

import java.util.TreeSet;

class Train1 implements Comparable<TRains> 
{
	private String Name;
	private int TrainNo;
	private String Departure;
	
public Train1(String Name,int TrainNo,String Departure)
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
	return "Train1 [Name=" + Name + ", TrainNo=" + TrainNo + ", Departure=" + Departure + "]";
}
@Override
public int compareTo(TRains o) {
	String s1=this.Departure;
	String s2=this.Departure;
	return s1.compareTo(s2);
}
}