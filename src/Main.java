public class Main {
    public static void main(String[] args) {
        Computer comp = new Mac(16,32);
        comp.GenericMethod("Burak");
        comp.<Integer>GenericMethod(1);
        comp.<Integer>GenericMethod2();

        GearBox.Gear gear = new GearBox().new Gear("Screw");
        System.out.println(gear);

        AnonymousClassSample(new Object() {
            @Override
            public String toString() {
                return "Anonymous Tostring";
            }
        });

        System.out.println(comp.GetRam());
    }

    public static void AnonymousClassSample(Object person){
        System.out.println(person.toString());
    }
}

