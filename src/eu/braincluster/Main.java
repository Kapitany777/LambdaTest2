package eu.braincluster;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Test 1");
        Test1();

        System.out.println("Test 2");
        Test2();

    }

    private static void Test1()
    {
        String name = "Pistabá";

        name.chars()
                .forEach(c -> System.out.print(c + " "));

        System.out.println();

        name.chars()
                .forEach(c -> System.out.print((char) c + " "));

        System.out.println();

        name.chars()
                .forEach(System.out::println);

        System.out.println();

        name.chars()
                .mapToObj(c -> Character.valueOf((char) c))
                .forEach(System.out::println);

        System.out.println();
    }

    private static void Test2()
    {
        String name = "Feribá 007 agent";

        name.chars()
                .filter(c -> Character.isDigit(c))
                .forEach(c -> System.out.print((char)c));

        System.out.println();

        name.chars()
                .filter(Character::isDigit)
                .forEach(System.out::println);

        System.out.println();
    }
}
