package com.kodilla.jacoco;

public class Year {
    int givenYear;

    public Year(int year) {
        this.givenYear = year;
    }

    public boolean isLeap() {
        if (this.givenYear % 4 == 0) {
            if (this.givenYear % 100 == 0) {
                return this.givenYear % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
