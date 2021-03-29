package dominic.spring.mypetclinic.model

import java.util.HashSet

class Owner: Person() {
    var address: String = ""
    var city: String = ""
    var telephone: String = ""
    var pets: MutableSet<Pet> = mutableSetOf()
}