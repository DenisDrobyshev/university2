import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Car {
    int speed;
    int maxSpeed;

    public Car(int speed, int maxSpeed) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        System.out.println("Объект готов");
    }
    void start() {
        System.out.println("Я начал ехать " + "в направлении М1" + " со скоростью " + speed);
    }

    void stop() {
        System.out.println("Я остановился");
    }

    void setSpeed(int speed) {
        if (speed < maxSpeed) {
            this.speed = speed;
        }
        else {
            System.out.println("Вы передали слишком большую скорость");
        }
    }
    public static void main(String[] args) {
        var myCar = new Car(100, 500);
        var myCar2 = new Car(10, 50);
        //var garage = new ArrayList<Car>();
        var garage = new HashMap<String, Car>();

        garage.put("Мой авто", myCar);
        garage.put("Мой второй авто", myCar2);
        try {
            garage.get("Мой второй авто").start();
        }catch (NullPointerException exception){
            System.out.println("В словаре нет авто с таким ключом");
        }
        // garage.add(myCar);
        // garage.add(myCar2);

        //for (Car car : garage) {
            //car.start();
        //}
    }
}