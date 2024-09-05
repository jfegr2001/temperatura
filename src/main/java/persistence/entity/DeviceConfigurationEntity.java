package persistence.entity;
import jakarta.persistence.*;

// configuracion  de dispositivo
@Entity
@Table(name = "DeviceConfiguration")
public class DeviceConfigurationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "min_temperature", nullable = false)
    private Double minTemperature;

    @Column(name = "max_temperature", nullable = false)
    private Double maxTemperature;

    @Column(name = "configuration_name", nullable = false)
    private String configurationName;

    // Relación con Device: Una configuración específica pertenece a un dispositivo.
    @OneToOne
    @JoinColumn(name = "device_id", nullable = false)
    private DeviceEntity device;

    public DeviceConfigurationEntity() {
    }
}
