package dominic.spring.mypetclinic.controllers.examples

import dominic.spring.mypetclinic.services.GreetingService
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

@Controller
class ConstructorInjectedController(

    /* Qualifier is needed because we have 2 implementations of GreetingService interface
     * and Spring doesn't know which one to be used during injection
     */
    @Qualifier("greetingServiceConstructorImpl")
    private val greetingService: GreetingService
) {
    fun getGreeting(): String{
        return greetingService.sayGreeting()
    }
}