package dominic.spring.mypetclinic.services

import dominic.spring.mypetclinic.model.Owner

interface OwnerService {
    fun findById(id: Long): Owner
    fun findByLastName(lastName: String): Owner
    fun save(owner: Owner)
    fun findAll(): Set<Owner>
}