package com.springboot.custsew.entities.enums;

public enum Genre {
	FEMALE(1),
	MALE(2),
	OTHER(3);
private int code;


Genre(int code) {
	this.code=code;
}


public int getCode() {
	return code;
}


public static Genre valueOf(int code) {
	for(Genre value:Genre.values()) {
		if(value.getCode()==code) {
			return value;
		}
	}
	
	throw new IllegalArgumentException("genre code don't exist: "+code);
}


}
