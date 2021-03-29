package dominic.spring.mypetclinic.services.map

import dominic.spring.mypetclinic.model.Owner
import dominic.spring.mypetclinic.model.Pet
import dominic.spring.mypetclinic.model.PetType
import dominic.spring.mypetclinic.services.CrudService
import dominic.spring.mypetclinic.services.PetService
import dominic.spring.mypetclinic.services.PetTypeService
import org.springframework.stereotype.Service

@Service
class PetTypeServiceMap: AbstractMapService<PetType, Long>(), PetTypeService {

}