package dominic.spring.mypetclinic.services.map

import dominic.spring.mypetclinic.model.Owner
import dominic.spring.mypetclinic.services.CrudService

class OwnerServiceMap: AbstractMapService<Owner, Long>(), CrudService<Owner, Long> {
    override fun save(obj: Owner): Owner {
        return super.save(obj.id!!, obj)
    }

}