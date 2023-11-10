package percobaan_7.akmal_dzaki;

public class js3 {
    public static void main(String[] args) {
        Hewan[] hewan = new Hewan[2];
        hewan[0] = new anjing("Bluuu", 3);
        hewan[1] = new kucing("Duma", 2);

        for(Hewan binatang : hewan){
            System.out.println("\nNama: "+binatang.getName());
            System.out.println("UmurL "+binatang.getAge());
            System.out.println("Suara: "+binatang.makeSound());
        }
    }
}


abstract class Hewan{
    private final String name;
    private int age;

    Hewan(String nwName, int nwAge){
        this.name = nwName;
        this.age = nwAge;
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }
    abstract String makeSound();
}

class anjing extends Hewan{

    anjing(String name, int age){
        super(name, age);
    }

    @Override
    String makeSound(){
        return "Wank wank!";
    }
}

class kucing extends Hewan{

    kucing(String name, int age){
        super(name, age);
    }

    @Override
    String makeSound(){
        return "Maong maong!";
    }
}