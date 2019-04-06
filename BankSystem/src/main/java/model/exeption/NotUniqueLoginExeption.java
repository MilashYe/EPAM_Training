package model.exeption;

import model.entity.User;

public class NotUniqueLoginExeption extends Exception {

	private User user;

	public NotUniqueLoginExeption(User user, String string) {
		super(string);
		this.user = user;
	}

	public User getUser() {
		return user;
	}
}
