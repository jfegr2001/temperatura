package persistence.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Device")

// dispositivo

public class DeviceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "location", nullable = false)
    private String location;

    // Relación con TemperatureReading
    @OneToMany(mappedBy = "device", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<TemperatureEntity> temperatureReadings;

    // Relación con User: Un dispositivo pertenece a un usuario.
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    // Relación con Alert: Un dispositivo puede tener muchas alertas.
    @OneToMany(mappedBy = "device", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AlertEntity> alerts;

    // Relación con DeviceConfiguration: Un dispositivo tiene una configuración.
    @OneToOne(mappedBy = "device", cascade = CascadeType.ALL, orphanRemoval = true)
    private DeviceConfigurationEntity deviceConfiguration;


    public DeviceEntity() {
    }
}
