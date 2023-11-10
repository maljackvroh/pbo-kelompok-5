package percobaan_7.akmal_dzaki;

class parent{
    int x = 21;

    public void info(){
        System.out.println("Parent class");
    }
}

class child extends parent{
    int x = 11;


    public void info(){
        System.out.println("Child class");
    }
}

public class js1 {
    public static void main(String[] args) {
        parent obj = new child();

        System.out.println("x = "+obj.x);

        obj.info();
    }
}
