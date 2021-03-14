package dominic.spring.mypetclinic.services.map

import dominic.spring.mypetclinic.model.Owner
import dominic.spring.mypetclinic.model.Pet
import dominic.spring.mypetclinic.model.Vet
import dominic.spring.mypetclinic.services.CrudService

class VetServiceMap: AbstractMapService<Vet, Long>(), CrudService<Vet, Long> {
    override fun save(obj: Vet): Vet {
        return super.save(obj.id!!, obj)
    }

}