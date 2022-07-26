package ru.yandex.scooter.model;

public class InformationForOrder {

    public final String firstName;
    public final String lastName;
    public final String address;
    public final String station;
    public final String phoneNumber;
    public final String comments;

    public InformationForOrder(String firstName, String lastName, String address, String station, String phoneNumber, String comments) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.station = station;
        this.phoneNumber = phoneNumber;
        this.comments = comments;
    }

    public static InformationForOrder getSimpleCustomer() {
        return new InformationForOrder(
                "Сергей",
                "Михалев",
                "Москва",
                "Лубянка",
                "89999999999",
                "Тест"
        );
    }

    public String GetFirstName() {
        return firstName;
    }

    public String GetLastName() {
        return lastName;
    }

    public String GetAddress() {
        return address;
    }

    public String GetMetro() {
        return station;
    }

    public String GetPhoneNumber() {
        return phoneNumber;
    }

    public String GetComments() {
        return comments;
    }

}
