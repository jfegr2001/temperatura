package persistence.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Temperature")
public class TemperatureEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "temperature", nullable = false)
    private Double temperature;

    @Column(name = "reading_time", nullable = false)
    private LocalDateTime readingTime;

    // Relación con Device: Muchas lecturas de temperatura pueden estar asociadas a un dispositivo.
    @ManyToOne
    @JoinColumn(name = "device_id", nullable = false)
    private DeviceEntity device;

    public TemperatureEntity() {
    }
}
