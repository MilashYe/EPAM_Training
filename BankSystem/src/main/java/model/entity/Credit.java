package model.entity;

import java.util.Objects;

public class Credit {
	private int idDep;
	private long money;
	private int percent;

	@Override
	public boolean equals(Object o) {
		if ( this == o ) return true;
		if ( o == null || getClass() != o.getClass() ) return false;
		if ( !super.equals(o) ) return false;
		Credit credit = (Credit) o;
		return money == credit.money &&
				percent == credit.percent;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), money, percent);
	}

	public int getIdDep() {
		return idDep;
	}

	public void setIdDep(int idDep) {
		this.idDep = idDep;
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
