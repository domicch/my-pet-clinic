package dominic.spring.mypetclinic.services

import dominic.spring.mypetclinic.model.Owner

interface OwnerService: CrudService<Owner, Long> {
    fun findByLastName(lastName: String): Owner
}