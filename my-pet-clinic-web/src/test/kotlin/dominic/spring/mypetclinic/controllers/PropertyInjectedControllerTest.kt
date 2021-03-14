package dominic.spring.mypetclinic.controllers

import dominic.spring.mypetclinic.controllers.examples.PropertyInjectedController
import dominic.spring.mypetclinic.services.GreetingServiceImpl
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.BeforeEach

class PropertyInjectedControllerTest {

    lateinit var controller: PropertyInjectedController

    @BeforeEach
    fun setUp() {
        controller = PropertyInjectedController()
        controller.greetingService = GreetingServiceImpl()
    }

    @Test
    fun getGreeting() {
        println(controller.getGreeting())
    }
}