package dominic.spring.mypetclinic.services.map

import dominic.spring.mypetclinic.model.Owner
import dominic.spring.mypetclinic.model.Pet
import dominic.spring.mypetclinic.model.Vet
import dominic.spring.mypetclinic.model.Visit
import dominic.spring.mypetclinic.services.CrudService
import dominic.spring.mypetclinic.services.VetService
import dominic.spring.mypetclinic.services.VisitService
import org.springframework.stereotype.Service

@Service
class VisitServiceMap: AbstractMapService<Visit, Long>(), VisitService {

}