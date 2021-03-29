package dominic.spring.mypetclinic.model

import java.time.LocalDate
import java.util.*

class Visit: Person() {
    var date: LocalDate = LocalDate.now()
    var description: String? = null
    var pet: Pet? = null
}