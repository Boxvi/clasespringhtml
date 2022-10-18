package prueba.clase.models;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Usuario {

    private Integer id;
    private String nombre;
    private String apellido;
    private String email;
    private String urlImagen;

    public Usuario() {
    }
}
