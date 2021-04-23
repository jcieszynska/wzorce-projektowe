package Adapter;
abstract class Sensor {
    public abstract  float GetTemperatura();
}
class FahrenheitSensor {
    float Temperatura = 99.4f;


    public float GetTemperatura() {
        return Temperatura;
    }
}

abstract class Adapter extends Sensor {
    FahrenheitSensor fs;

    public Adapter(FahrenheitSensor fs) {
        this.fs = fs;
    }

    public float GetTemperatura(){
        return (fs.GetTemperatura() - 32.0f) * 5.0f / 9.0f;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Sensor celsjusz = new Adapter(new FahrenheitSensor()) {
            @Override
            public float GetTemperatura() {
                return super.GetTemperatura();
            }
        };

        System.out.println("Fahrenheit Sensor pokazuje temperature w Celsjuszach: " + celsjusz.GetTemperatura());
    }
}
