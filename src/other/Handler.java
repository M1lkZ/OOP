package other;

import person.Person;
import place.*;

import java.util.Set;

public class Handler {
    public static void handle(Set<Person> persons, Set<Service> places, TrainStation ts, Person Julio){
        Julio.move(ts);
        try {
            Julio.buy(ts,new TrainStation.Ticket());
            Julio.leave(ts);
            System.out.println("Julio is out of town with money");
        } catch (BankAccountException e) {
            System.out.println("Julio gets arrested for trying to sneak on the Train.");
        }
        for (Person person: persons) {
            System.out.println(person.getName() + " has " + person.getMoney() + "$.");
            if (person.getName() == "Neznaika"){
                person.read_letter();
            }
        }
        for (Service place: places) {
            place.handle(persons);
        }
    }
}
