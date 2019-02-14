package controller;

public interface Regex {
    String NAME_REGEX = "[A-Z]{1}[a-z]*(-[A-Z]{1}[a-z]*)*";
    String NICKNAME_REGEX = "\\w+";
    String COMMENT_REGEX = "\\w*";
    String HOME_PHONE_REGEX = "[0-9]{3,7}";
    String MOBILE_PHONE_REGEX = "(0[0-9]{9})?";
    String EMAIL_REGEX = "[-\\w+]+([\\-\\_\\.]+\\w+)*@\\w+(\\.\\w+)*(\\.[A-Za-z]{2,})";
    String SKYPE_REGEX = "[\\w\\.\\_]+";
    String DATE_REGEX = "\\d{1,2}[-.]\\d{1,2}[-.](\\d{2})?\\d{2}";
    String ADDRESS_INDEX_REGEX = "\\d{5}";
    String ADDRESS_STREET_REGEX = "(-?[A-Z]{1}[a-z]*)+";
    String ADDRESS_CITY_REGEX = "(-?[A-Z]{1}[a-z]+)+";
    String HOUSE_NUMBER_REGEX = "\\d+";
    String APARTMENT_NUMBER_REGEX = "\\d+";


}
