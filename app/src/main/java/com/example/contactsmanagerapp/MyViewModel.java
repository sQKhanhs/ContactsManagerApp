package com.example.contactsmanagerapp;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class MyViewModel extends AndroidViewModel {
    private Repository repository;

    private LiveData<List<Contacts>> allContacts;

    public MyViewModel(@NonNull Application application) {
        super(application);
        this.repository = new Repository(application);
    }

    public LiveData<List<Contacts>> getAllContacts() {
        return allContacts = repository.getAllContacts();
    }

    public void addNewContact(Contacts contact){
        repository.addContact(contact);
    }

    public void deleteContact(Contacts contact){
        repository.deleteContact(contact);
    }
}
