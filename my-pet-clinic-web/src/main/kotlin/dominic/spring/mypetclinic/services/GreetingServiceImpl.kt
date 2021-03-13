package dominic.spring.mypetclinic.services

import org.springframework.stereotype.Service

@Service
class GreetingServiceImpl: GreetingService {
    override fun sayGreeting(): String {
        return "Hello World"
    }
}