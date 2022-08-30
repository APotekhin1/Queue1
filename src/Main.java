import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Queue<Person> attraction = new LinkedList<>(generateClients());

        while (!attraction.isEmpty()) {
            Person currentPerson = attraction.poll();

            currentPerson.getName();
            currentPerson.getSurName();
            currentPerson.getTickets();
            int tickets = currentPerson.tickets;
            if (tickets > 0) {
                System.out.println(currentPerson.name + " " +
                        currentPerson.surName +
                        " решил прокатиться на аттракционе. " +
                        "У него есть " +
                        currentPerson.tickets + " билетов");
                currentPerson.tickets = --currentPerson.tickets;
                attraction.offer(currentPerson);
            }

        }
        System.out.println("Билеты кончились.");
    }

    public static List<Person> generateClients() {
        return List.of(
                new Person("Василий", "Иванов", 3),
                new Person("Владимир", "Петров", 5),
                new Person("Александр", "Сидоров", 1),
                new Person("Антон", "Федин", 1),
                new Person("Евгений", "Ветров", 2),
                new Person("Геннадий", "Кручин", 3)
        );
    }


}
