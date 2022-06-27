package website_homework.classes_and_interfaces.Exercise4;

class StringHelper {
    static boolean nameValidator(String name){
        boolean result  = true;
        if(name == null || name.equals("") || !Character.isUpperCase(name.charAt(0))){
            result = false;
        }
        return result;
    }
}
