package med.voll.api.paciente;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @PostMapping
    public void registrar(DatosRegistroPaciente datosRegistroPaciente){
        System.out.println("Datos Recibidos= " + datosRegistroPaciente);
    }
}
