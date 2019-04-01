package model.entity;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

public class Account {
	private int id;
	private long money;
	private Set<Date> changeTime;
	private Set<User> users;

	@Override
	public boolean equals(Object o) {
		if ( this == o ) return true;
		if ( o == null || getClass() != o.getClass() ) return false;
		Account account = (Account) o;
		return money == account.money;
	}

	@Override
	public int hashCode() {
		return Objects.hash(money);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	public void setChangeTime(Set<Date> changeTime) {
		this.changeTime = changeTime;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
}
