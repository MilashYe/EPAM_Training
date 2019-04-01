package model.entity;

public enum ROLE {
	GUEST("guest"),
	USER("user"),
	ADMIN("admin");

	private String role;

	ROLE(String s) {
		role = s;
	}

	public String getRole() {
		return role;
	}
}
