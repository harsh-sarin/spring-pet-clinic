package sarin.spring.petclinic.springpetclinic.services;

import sarin.spring.petclinic.springpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
