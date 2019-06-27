package com.example.mvp;

public interface MainMvp {
    interface View{
        void displayMessage();
    }
    interface Presenter{
        void presenterMessage();
    }
}
