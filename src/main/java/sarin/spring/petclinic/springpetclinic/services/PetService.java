package sarin.spring.petclinic.springpetclinic.services;

import sarin.spring.petclinic.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
