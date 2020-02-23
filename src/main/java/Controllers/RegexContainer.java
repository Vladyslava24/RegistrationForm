package Controllers;

public interface RegexContainer {
    // Cyrillic regex
    String REGEX_NAME_UKR = "[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";;
    String REGEX_COMMENT_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє'0-9^А-ЩЬЮЯҐІЇЄа-щьюяґіїє]*$";
    String REGEX_ADDRESS_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";

    // Latin regex
    String REGEX_NAME_LAT = "^[A-Z][a-z]{2,20}$";
    String REGEX_COMMENT = "^[A-Za-z0-9^A-Za-z0-9]*$";
    String REGEX_LOGIN = "^[A-Z][a-z0-9_-]{4,20}$";
    String REGEX_PASSWORD = "^[A-Za-z0-9_-]{8,20}$";
    String REGEX_MAIL = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
    String REGEX_HOME_PHONE = "^\\d{2}-\\d{2}-\\d{2}$";
    String REGEX_MOBILE_PHONE = "^\\+38{1}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";
    String REGEX_INDEX = "^[0]{1}[1-2]{1}\\d{3}$";
    String REGEX_ADDRESS = "^[A-Z-][a-z-[A-Z]]{2,20}$";
    String REGEX_HOME_NUMBER = "^[1-9]{1}\\d{0,3}$";
    String REGEX_FLAT_NUMBER = "^[1-9]{1}\\d{0,3}$";
    String REGEX_DATE = "(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d";
}