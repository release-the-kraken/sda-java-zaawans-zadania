package website_homework.classes_and_interfaces.Exercise1;

import java.util.regex.Pattern;

class UserValidator {
    private static final String EMAIL_FORMAT = "[a-zA-Z0-9.-_]+@[a-z]+(\\\\.[a-z]+)?";

    String validateEmails(String email) {
        class Email {
            String formatEmail(String email) {
                if (email == null || email.equals("")) {
                    return "unknown";
                }
                if (!isEmailValid(email)) {
                    return "unknown";
                }
                return email;
            }

            private boolean isEmailValid(String email) {
                return Pattern.compile(EMAIL_FORMAT).matcher(email).matches();
            }
        }
        return new Email().formatEmail(email);
    }
}
