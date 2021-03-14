package dominic.spring.mypetclinic.controllers

import dominic.spring.mypetclinic.controllers.examples.ConstructorInjectedController
import dominic.spring.mypetclinic.services.GreetingServiceImpl
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.BeforeEach

internal class ConstructorInjectedControllerTest {

    lateinit var controller: ConstructorInjectedController

    @BeforeEach
    internal fun setUp() {
        controller = ConstructorInjectedController(GreetingServiceImpl())
    }

    @Test
    fun getGreeting() {
        println(controller.getGreeting())
    }
}