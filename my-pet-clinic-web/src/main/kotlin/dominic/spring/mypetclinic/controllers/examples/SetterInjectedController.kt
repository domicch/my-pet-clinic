package dominic.spring.mypetclinic.controllers.examples

import dominic.spring.mypetclinic.services.sample.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

@Controller
class SetterInjectedController {
    private lateinit var greetingService: GreetingService

    @Qualifier("greetingServiceImpl")
    @Autowired
    fun setGreetingService(greetingService: GreetingService){
        this.greetingService = greetingService
    }

    fun getGreeting(): String {
        return greetingService.sayGreeting()
    }
}