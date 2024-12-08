import other.Handler;
import other.NotEnteredException;
import other.StressLevel;
import person.Person;
import place.Park;
import place.Restaurant;
import place.Service;
import place.TrainStation;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws NotEnteredException{
        Set<Person> persons = new HashSet<>();
        Set<Service> services = new HashSet<>();
        Person Julio = new Person("Julio",StressLevel.HAPPY, 80, 60);
        persons.add(new Person("Kozlik", StressLevel.DEPRESSED, 40,20));
        persons.add(new Person("Neznaika", StressLevel.DEPRESSED,50,30));
        services.add(new Restaurant());
        services.add(new Park());
        TrainStation trainStation = new TrainStation();
        Handler.handle(persons,services, trainStation, Julio);
    }
}