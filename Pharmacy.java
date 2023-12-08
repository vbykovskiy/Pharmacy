import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Лекарство
public class Pharmacy implements Iterable<PharmancyComponent>, Comparable<Pharmacy> {

    private List<PharmancyComponent> components = new ArrayList<>();
    private int index = 0;

    public Pharmacy addComponent(PharmancyComponent component){
        components.add(component);
        return this;
    }

    public List<PharmancyComponent> getComponents() {
        return components;
    }

    public void setComponents(List<PharmancyComponent> components) {
        this.components = components;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "components=" + components +
                ", index=" + index +
                "} \n\n";
    }

    @Override
    public Iterator<PharmancyComponent> iterator() {
        return new Iterator<PharmancyComponent>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public PharmancyComponent next() {
                return components.get(index++);
            }
        };
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy that = (Pharmacy) o;
        if (components.size() != that.components.size()) return false;
        for (int i = 0; i < components.size(); i++) {
            if (!components.get(i).equals(that.components.get(i))) return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = components.hashCode();
        result = 31 * result + index;
        return result;
    }

    @Override
    public int compareTo(Pharmacy o) {

        int myPower = 0;
        for (PharmancyComponent pc : components) {
            myPower += pc.getPower();
        }

        int otherPower = 0;
        for (PharmancyComponent pc : o) {
            otherPower += pc.getPower();
        }
    
        return otherPower - myPower;
    }
}