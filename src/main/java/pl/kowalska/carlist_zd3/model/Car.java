package pl.kowalska.carlist_zd3.model;

public class Car {

    private long id;
    private String brand;
    private String model;
    private String color;

    public Car(long id, String brand, String model, String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Car() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
//Napisz REST API dla listy pojazdów. Pojazd będzie miał pola: id, mark, model, color.
//API które będzie obsługiwało metody webowe:
//
//do pobierania wszystkich pozycji
//do pobierania elementu po jego id
//do pobierania elementów w określonym kolorze (query)
//do dodawania pozycji
//do modyfikowania pozycji
//do modyfikowania jednego z pól pozycji
//do usuwania jeden pozycji
//Przy starcie aplikacji mają dodawać się 3 pozycje.