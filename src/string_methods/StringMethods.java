package string_methods;

public class StringMethods {
    public static void main(String[] args) {
        String string1 = "I am testing like s God";
        String string2 = "the best  of the best";
        char ch  = string1.charAt(6);
        String ch2 = String.valueOf(ch);
        boolean result = string2.contains(ch2);
        int index = string1.indexOf('e');
        System.out.println("Строка \"the best of the best\" содержит в себе символ '" + ch +"' и это "
                + result + ". \nСимвол 'e' находится в строке номер один под номером " + index + "." );



    }
}
