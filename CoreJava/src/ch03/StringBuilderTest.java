package ch03;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append('a');
        builder.append(" tree");
        String completedString = builder.toString();

        System.out.println(completedString);
        System.out.println(builder.length());
    }
}
