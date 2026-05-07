package com.example.apipet.petcontroller;

import com.example.apipet.petmodel.PetModel;
import com.example.apipet.petrepository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")

public class PetController {
    @Autowired
    private PetRepository petRepository;

    @GetMapping
    public List <PetModel> listarPets (){
        return petRepository.findAll();
    }
    @PostMapping
    public ResponseEntity<PetModel> salvar (@RequestBody PetModel pet){
        petRepository.save(pet);
        return ResponseEntity.status(HttpStatus.CREATED).body(pet);
    }
}
