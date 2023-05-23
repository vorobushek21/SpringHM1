import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean(name = "car")
    public Car getCarBean() {
        return new Car("Opel");
    }

    @Bean(name = "bus")
    public Bus getBusBean() {
        return new Bus("UAZ");
    }

    @Bean(name = "pickup")
    public Pickup getPickupBean() {
        return new Pickup("RAM");
    }

    @Bean(name = "carDriver")
    public Driver getDriver1() {
        return new Driver("Tom", getCarBean());
    }

    @Bean(name = "busDriver")
    public Driver getDriver2() {
        return new Driver("Jayson", getBusBean());
    }

    @Bean(name = "pickupDriver")
    public Driver getDriver3() {
        return new Driver("Antonio", getPickupBean());
    }
}
