package dominic.spring.mypetclinic.controllers.examples

import dominic.spring.mypetclinic.services.GreetingService
import org.springframework.stereotype.Controller

@Controller
class MyController (
    private val greetingService: GreetingService
        ) {
    fun sayHello(): String {
        return greetingService.sayGreeting()
    }
}