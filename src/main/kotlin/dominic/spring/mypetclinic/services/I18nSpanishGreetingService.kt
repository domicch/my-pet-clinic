package dominic.spring.mypetclinic.services

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Profile("ES")
@Service("i18nService")
class I18nSpanishGreetingService: GreetingService {
    override fun sayGreeting(): String {
        return "Hola"
    }
}