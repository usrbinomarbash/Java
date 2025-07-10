import java.util.List;
import java.util.ArrayList;

public class GenericsP1<T>{
    private final List<T> items;
    private static final int DEFAULT_CAPACITY=5;
    private final int capacity;


    public GenericsP1(){
        this(DEFAULT_CAPACITY);
    }


    public GenericsP1(int capacity){
        if(capacity<0) {
            throw new IllegalArgumentException("capacity must be > 0");
        }
        this.capacity=capacity;
        this.items=new ArrayList<>(capacity);
    }


    public void add(T item){
        if(items.size() >= capacity){
            throw new IllegalArgumentException("full");
        }
        items.add(item);
    }

    public T get(int index){
        if (index < 0 || index > items.size()){
            throw new IndexOutOfBoundsException("index: "+index+", size: "+items.size());
        }
        return items.get(index);
    }

    public int getSize(){
        return items.size();
    }

   public int getCapacity(){
        return capacity;
   }

   public boolean isFull(){
        return items.size()==capacity;
   }

    @Override
    public String toString() {
        return "GenericsP1(capacity=" + capacity + ", items=" + items + ")";
    }

   public static void main(String [] args){
        GenericsP1<String> cont1 = new GenericsP1<>(3);
        cont1.add("hello");
        cont1.add("bye");
        cont1.add("today");

       GenericsP1<Integer> cont2 = new GenericsP1<>(3);
        cont2.add(2);
        cont2.add(44);
        cont2.add(444);

       GenericsP1<Car> cont3 = new GenericsP1<>();
        Car logan = new Car(2013,"Dacia","Logan","Red");
        cont3.add(logan);

       System.out.println("Container 1: "+cont1);
       System.out.println("Container 2: "+cont2);
       System.out.println("Container 3: "+cont3);
    }

}