package med.voll.api.domain.consulta;

        import jakarta.persistence.*;
        import lombok.AllArgsConstructor;
        import lombok.EqualsAndHashCode;
        import lombok.Getter;
        import lombok.NoArgsConstructor;
        import med.voll.api.domain.medico.Medico;

        import java.time.LocalDateTime;

@Table (schema = "consultas")
@Entity (name = "Consulta")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (of = "id")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medico_id")
    private Medico medico;

    //private Paciente paciente; -> se necesita crear la funcionalidad paciente

    private LocalDateTime date;


}
