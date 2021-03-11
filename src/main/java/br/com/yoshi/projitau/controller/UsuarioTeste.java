// package br.com.yoshi.projitau.controller;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;



// @RestController
// @CrossOrigin("*") // requisições de qualquer origem
// @RequestMapping("/user")
// public class UsuarioController {

//     @Autowired
//     private UsuarioRepo usuarioRepo;

//     @GetMapping("/id/{id}")
//     public ResponseEntity<UsuarioDTO> obterUsuarioPorId(@PathVariable int id) {
//         Usuario userFound = usuarioRepo.findById(id).orElse(null); // findById busca pela PK

//         if (userFound != null) {
//             UsuarioDTO usuarioDTO = new UsuarioDTO(userFound);
//             return ResponseEntity.ok(usuarioDTO); // OK = 200
//         }

//         return ResponseEntity.notFound().build(); // NOT FOUND = 404
//     }

//     @GetMapping("/compras/{id}")
//     public ResponseEntity<UsuarioComprasDTO> obterComprasDoUsuario(@PathVariable int id) {
//         Usuario userFound = usuarioRepo.findById(id).orElse(null); // findById busca pela PK

//         if (userFound != null) {
//             UsuarioComprasDTO usuarioComprasDTO = new UsuarioComprasDTO(userFound);
//             return ResponseEntity.ok(usuarioComprasDTO); // OK = 200
//         }

//         return ResponseEntity.notFound().build(); // NOT FOUND = 404
//     }

//     @GetMapping("/all")
//     public ResponseEntity<List<Usuario>> listarUsuario() {
//         List<Usuario> listaUsuario = (List<Usuario>) usuarioRepo.findAll(); // findById busca pela PK
//         return ResponseEntity.ok(listaUsuario); // OK = 200
//     }

//     @PostMapping("/loginemail")
//     public ResponseEntity<Usuario> loginByEmail(@RequestBody Usuario user) {
//         Usuario userFound = usuarioRepo.findByEmailAndSenha(user.getEmail(), user.getSenha());

//         if (userFound != null) {
//             userFound.setSenha("*****************");
//             return ResponseEntity.ok(userFound); // OK = 200
//         }

//         return ResponseEntity.status(404).build(); // NOT FOUND = 404

//     }

//     @PostMapping("/login")
//     public ResponseEntity<UsuarioDTO> login(@RequestBody Usuario user) {
//         Usuario userFound = usuarioRepo.findByEmailAndSenha(user.getEmail(), user.getCpf());

//         if (userFound != null) {
//             if (user.getSenha().equals(userFound.getSenha())) {
//                 UsuarioDTO usuarioDTO = new UsuarioDTO(userFound);
//                 return ResponseEntity.ok(usuarioDTO); // OK = 200
//             }
//         }

//         return ResponseEntity.status(404).build(); // NOT FOUND = 404

//     }
// }
