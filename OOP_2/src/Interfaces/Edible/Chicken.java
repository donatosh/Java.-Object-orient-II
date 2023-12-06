package Interfaces.Edible;

class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Курица: Пожарить";
    }

    @Override
    public String sound() {
        return "Курица: Ко-ко-ко";
    }
}
