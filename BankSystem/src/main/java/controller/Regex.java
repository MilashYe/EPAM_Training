package controller;

public interface Regex {
	String LOGIN_REGEX = "\\w+";
	String NAME_REGEX = "[A-Z]{1}[a-z]*(-[A-Z]{1}[a-z]*)*";
	String MOBILE_PHONE_REGEX = "(+380[0-9]{9})?";

}
