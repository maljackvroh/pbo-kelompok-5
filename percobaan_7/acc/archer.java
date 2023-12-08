package percobaan_7.acc;

public class archer extends human{
    archer(String username, int hp, int mp){
        super(username, hp, mp);
    }

    @Override
    public void attack(){
        System.out.println(username+" menembak");
    }
}
