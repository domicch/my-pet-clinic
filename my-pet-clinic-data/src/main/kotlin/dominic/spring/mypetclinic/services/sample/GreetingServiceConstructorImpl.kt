package dominic.spring.mypetclinic.services.sample

import dominic.spring.mypetclinic.services.sample.GreetingService
import org.springframework.stereotype.Service

@Service
class GreetingServiceConstructorImpl: GreetingService {
    override fun sayGreeting(): String {
        return "Hello World - constructor"
    }
}