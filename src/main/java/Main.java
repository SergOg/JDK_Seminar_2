public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> person1 = new Pair<>(1, "Иванов Иван");
        Pair<Integer, String> person2 = new Pair<>(2, "Сидоров Петр");
        Pair<Integer, String> person3 = new Pair<>(3, "Беглова Анна");
        System.out.println("СПИСОК УЧЕНИКОВ: ");
        System.out.println(person1 + "\n" + person2);
        System.out.println((person3.getFirst_param() + ". " + person3.getSecond_param()));
    }
}
