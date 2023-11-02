package percobaan_5;

class animal{
    private String nama="Bebek";
    private String tipe="Omnivora";
    private int jmlKaki=2;

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getTipe(){
        return tipe;
    }

    public void setTipe(String tipe){
        this.tipe = tipe;
    }

    public int getJmlKaki(){
        return jmlKaki;
    }

    public void setJmlKaki(int jmlKaki){
        this.jmlKaki = jmlKaki;
    }

    public void outputData(){
        System.out.println("Nama hewan itu: "+getNama());
        System.out.println("Hewan itu "+getTipe());
        System.out.println("Dia memiliki kaki "+getJmlKaki());
    }

    public void inputData(String nama, String tipe, int jmlKaki){
        setNama(nama);
        setTipe(tipe);
        setJmlKaki(jmlKaki);
    }
}

class animall extends animal{

    public void disp(){
        String makanan = "daging";

        animal w = new animal();

        w.inputData("Macan", "Karnovora", 4);
        w.outputData();

        System.out.println("Makanan "+makanan);
    }

    
}