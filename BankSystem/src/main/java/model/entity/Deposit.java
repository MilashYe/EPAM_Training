package model.entity;

import java.util.Objects;

public class Deposit  {
	private int idCred;
	private long money;
	private int percent;


	@Override
	public boolean equals(Object o) {
		if ( this == o ) return true;
		if ( o == null || getClass() != o.getClass() ) return false;
		if ( !super.equals(o) ) return false;
		Deposit deposit = (Deposit) o;
		return money == deposit.money &&
				percent == deposit.percent;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), money, percent);
	}

	public int getIdCred() {
		return idCred;
	}

	public void setIdCred(int idCred) {
		this.idCred = idCred;
	}


	public long getMoney() {
		return money;
	}


	public void setMoney(long money) {
		this.money = money;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}


}
