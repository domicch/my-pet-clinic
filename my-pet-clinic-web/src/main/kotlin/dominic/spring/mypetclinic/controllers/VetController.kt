package dominic.spring.mypetclinic.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class VetController {

    @RequestMapping("/vets")
    fun listVets(): String {
        return "vets/index"
    }
}