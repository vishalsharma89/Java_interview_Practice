

public final class MutableClass {
    private final String name;

    public MutableClass(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        MutableClass m1 = new MutableClass("Vishal Sharma");
        System.out.println("Employee name is "+m1.getName());
    }
}
