package dominic.spring.mypetclinic.services

import dominic.spring.mypetclinic.model.Vet

interface VetService {
    fun findById(id: Long): Vet
    fun save(vet: Vet)
    fun findAll(): Set<Vet>
}