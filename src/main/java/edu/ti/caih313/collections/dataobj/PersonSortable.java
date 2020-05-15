package edu.ti.caih313.collections.dataobj;

import java.lang.*;

public class PersonSortable extends Person implements Comparable<PersonSortable> {
    public PersonSortable(Name name, Gender gender, double age) {
        super(name, gender);
        this.setAge(age);
    }



        @Override
        public int compareTo (PersonSortable o){
            int compare;
//compare by age
            if (getAge() == o.getAge()) {
                compare = 0;
            } else if (getAge() > o.getAge()) {
                compare = -1;
            } else {
                compare = 1;
            }
//compare by gender
            if (compare == 0) {
                if (getGender() == o.getGender()) {
                    compare = 0;
                } else if (getGender().toString().equalsIgnoreCase("male")) {
                    compare = 1;
                } else {
                    compare = -1;
                }
            }
//compare by name
            if (compare == 0) {
                compare = getName().toString().compareTo(o.getName().toString());
            }
            return compare;
        }
    }




