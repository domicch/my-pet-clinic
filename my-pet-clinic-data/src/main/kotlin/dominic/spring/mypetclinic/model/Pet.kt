package dominic.spring.mypetclinic.model

import java.util.*

class Pet: BaseEntity() {
    var type: PetType? = null
    var owner: Owner? = null
    var birthDate: Date? = null
}