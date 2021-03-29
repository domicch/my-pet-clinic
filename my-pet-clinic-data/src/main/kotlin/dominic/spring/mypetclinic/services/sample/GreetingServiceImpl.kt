package dominic.spring.mypetclinic.services.sample

import dominic.spring.mypetclinic.services.sample.GreetingService
import org.springframework.stereotype.Service

@Service
class GreetingServiceImpl: GreetingService {
    override fun sayGreeting(): String {
        return "Hello World"
    }
}