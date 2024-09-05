package persistence.entity;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Alert")
public class AlertEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "alert_message", nullable = false)
    private String alertMessage;

    @Column(name = "alert_time", nullable = false)
    private LocalDateTime alertTime;

    // Relación con Device: Muchas alertas pueden estar relacionadas con un solo dispositivo.
    @ManyToOne
    @JoinColumn(name = "device_id", nullable = false)
    private DeviceEntity device;

    public AlertEntity() {
    }
}
