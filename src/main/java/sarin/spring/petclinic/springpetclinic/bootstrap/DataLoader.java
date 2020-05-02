package sarin.spring.petclinic.springpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sarin.spring.petclinic.springpetclinic.model.Owner;
import sarin.spring.petclinic.springpetclinic.model.Vet;
import sarin.spring.petclinic.springpetclinic.services.OwnerService;
import sarin.spring.petclinic.springpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("John");
        owner1.setLastName("Wick");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Becca");
        owner2.setLastName("Wilthrop");

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Jimmy");
        vet1.setLastName("McDillon");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Rachel");
        vet2.setLastName("Dickens");

        vetService.save(vet2);

        vetService.findAll().forEach(vet -> System.out.println(vet.getLastName()));
    }
}
