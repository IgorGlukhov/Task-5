package hiber.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalIdCache;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@Data
@NoArgsConstructor
public class Car {
    @Column
    private String model;
    @Column
    private int series;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(mappedBy = "car")
    private User user;
    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }
    @Override
    public String toString() {
        return model + " " + series + " " + id;
    }
}
