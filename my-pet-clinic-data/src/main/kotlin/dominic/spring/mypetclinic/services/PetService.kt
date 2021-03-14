package dominic.spring.mypetclinic.services

import dominic.spring.mypetclinic.model.Pet

interface PetService {
    fun findById(id: Long): Pet
    fun save(pet: Pet)
    fun findAll(): Set<Pet>
}