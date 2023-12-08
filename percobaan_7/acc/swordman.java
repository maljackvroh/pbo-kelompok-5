package percobaan_7.acc;

public class swordman extends human{
    swordman(String username, int hp, int mp){
        super(username, hp, mp);
    }

    @Override
    public void attack(){
        System.out.println(username+" menebas");
    }
} 