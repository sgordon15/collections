package edu.ti.caih313.collections.sort;

import edu.ti.caih313.collections.dataobj.Name;
import edu.ti.caih313.collections.dataobj.NameByLast;
import edu.ti.caih313.collections.dataobj.Person;
import edu.ti.caih313.collections.dataobj.PersonSortable;
import edu.ti.caih313.collections.demo.PrintGeneric;
import static edu.ti.caih313.collections.dataobj.Person.Gender.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonSortableDemo {
        public static void main(String... args) {
            PersonSortable personArray[] = {
                    new PersonSortable(new Name("John" ,"Smith"),MALE,34.0),
                    new PersonSortable(new Name("Karl"," Ng"),MALE,34.4),
                    new PersonSortable(new Name("Jeff","Smith"),MALE,11.4),
                    new PersonSortable(new Name("Tom", "Rich"),MALE,23.3),
                    new PersonSortable(new Name("Bob ","Smith"),MALE,34.5),
                    new PersonSortable(new Name("Jane"," Doe"),FEMALE,23.4),
                    new PersonSortable(new Name("Tony ","Stark"),MALE,23.4),
                    new PersonSortable(new Name("Bo ","Peep"),FEMALE,23.4)
            };

            List<PersonSortable> personList = Arrays.asList(personArray);
            PrintGeneric<PersonSortable> personSortDemo = new PrintGeneric<>();
            personSortDemo.printCollection(personList);
            Collections.sort(personList);
            System.out.print("\n");
            System.out.println("Print sorted nameList.");
            personSortDemo.printCollection(personList);
        }
    }


