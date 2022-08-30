public class Person {
    protected String name;
    protected String surName;
    protected int tickets;

    public Person(String name, String surName, int tickets) {
        this.name = name;
        this.surName = surName;
        this.tickets = tickets;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

}
