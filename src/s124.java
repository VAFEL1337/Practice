import java.lang.invoke.VarHandle;
import java.util.EnumMap;

public class s124 {
    public  void s124() {
        Bird VALERA = new Bird();
        VALERA.sitting();
        VALERA.fly();
        VALERA.attack();
        VALERA.eating();
    }
}
class Bird{
    Wings wings = new Wings();
    beak beak = new beak();
    public void eating(){
        beak.eating();
    }
    public void attack(){
        beak.attack();
    }
    public void fly(){
        wings.fly();
    }
    public void sitting(){
        wings.sitting();
    }
    class Wings {
        public void fly(){
            System.out.println("Птица Летает");
        }
        public void sitting(){
            System.out.println("Птица садится");
        }
    }
    class beak{
        public void eating(){
            System.out.println("Птица ест");
        }
        public void attack(){
            System.out.println("Птица атакует");
        }
    }
}

