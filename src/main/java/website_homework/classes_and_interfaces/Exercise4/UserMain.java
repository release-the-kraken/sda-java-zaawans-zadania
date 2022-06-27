package website_homework.classes_and_interfaces.Exercise4;

public class UserMain {
    private static final String REQUIRED_PASSWORD_CHARACTER = "!";
    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Jerry", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return StringHelper.nameValidator(input);
            }
        });
        user.setLastName("Seinfeld", new Validator<String>(){

            @Override
            public boolean validate(String input) {
                return StringHelper.nameValidator(input);
            }
        });
        user.setAge(33, new Validator<Integer>(){

            @Override
            public boolean validate(Integer input) {
                boolean result = true;
                if(input < 0 || input > 150){
                    result = false;
                }
                return result;
            }
        });
        user.setLogin("abcdefghij", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.length() == 10;
            }
        });
        user.setPassword("Hello_Newman!", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.contains(REQUIRED_PASSWORD_CHARACTER);
            }
        });
        System.out.println(user);
    }
}
