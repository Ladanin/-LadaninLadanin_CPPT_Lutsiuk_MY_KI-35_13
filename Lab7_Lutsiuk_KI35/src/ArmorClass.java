public class ArmorClass implements Data {

    private String ArmorType;
    private String ArmorMaterial;
    private int size;
    public ArmorClass( String ArmorType, String ArmorMaterial, int size){
        this.ArmorMaterial = ArmorMaterial;
        this.ArmorType = ArmorType;
        this.size = size;
    }

    public String getArmorType(){ return  ArmorType;}
    public String getArmorMaterial(){return ArmorMaterial;}
    public  void setArmorType( String ArmorType){this.ArmorType = ArmorType;}
    public  void setArmorMaterial( String ArmorMaterial){this.ArmorType = ArmorType;}




    public int getSize() {
        return size;
    }


    public void print() {
        System.out.print("Armor Type: " + ArmorType + ", Armor Material" + ArmorMaterial
                + ", Armor Size: " + size + "\n");
    }


    public int compareTo(Data o) {
        Integer s = size;
        return s.compareTo(o.getSize());
    }
}
