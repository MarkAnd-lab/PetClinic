package se.lexicon.mark.PetClinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se.lexicon.mark.PetClinic.Owner;
import se.lexicon.mark.PetClinic.OwnerRepository;

import java.util.List;


@RestController
public class OwnerController {


    private final OwnerRepository ownerRepository;

    @Autowired
    public OwnerController(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;

    }

    @GetMapping("/api/owners")
    public ResponseEntity<List<Owner>> find(){
        List<Owner> responseBody = (List<Owner>) ownerRepository.findAll();
        return ResponseEntity.ok(responseBody);
    }

    @GetMapping("/hello")
    public String greeting(){
        return "Hello World Wide Web 2";
    }
}

