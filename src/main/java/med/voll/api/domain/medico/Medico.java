package med.voll.api.domain.medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.domain.consulta.Consulta;
import med.voll.api.domain.direccion.Direccion;

import java.util.Collection;

@Table (name = "medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {
    private String nombre;

    private String email;

    private String telefono;

    private String documento;

    private Boolean activo;

    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;

    @Embedded
    private Direccion direccion;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Medico(DatosRegistroMedico datosRegistroMedico) {
        this.activo = true;
        this.nombre = datosRegistroMedico.nombre();
        this.email = datosRegistroMedico.email();
        this.documento = datosRegistroMedico.documento();
        this.telefono = datosRegistroMedico.telefono();
        this.especialidad = datosRegistroMedico.especialidad();
        this.direccion = new Direccion(datosRegistroMedico.direccion());



    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void actualizarDatos(DatosActualizarMedico datosActualizarMedico) {
        if(datosActualizarMedico.nombre() != null){
            this.nombre = datosActualizarMedico.nombre();
        }
        if(datosActualizarMedico.documento() != null){
            this.documento = datosActualizarMedico.documento();
        }
        if(datosActualizarMedico.direccion() !=null){
            this.direccion = direccion.actualizarDatos(datosActualizarMedico.direccion());
        }
    }
    public void desactivarMedico() {
        this.activo = false;
    }

    @OneToMany(mappedBy = "medico")
    private Collection<Consulta> consultas;

    public Collection<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(Collection<Consulta> consultas) {
        this.consultas = consultas;
    }
}
