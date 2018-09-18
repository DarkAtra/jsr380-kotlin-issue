package de.darkatra.jsr380kotlinissue

import org.springframework.stereotype.Controller
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
@RequestMapping("/users")
class UserController {
	@PostMapping("java")
	fun createUserJava(@Validated user: de.darkatra.jsr380kotlinissue.java.User, bindingResult: BindingResult): ModelAndView {
		return ModelAndView("someview", "user", user)
	}

	@PostMapping("kotlin")
	fun createUserKotlin(@Validated user: de.darkatra.jsr380kotlinissue.kotlin.User, bindingResult: BindingResult): ModelAndView {
		return ModelAndView("someview", "user", user)
	}
}
