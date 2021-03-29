package dominic.spring.mypetclinic.bootstrap

import dominic.spring.mypetclinic.model.*
import dominic.spring.mypetclinic.services.*
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
class DataLoader(
    private val ownerService: OwnerService,
    private val vetService: VetService,
    private val petTypeService: PetTypeService,
    private val specialtyService: SpecialtyService,
    private val visitService: VisitService,
): CommandLineRunner {

    override fun run(vararg args: String?) {

        loadData()

//        val owner1 = Owner()
////        owner1.id = 1L
//        owner1.firstName = "Dominic"
//        owner1.lastName = "Chan"
//        ownerService.save(owner1)
//
//        val owner2 = Owner()
////        owner2.id = 2L
//        owner2.firstName = "John"
//        owner2.lastName = "Doe"
//        ownerService.save(owner2)
//
//        val vet1 = Vet()
////        vet1.id = 1L
//        vet1.firstName = "Charlie"
//        vet1.lastName = "Brown"
//        vetService.save(vet1)
//
//        val vet2 = Vet()
////        vet2.id = 2L
//        vet2.firstName = "Mary"
//        vet2.lastName = "Jane"
//        vetService.save(vet2)
//
//        println("Map database loaded!!")
//
//        println("All owners:")
//        ownerService.findAll().forEach{println("${it.id} ${it.firstName} ${it.lastName}")}
//
//        println("All vets:")
//        vetService.findAll().forEach{println("${it.id} ${it.firstName} ${it.lastName}")}
    }

    private fun loadData() {
        val dog = PetType()
        dog.name = "Dog"
        val savedDogPetType: PetType = petTypeService.save(dog)
        val cat = PetType()
        cat.name = "Cat"
        val savedCatPetType: PetType = petTypeService.save(cat)
        val radiology = Specialty()
        radiology.description = "Radiology"
        val savedRadiology: Specialty = specialtyService.save(radiology)
        val surgery = Specialty()
        surgery.description = "Surgery"
        val savedSurgery: Specialty = specialtyService.save(surgery)
        val dentistry = Specialty()
        dentistry.description = "dentistry"
        val savedDentistry: Specialty = specialtyService.save(dentistry)
        val owner1 = Owner()
        owner1.firstName = "Michael"
        owner1.lastName = "Weston"
        owner1.address = "123 Brickerel"
        owner1.city = "Miami"
        owner1.telephone = "1231231234"
        val mikesPet = Pet()
        mikesPet.type = savedDogPetType
        mikesPet.owner = owner1
        mikesPet.birthDate = LocalDate.now()
        mikesPet.name = "Rosco"
        owner1.pets.add(mikesPet)
        ownerService.save(owner1)
        val owner2 = Owner()
        owner2.firstName = "Fiona"
        owner2.lastName = "Glenanne"
        owner2.address = "123 Brickerel"
        owner2.city = "Miami"
        owner2.telephone = "1231231234"
        val fionasCat = Pet()
        fionasCat.name = "Just Cat"
        fionasCat.owner = owner2
        fionasCat.birthDate = LocalDate.now()
        fionasCat.type = savedCatPetType
        owner2.pets.add(fionasCat)
        ownerService.save(owner2)
        val catVisit = Visit()
        catVisit.pet = fionasCat
        catVisit.date = LocalDate.now()
        catVisit.description = "Sneezy Kitty"
        visitService.save(catVisit)
        println("Loaded Owners....")
        val vet1 = Vet()
        vet1.firstName = "Sam"
        vet1.lastName = "Axe"
        vet1.specialties.add(savedRadiology)
        vetService.save(vet1)
        val vet2 = Vet()
        vet2.firstName = "Jessie"
        vet2.lastName = "Porter"
        vet2.specialties.add(savedSurgery)
        vetService.save(vet2)
        println("Loaded Vets....")
    }
}