package dominic.spring.mypetclinic.services.sample

import dominic.spring.mypetclinic.services.sample.GreetingService
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Profile("ES")
@Service("i18nService")
class I18nSpanishGreetingService: GreetingService {
    override fun sayGreeting(): String {
        return "Hola"
    }
}