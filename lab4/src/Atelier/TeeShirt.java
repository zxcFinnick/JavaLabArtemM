package Atelier;

public class TeeShirt  extends Clothes implements IMaleClothes, IFemaleClothes{
    public TeeShirt(Sizes size, String color) {
        super(size, color);
    }
    public TeeShirt(Sizes size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Футболка{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " руб" +
                ", цвет = " + getColor() +
                "}";
    }
}
