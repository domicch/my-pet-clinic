package dominic.spring.mypetclinic

import dominic.spring.mypetclinic.controllers.*
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyPetClinicApplication

fun main(args: Array<String>) {
	val context = runApplication<MyPetClinicApplication>(*args)

	// example: get a controller directly from Spring Context

	println("======= i18nController")
	val i18nController = context.getBean("i18nController") as I18nController
	println(i18nController.sayGreeting())

	println("======= myController")
	val myController = context.getBean("myController") as MyController
	println(myController.sayHello())

	println("======= propertyInjectedController")
	val propertyInjectedController = context.getBean("propertyInjectedController") as PropertyInjectedController
	println(propertyInjectedController.getGreeting())

	println("======= setterInjectedController")
	val setterInjectedController = context.getBean("setterInjectedController") as SetterInjectedController
	println(setterInjectedController.getGreeting())

	println("======= constructorInjectedController")
	val constructorInjectedController = context.getBean("constructorInjectedController") as ConstructorInjectedController
	println(constructorInjectedController.getGreeting())
}
