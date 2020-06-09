package se.lexicon.mark.PetClinic.controller;

import jdk.internal.module.ModulePath;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se.lexicon.mark.PetClinic.Owner;

import java.util.List;
import java.util.Scanner;

@RestController
public class OwnerController {

    @GetMapping("/api/owners")
    public ResponseEntity<List<Owner>>find(){

        List<Owner>responseBody = ownerRepository.findAll();
        return ResponseEntity.ok(responseBody);
    }
}
