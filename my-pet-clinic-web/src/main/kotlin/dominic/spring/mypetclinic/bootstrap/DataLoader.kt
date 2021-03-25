package dominic.spring.mypetclinic.bootstrap

import dominic.spring.mypetclinic.model.Owner
import dominic.spring.mypetclinic.model.Vet
import dominic.spring.mypetclinic.services.OwnerService
import dominic.spring.mypetclinic.services.VetService
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DataLoader(
    private val ownerService: OwnerService,
    private val vetService: VetService
): CommandLineRunner {

    override fun run(vararg args: String?) {
        val owner1 = Owner()
//        owner1.id = 1L
        owner1.firstName = "Dominic"
        owner1.lastName = "Chan"
        ownerService.save(owner1)

        val owner2 = Owner()
//        owner2.id = 2L
        owner2.firstName = "John"
        owner2.lastName = "Doe"
        ownerService.save(owner2)

        val vet1 = Vet()
//        vet1.id = 1L
        vet1.firstName = "Charlie"
        vet1.lastName = "Brown"
        vetService.save(vet1)

        val vet2 = Vet()
//        vet2.id = 2L
        vet2.firstName = "Mary"
        vet2.lastName = "Jane"
        vetService.save(vet2)

        println("Map database loaded!!")

        println("All owners:")
        ownerService.findAll().forEach{println("${it.id} ${it.firstName} ${it.lastName}")}

        println("All vets:")
        vetService.findAll().forEach{println("${it.id} ${it.firstName} ${it.lastName}")}
    }
}