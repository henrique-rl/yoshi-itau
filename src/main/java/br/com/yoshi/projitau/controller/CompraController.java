// package br.arms.spring02.controller;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import br.arms.spring02.model.Compra;
// import br.arms.spring02.repository.CompraRepo;

// @RestController
// @CrossOrigin("*")
// @RequestMapping("/compra")
// public class CompraController {
    
//     @Autowired
//     private CompraRepo repo;


//     @RequestMapping("/id/{id}")
//     public ResponseEntity<Compra> getCompraById(@PathVariable int id){
//         Compra compra = repo.findById(id).orElse(null);

//         if(compra != null)
//             return ResponseEntity.ok(compra);

//         return ResponseEntity.notFound().build();
//     }

//     @RequestMapping("/all")
//     public ResponseEntity<List<Compra>> getCompraById(){
//         List<Compra> compras = (List<Compra>) repo.findAll();
//         return ResponseEntity.ok(compras); //OK = 200
//     }

//     //https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
//     @RequestMapping("/all/min/{valor}")
//     public ResponseEntity<List<Compra>> getAllComprasByValue(@PathVariable double valor){
//         List<Compra> compras = (List<Compra>) repo.findByValorGreaterThanEqual(valor);
//         return ResponseEntity.ok(compras); //OK = 200
//     }

// }
