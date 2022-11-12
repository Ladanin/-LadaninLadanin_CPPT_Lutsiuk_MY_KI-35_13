public class GunClass implements Data {

    private String GunNumber;
    private String GunType;
    private String OwnerInitials;
    private int size;

    public GunClass(String GunType,String GunNumber, String OwnerInitials, int size){
        this.GunType = GunType;
        this.GunNumber = GunNumber;
        this.OwnerInitials = OwnerInitials;
        this.size = size;
    }

    public GunClass() {

    }

    public String GetGunNumber(){
        return GetGunNumber();
    }
    public String getGunType(){
        return GunType;
    }
        public void setGunType(String GunType){ this.GunType = GunType;}
    public void setGunNumber( String GunNumber){
        this.GunNumber = GunNumber;
    }
    public String GetOwnerIitials(){
        return OwnerInitials;
    }

    public void setOwnerInitials( String OwnerInitials){
        this.OwnerInitials = OwnerInitials;
    }



    public int getSize() {
        return size;
    }


    public void print() {
        System.out.print("Gun Type: " + GunType + ", Gun Number: " + GunNumber + ", Gun Owner: " + OwnerInitials +
                ", Gun Size: " + size + ";\n");
    }

    public int compareTo(Data g) {
        Integer s = size;
        return s.compareTo(g.getSize());
    }


}
