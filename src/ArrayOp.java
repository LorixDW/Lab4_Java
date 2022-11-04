import java.util.ArrayList;
public class ArrayOp<T> {
    public ArrayList<T> ToList(T[] mass){
        ArrayList<T> list = new ArrayList<>();
        for(int i = 0; i < mass.length;i++){
            list.add(mass[i]);
        }
        return list;
    }
    public T[] Swap(T[] mass, int x1, int x2){
        T temp = mass[x1];
        mass[x1] = mass[x2];
        mass[x2] = temp;
        return mass;
    }
    public void Print(T[] mass){
        for(int i = 0; i < mass.length; i++){
            System.out.print(mass[i] + " ");
        }
        System.out.println();
    }
    public void PrintList(ArrayList<T> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}

