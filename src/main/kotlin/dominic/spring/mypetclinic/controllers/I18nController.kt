package dominic.spring.mypetclinic.controllers

import dominic.spring.mypetclinic.services.GreetingService
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