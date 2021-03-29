package dominic.spring.mypetclinic.model

import java.time.LocalDate
import java.util.*

class Pet: BaseEntity() {
    var name: String? = null
    var type: PetType? = null
    var owner: Owner? = null
    var birthDate: LocalDate? = null
}