package model.dao.impl.jdbc.mysql;

public interface SQLQueries {
	String CREATE_USER = "insert into user (login, role, pwdhash, name, surname, phone) VALUES (?,?,?,?,?,?) ";
	String READ_USER_BY_LOGIN = "select * from user where login=(?)";
}
