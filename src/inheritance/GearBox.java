package inheritance;

import java.util.List;

public class GearBox {
    private List<Gear> gears;


    public class Gear{
        private String name;
        public Gear(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "Gear{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
