package homework;

public class Ex1 {
    public static void main(String[] args) {
        int x = 3;
        int y = ++x*2;
        x+=-y*3 + ++x + --y;
        y+=(-x++)%3;
        int z = x + y;
        System.out.println(x+" " +y+ " "+z);;
    }
}
