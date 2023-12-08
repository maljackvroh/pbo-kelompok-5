package percobaan_7.acc;

class human{
    String username;
    int hp;
    int mp;

    human(String nama, int health, int mana){
        this.username = nama;
        this.hp = health;
        this.mp = mana;
    }

    public void walk(){
        System.out.println(username+" berjalan");
    }

    public void jump(){
        System.out.println(username+" melompat");
    }

    public void attack(){
        System.out.println(username+" hanya menyerang menusia biasa");
    }

    public void getStatus(){
        System.out.println("STATUS");
        System.out.println("=====================");
        System.out.println("Username = "+username);
        System.out.println("HP = "+hp);
        System.out.println("MP = "+mp);
    }
}