package base180830;

public enum TestEnum {
	RED("red","红色"),
	BLUE("blue","蓝色");
	private String code;
	private String message;
	private TestEnum(String code,String message){
		this.code = code;
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
