public class Car {

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDrzwi() {
        return drzwi;
    }

    public void setDrzwi(int drzwi) {
        this.drzwi = drzwi;
    }

    public int getMarka() {
        return marka;
    }

    public void setMarka(int marka) {
        this.marka = marka;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", drzwi=" + drzwi +
                ", marka=" + marka +
                ", rok=" + rok +
                '}';
    }

    private String color;

    private int price;

    private int drzwi;

    private int marka;

    private int rok;

}
