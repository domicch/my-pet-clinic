package dominic.spring.mypetclinic.services

import org.springframework.stereotype.Service

@Service
class GreetingServiceConstructorImpl: GreetingService {
    override fun sayGreeting(): String {
        return "Hello World - constructor"
    }
}