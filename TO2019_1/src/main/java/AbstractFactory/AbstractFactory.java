package AbstractFactory;

    public class AbstractFactory {

    public static void main(String[] args) {
        makeSandwich(new RegularSandwichIngredientsFactory());
        makeSandwich(new PremiumSandwichIngredientsFactory());
    }

    private static void makeSandwich(Factory sandwichEquipmentFactory) {
        Bread bread = sandwichEquipmentFactory.createBread();
        bread.produceBread();

        Butter butter = sandwichEquipmentFactory.createButter();
        butter.produceButter();

        Chesse cheese = sandwichEquipmentFactory.createChesse();
        cheese.produceChesse();
    }
}


interface Factory {
    Bread createBread();
    Butter createButter();
    Chesse createChesse();
}
interface Bread {
    void produceBread();
}
interface Butter {
    void produceButter();
}
interface Chesse {
    void produceChesse();
}

class RegularSandwich implements Factory {

    public Bread createBread() {
        return new WhiteBread();
    }

    public Butter createButter() {
        return new RegularButter();
    }

    public Chesse createChesse() {
        return new GoudaChesse();
    }
}

class RegularSandwichIngredientsFactory implements Factory {
    public Bread createBread() {
        return new WhiteBread();
    }

    public Butter createButter() {
        return new RegularButter();
    }

    public Chesse createChesse() {
        return new GoudaChesse();
    }
}

class WhiteBread implements Bread {

    public void produceBread() {
        System.out.println("Producing white bread.");
    }
}
class RegularButter implements Butter {

    public void produceButter() {
        System.out.println("Producing regular butter.");
    }
}
class GoudaChesse implements Chesse {

    public void produceChesse() {
        System.out.println("Producing gouda cheese.");
    }
}
class PremiumSandwichIngredientsFactory implements Factory {
    public Bread createBread() {
        return new DarkBread();
    }

    public Butter createButter() {
        return new GarlicButter();
    }

    public Chesse createChesse() {
        return new SalamiChesse();
    }
}

class DarkBread implements Bread {
    public void produceBread() {
        System.out.println("Producing dark bread.");
    }
}

class GarlicButter implements Butter {
    public void produceButter() {
        System.out.println("Producing garlic butter.");
    }
}

class SalamiChesse implements Chesse {
    public void produceChesse() {
        System.out.println("Producing salami cheese.");
    }
}