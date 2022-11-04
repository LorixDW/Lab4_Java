import java.util.ArrayList;
public class Box<T extends Fruit>{
    private float oneWeight;
    public String BoxType;
    private ArrayList<T> fruitList = new ArrayList<>();
    public Box(T ...fruits){
        for(int i = 0; i < fruits.length; i++){
            this.Add(fruits[i]);
        }
        if(fruits instanceof Apple[]){
            BoxType = "Apple";
        }
        if (fruits instanceof  Orrange[]){
            BoxType = "Orrange";
        }
    }
    public void Add(T obj){
        this.fruitList.add(obj);
        this.oneWeight = obj.getWeight();
    }
    public void AddNum(int n){
        for(int i = 0; i < n; i++){
            if(BoxType == "Apple"){
                this.fruitList.add((T)new Apple());
            }
            if(BoxType == "Orrange"){
                this.fruitList.add((T)new Orrange());
            }
        }
    }
    public float getWeight(){
        return this.oneWeight * fruitList.size();
    }
    public boolean Compare(Box box){
        if(this.getWeight() == box.getWeight()){
            return true;
        }
        else {
            return false;
        }
    }
    public void Transfer(Box<T> box){
        int n = fruitList.size();
        for (int i = 0; i < n; i++){
            box.Add(fruitList.get(0));
            this.fruitList.remove(0);
        }
    }
    public void Print(){
        for (T t: fruitList){
            System.out.print(t.toString() + " ");
        }
        System.out.println();
    }
}
