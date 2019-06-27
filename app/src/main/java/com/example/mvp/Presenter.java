package com.example.mvp;

public class Presenter implements MainMvp.Presenter{

    private final MainMvp.View view;

    public Presenter(MainMvp.View view){
        this.view = view;
    }

    @Override
    public void presenterMessage() {
        view.displayMessage();
    }
}
