package prueba.clase.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import prueba.clase.models.Usuario;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/app")
public class IndexControler {

    @Value("${texto.indexcontroller.index.titulo}")
    private String textoIndex;
/*
    @Value("${texto.indexcontroller.perfil.titulo}")
    private String textoPerfil;

    @Value("${texto.indexcontroller.listar.titulo}")
    private String textoListar;*/


    @GetMapping({"/index", "/", "/index.html"})
    public String index(Model model) {
        return "index";
    }

    @GetMapping({"/listar", "/listar.html"})
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de usuarios");
        return "listar";
    }

    @GetMapping({"/profile", "/profile.html"})
    public String profile(Model model) {
        return "profile";
    }

    @ModelAttribute("encabezado")
    public String encabezado(Model model) {
        model.addAttribute("nombre", "Boris Quizhpe");
        model.addAttribute("titulo", textoIndex);
        System.out.println(textoIndex);
        model.addAttribute("cuerpo", "Esto es un titulo vacio");
        model.addAttribute("imagen", "https://www.smashbros.com/wiiu-3ds/sp/images/character/pikachu/main.png");
        return "encabezado";
    }

    @ModelAttribute("usuarioList")
    public List<Usuario> poblarUsuario() {
        List<Usuario> usuarioList = Arrays.asList(new Usuario(1, "Boris", "Quizhpe", "boris@gmail.com", null),
                new Usuario(2, "Genesis", "Peña", "genesis@gmail.com", null),
                new Usuario(3, "Thalia", "Barzallo", "thalia@gmail.com", null),
                new Usuario(4, "Juan", "Matute", "juanm@gmail.com", null),
                new Usuario(5, "Erick", "Gallegos", "erickg@gmail.com", null),
                new Usuario(6, "Juan", "Inga", "juani.com", null),
                new Usuario(7, "David", "Becerra", "davidb@gmail.com", null),
                new Usuario(8, "Mateo", "Vidal", "mateov@gmail.com", null),
                new Usuario(9, "Jose", "Murillo", "josem@gmail.com", null),
                new Usuario(10, "Maria", "Coral", "mariac@gmail.com", null)
        );
        return usuarioList;
    }

    /*
    @RequestMapping({"/listar", "/listar.html"})
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de usuarios");
        return "listar";
    }


    @GetMapping({"/listar","/listar.html"})
    public String listar(Model model) {

        List<Usuario> usuarioList = new ArrayList<>();

        usuarioList.add(new Usuario(1, "Boris", "Quizhpe", "boris@gmail.com", null));
        usuarioList.add(new Usuario(2, "Genesis", "Peña", "genesis@gmail.com", null));
        usuarioList.add(new Usuario(3, "Thalia", "Barzallo", "thalia@gmail.com", null));
        usuarioList.add(new Usuario(4, "Juan", "Matute", "juanm@gmail.com", null));
        usuarioList.add(new Usuario(5, "Erick", "Gallegos", "erickg@gmail.com", null));
        usuarioList.add(new Usuario(6, "Juan", "Inga", "juani.com", null));
        usuarioList.add(new Usuario(7, "David", "Becerra", "davidb@gmail.com", null));
        usuarioList.add(new Usuario(8, "Mateo", "Vidal", "mateov@gmail.com", null));
        usuarioList.add(new Usuario(9, "Jose", "Murillo", "josem@gmail.com", null));
        usuarioList.add(new Usuario(10, "Maria", "Coral", "mariac@gmail.com", null));

        model.addAttribute("usuarioList", usuarioList);
        index(model);
        //profile(model);
        return "listar";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuario() {

        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario(1, "Boris", "Quizhpe", "boris@gmail.com", null));
        usuarios.add(new Usuario(2, "Genesis", "Peña", "genesis@gmail.com", null));
        usuarios.add(new Usuario(3, "Thalia", "Barzallo", "thalia@gmail.com", null));
        usuarios.add(new Usuario(4, "Juan", "Matute", "juanm@gmail.com", null));
        usuarios.add(new Usuario(5, "Erick", "Gallegos", "erickg@gmail.com", null));
        usuarios.add(new Usuario(6, "Juan", "Inga", "juani.com", null));
        usuarios.add(new Usuario(7, "David", "Becerra", "davidb@gmail.com", null));
        usuarios.add(new Usuario(8, "Mateo", "Vidal", "mateov@gmail.com", null));
        usuarios.add(new Usuario(9, "Jose", "Murillo", "josem@gmail.com", null));
        usuarios.add(new Usuario(10, "Maria", "Coral", "mariac@gmail.com", null));

        return usuarios;
    }


    */

}
//RequestMapping(value = "/index", method = RequestMethod.GET)