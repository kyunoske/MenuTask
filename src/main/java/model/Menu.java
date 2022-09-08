package model;

import java.util.Objects;

public class Menu {

    private int number;
    private float price;
    private String name;
    private String mainDish;
    private String sideDish;
    private String beverage;

    public Menu (
            int number,
            String name,
            String mainDish,
            String sideDish,
            String beverage,
            float price)
    {
        this.number = number;
        this.name = name;
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.beverage = beverage;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainDish() {
        return mainDish;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return number == menu.number && Float.compare(menu.price, price) == 0 && Objects.equals(name, menu.name) && Objects.equals(mainDish, menu.mainDish) && Objects.equals(sideDish, menu.sideDish) && Objects.equals(beverage, menu.beverage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, price, name, mainDish, sideDish, beverage);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", mainDish='" + mainDish + '\'' +
                ", sideDish='" + sideDish + '\'' +
                ", beverage='" + beverage + '\'' +
                ", price=" + price +
                '}';
    }
}
