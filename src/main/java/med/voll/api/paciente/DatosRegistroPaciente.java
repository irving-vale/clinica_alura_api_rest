package med.voll.api.paciente;
import med.voll.api.direccion.DatosDireccion;
import med.voll.api.medico.Especialidad;

public record DatosRegistroPaciente (String nombre, String email, String documento, Especialidad especialidad, DatosDireccion direccion){

}
