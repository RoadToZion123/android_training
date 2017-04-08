package epam.entity.sportEquipment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import epam.entity.Shop;
import epam.enums.Category;

/**
 * Created by Artem on 06.04.2017.
 */
public class SportEquipment {

    private SportEquipment key;

    public SportEquipment() {
        this.title = title;
        this.price = price;
    }


    @SerializedName("Category")
    @Expose
    private Category category;
    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("Price")
    @Expose
    private int price;


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SportEquipment that = (SportEquipment) o;

        if (price != that.price) return false;
        if (category != that.category) return false;
        return title != null ? title.equals(that.title) : that.title == null;
    }

    @Override
    public int hashCode() {
        int result = category != null ? category.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Товар : \n" +
                " Категория : " + category + '\n' +
                " Название товара : " + title + '\n'+
                " Цена : " + price + '\n'  ;
    }

    public SportEquipment getKey() {
        return key;
    }
}
