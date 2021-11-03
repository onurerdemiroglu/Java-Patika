public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;

        if (dodge >= 0 && dodge <= 100) {   //dogde aralığı
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
    }

    int hit(Fighter foe) {
        if (foe.isDodge()) { //hasarı atlattı health azalmadan döndürüldü
            System.out.println(foe.name + " gelen hasarı blokladı.");
            return foe.health;
        }
        if ((foe.health - this.damage) <= 0) {  //health 0'dan küçük olamaz
            return 0;
        }
        System.out.println(this.name + " => " + foe.name + "'e " + this.damage + " hasar vurdu.");
        return foe.health - this.damage;
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
