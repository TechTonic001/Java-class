class Human {
    int numberOfEyes = 2;
    int numberOfHeads = 1;
    int numberOfHands = 2;
    int numberOfLegs = 2;
    String converMaterial = "flesh";
}

class InnerOpp extends Human {
    String name;
    private int power;

    public InnerOpp(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public void boostPower(int increase) {
        this.power += increase;
        if (this.power > 100) {
            System.out.println("Power cannot exceed 100%");
        }
    }

    public void kick() {
        System.out.println(this.name = "exertecd a kick , butnr 5% power");
        this.power -= 5;
    }

    public int getPower() {
        return this.power;
    }
}

public class Opp {
    public static void main() {
        InnerOpp character1 = new InnerOpp("tope", 90);
        InnerOpp character2 = new InnerOpp("superman", 30);
        InnerOpp character3 = new InnerOpp("jerry", 60);

        character3.boostPower(10);
        character2.boostPower(10);
        character1.boostPower(50);
        System.out.println(character3.name + "has power of" + character3.getPower() + "%");
    }
}