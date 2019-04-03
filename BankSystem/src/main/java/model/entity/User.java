package model.entity;

import java.util.Objects;
import java.util.Set;

public class User {
	private String login;
	private ROLE role;
	private Set<Account> accounts;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setRole(ROLE role) {
		this.role = role;
	}

	public String getRole() {
		return role.getRole();
	}

	public Set<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public boolean equals(Object o) {
		if ( this == o ) return true;
		if ( o == null || getClass() != o.getClass() ) return false;
		User user = (User) o;
		return login.equals(user.login) &&
				role.equals(user.role) &&
				accounts.equals(user.accounts);
	}

	@Override
	public int hashCode() {
		return Objects.hash(login, role, accounts);
	}

}
