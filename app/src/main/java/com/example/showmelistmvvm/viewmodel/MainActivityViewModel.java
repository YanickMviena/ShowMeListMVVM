package com.example.showmelistmvvm.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.showmelistmvvm.model.Person;
import com.example.showmelistmvvm.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    // Declare Repo
    private Repository repo;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);

        //  Initialize Repo

        repo = Repository.getInstance();
    }

    // Method to  getData ( List<Person>)

 public List<Person> getData () {
        return repo.getData();


 }

}
