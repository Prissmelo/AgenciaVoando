package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class ClienteControle {



@Autowired
private ClienteRepository clienteRepository;

// get all employees
@GetMapping("/clientes")
  public List<Cliente> getAllEmployees(){
     return clienteRepository.findAll();
}

// create employee rest api
@PostMapping("/clientes")
  public Cliente createEmployee(@RequestBody Cliente cliente) {
     return clienteRepository.save(cliente);
}

// get employee by id rest api
@GetMapping("/clientes/{id}")
   public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) {
    
	Cliente cliente = clienteRepository.findById(id)
    .orElseThrow(() -> new ResourceNotFoundException("Cliente não existe sem id :" + id));
    return ResponseEntity.ok(cliente);
}

// update employee rest api

@PutMapping("/clientes/{id}")
  public ResponseEntity<Cliente> updateCliente(@PathVariable Long id, @RequestBody Cliente clienteDetails){
     Cliente cliente = clienteRepository.findById(id)
     .orElseThrow(() -> new ResourceNotFoundException("Cliente não existe sem id :" + id));

     
     cliente.setNome(clienteDetails.getNome());
     cliente.setCpf(clienteDetails.getCpf());
     cliente.setEndereco(clienteDetails.getEndereco());
     cliente.setNumero(clienteDetails.getNumero());
     cliente.setComplemento(clienteDetails.getComplemento());
     cliente.setCidade(clienteDetails.getCidade());
     cliente.setEstado(clienteDetails.getEstado());
     cliente.setTelefone(clienteDetails.getTelefone());
     cliente.setEmail(clienteDetails.getEmail());
     
 

    Cliente updatedCliente = clienteRepository.save(cliente);
     return ResponseEntity.ok(updatedCliente);
}

// delete employee rest api
@DeleteMapping("/clientes/{id}")
   public ResponseEntity<Map<String, Boolean>> deleteCliente(@PathVariable Long id){
  Cliente cliente = clienteRepository.findById(id)
   .orElseThrow(() -> new ResourceNotFoundException("Cliente não existe sem id :" + id));

    clienteRepository.delete(cliente);
    Map<String, Boolean> response = new HashMap<>();
    response.put("deleted", Boolean.TRUE);
    return ResponseEntity.ok(response);
   }
}
