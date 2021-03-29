package dominic.spring.mypetclinic.model

class Vet: Person() {
    var specialties: MutableSet<Specialty> = mutableSetOf()
}