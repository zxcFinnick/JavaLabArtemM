package Atelier;

public interface IMaleClothes {
    default void dressMale() {
        System.out.println("Одеваем мужчину");
    }
}
