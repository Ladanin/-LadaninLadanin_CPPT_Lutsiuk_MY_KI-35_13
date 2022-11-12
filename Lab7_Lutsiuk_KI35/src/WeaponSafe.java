import java.util.ArrayList;

class WeaponSafe <T extends Data> {

    private ArrayList<T> array;
    public  WeaponSafe(){
        array = new ArrayList<T>();
    }
    public T findMax()
    {
        if (!array.isEmpty())
        {
            T max = array.get(0);
            for (int i=1; i< array.size(); i++)
            {
                if ( array.get(i).compareTo(max) > 0 )
                    max = array.get(i);
            }
            return max;
        }
        return null;
    }
    public void AddData(T data)
    {
        array.add(data);
        System.out.print("Element added: ");
        data.print();
    }
    public void DeleteData(int i)
    {

        array.remove(i);
    }


}
