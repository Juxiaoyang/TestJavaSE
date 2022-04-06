package src.ITXiaoJu_Test04;

import java.util.Objects;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/2/26 - 02 - 26 - 14:33
 * @Description: ITXiaoJu_Test04
 * @version: 1.0
 */
public class Phone {
    private String name;
    private double price;
    private int year;

    public Phone() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Phone(String name, double price, int year) {
        this.name = name;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
    /*public boolean equals(Object obj) {
        //需要转化一下
        if(obj instanceof Phone) {//属于Phone类的对象
            Phone other = (Phone) obj;
            if (this.getName() == other.getName() && this.getPrice() == other.getPrice() && this.getYear() == other.getYear()) {//obj无法调用get函数
                return true;
            }
        }
        return false;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.price, price) == 0 &&
                year == phone.year &&
                Objects.equals(name, phone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, year);
    }
}
