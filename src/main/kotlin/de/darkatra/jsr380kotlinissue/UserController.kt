package de.darkatra.jsr380kotlinissue

import de.darkatra.jsr380kotlinissue.kotlin.User
import org.springframework.stereotype.Controller
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView
import javax.validation.Valid

@Controller
@RequestMapping("/users")
class UserController {

    @PostMapping
    fun createUserKotlin(@Valid user: User, bindingResult: BindingResult): ModelAndView {
        return ModelAndView("someview", "user", user)
    }
}
