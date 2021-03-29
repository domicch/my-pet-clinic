package dominic.spring.mypetclinic.services.sample

import dominic.spring.mypetclinic.services.sample.GreetingService
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

/* When multiple implementations of the same service interface exist, @Primary tells Spring which
 * one to be used by default
 */
@Primary
@Service
class PrimaryGreetingService: GreetingService {
    override fun sayGreeting(): String {
        return "Hello World - from primary bean"
    }

}