package dominic.spring.mypetclinic.services.map

import dominic.spring.mypetclinic.model.Owner
import dominic.spring.mypetclinic.model.Pet
import dominic.spring.mypetclinic.model.Vet
import dominic.spring.mypetclinic.services.CrudService
import dominic.spring.mypetclinic.services.VetService
import org.springframework.stereotype.Service

@Service
class VetServiceMap: AbstractMapService<Vet, Long>(), VetService {

}