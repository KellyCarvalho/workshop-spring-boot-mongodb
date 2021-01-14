package com.springboot.custsew.entities.enums;

public enum TypeAccess {
	ADMIN(1),
	USER(2);

	private int code;
	TypeAccess(int code) {
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
		
		throw new IllegalArgumentException("type Access code don't exist: "+code);
	}
	

	

}
