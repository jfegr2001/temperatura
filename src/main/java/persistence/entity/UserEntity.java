package persistence.entity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "User")
public class UserEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    // Relación con Device: Un usuario puede gestionar múltiples dispositivos.
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DeviceEntity> devices;

    public UserEntity() {
    }


}
