package dominic.spring.mypetclinic.services.map

import dominic.spring.mypetclinic.model.Owner
import dominic.spring.mypetclinic.services.OwnerService
import org.springframework.stereotype.Service

@Service
class OwnerServiceMap: AbstractMapService<Owner, Long>(), OwnerService {
    override fun findByLastName(lastName: String): Owner {
        TODO("Not yet implemented")
    }

}