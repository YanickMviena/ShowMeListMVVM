package com.example.showmelistmvvm.repository;

import com.example.showmelistmvvm.model.Person;

import java.util.ArrayList;
import java.util.List;

public class Repository  {


    // Private Constructor
    private Repository() {



    }
    // step2 : static class to hold Instance

    static class InstanceHolder {
        static Repository INSTANCE = new Repository();

    }

    //  sTep 3 : public static method to get the instance


    public static  Repository getInstance() {
        return InstanceHolder.INSTANCE;
    }
    public List<Person> getData () {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Michael","Jordan","mj23bull@gmail.com","245891443842",""));
        return people;

    }

}
