package dominic.spring.mypetclinic.controllers.examples

import dominic.spring.mypetclinic.services.sample.GreetingService
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

@Controller
class I18nController(
    @Qualifier("i18nService")
    private val greetingService: GreetingService
) {
    fun sayGreeting(): String{
        return greetingService.sayGreeting()
    }
}