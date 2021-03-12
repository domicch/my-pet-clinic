package dominic.spring.mypetclinic.controllers

import dominic.spring.mypetclinic.services.GreetingServiceImpl
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class SetterInjectedControllerTest {

    lateinit var controller: SetterInjectedController

    @BeforeEach
    internal fun setUp() {
        controller = SetterInjectedController()
        controller.setGreetingService(GreetingServiceImpl())
    }

    @Test
    fun setGreetingService() {
        println(controller.getGreeting())
    }
}