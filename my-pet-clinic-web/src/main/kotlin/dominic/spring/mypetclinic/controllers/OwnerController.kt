package dominic.spring.mypetclinic.controllers

import dominic.spring.mypetclinic.services.OwnerService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/owners")
class OwnerController(
    private val ownerService: OwnerService
) {

    @RequestMapping("")
    fun listOwners(model: Model): String {
        model.addAttribute("owners", ownerService.findAll())
        return "owners/index"
    }
}