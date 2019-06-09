package br.com.kart.racing.enums;

public enum IgnoreTitle {
	Yes(1), No(0);
	
	private Integer value;
	
	IgnoreTitle(Integer value) {
		this.value = value;
	}
	
	public Integer value() {
		return value;
	}
}
