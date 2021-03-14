package dominic.spring.mypetclinic.services.map

import dominic.spring.mypetclinic.model.Owner
import dominic.spring.mypetclinic.model.Pet
import dominic.spring.mypetclinic.services.CrudService

class PetServiceMap: AbstractMapService<Pet, Long>(), CrudService<Pet, Long> {
    override fun save(obj: Pet): Pet {
        return super.save(obj.id!!, obj)
    }

}