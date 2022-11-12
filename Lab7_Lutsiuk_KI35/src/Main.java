/**
 * 
 author: Maksym Lutsiuk KI-35
 *
 **/
public class Main {
    
    public static void main(String[] args) {
            WeaponSafe <? super Data> MyOwnSafe = new WeaponSafe<>();
            MyOwnSafe.AddData(new GunClass("Carbine","78D513", "John Smith", 80));
            MyOwnSafe.AddData(new ArmorClass("Helmet", "Metal", 45));
            MyOwnSafe.AddData(new ArmorClass("ChestPlate", "Kevlar", 65));
            MyOwnSafe.AddData(new GunClass("Pistol","L55546DF","Kate Smith", 25));
            Data result = MyOwnSafe.findMax();
            System.out.println("\n\nThe biggest attachment in the Safe is: ");
            result.print();
            MyOwnSafe.DeleteData(0);
        result = MyOwnSafe.findMax();
        System.out.println("\n\nThe biggest attachment in the Safe is: ");
        result.print();

    }
}