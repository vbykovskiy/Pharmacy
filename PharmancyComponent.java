public class PharmancyComponent implements Comparable<PharmancyComponent> {

    private String name;
    private String weight;
    private int power;

    public PharmancyComponent(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "PharmancyComponent{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public int compareTo(PharmancyComponent o) {
        if (this.power > o.power){
            return -1;
        } else if (this.power < o.power){
            return 1;
        }
        return 0;
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PharmancyComponent that = (PharmancyComponent) o;
        if (!name.equals(that.name)) return false;
        if (!weight.equals(that.weight)) return false;
        if (power != that.power) return false;
        return true;
    }

    public int hashCode(){
        int result = name.hashCode();
        result = 31 * result + weight.hashCode();
        result = 31 * result + power;
        return result;
    }

}