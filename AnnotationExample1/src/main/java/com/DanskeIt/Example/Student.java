package com.DanskeIt.Example;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("Ranjini S")
public String name;
	@Value("RANS0001")
public String Id;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}

@Override
public String toString() {
	return "Student [name=" + name + ", Id=" + Id + "]";
}


}
