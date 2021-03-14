package dominic.spring.mypetclinic.controllers.examples

import dominic.spring.mypetclinic.services.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

/**
 * Bad practice, don't use it because internal service has to be public and mutable in order for JUnit test to be
 * possible
 */
@Controller
class PropertyInjectedController {
    @Qualifier("greetingServiceImpl")
    @Autowired
    lateinit var greetingService: GreetingService

    fun getGreeting(): String {
        return greetingService.sayGreeting()
    }
}