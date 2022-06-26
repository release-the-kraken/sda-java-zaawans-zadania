package website_homework.classes_and_interfaces.Exercise1;

import java.util.regex.Pattern;

class UserValidator {
    private static final String EMAIL_FORMAT = "[a-zA-Z0-9.-_]+@[a-z]+(.[a-z]+)?";
    public String[] validateEmails(String primaryEmail, String alternativeEmail) {
        class Email {
            private String email;

            public Email(String email) {
                if (email == null || email.equals("") || !isEmailValid(email)) {
                    this.email = "unknown";
                }else {
                    this.email = email;
                }
            }

            private boolean isEmailValid(String email) {
                return Pattern.compile(EMAIL_FORMAT).matcher(email).matches();
            }
        }
        Email mainEmail = new Email(primaryEmail);
        Email altEmail = new Email(alternativeEmail);
        return new String[]{mainEmail.email, altEmail.email};

    }
}
