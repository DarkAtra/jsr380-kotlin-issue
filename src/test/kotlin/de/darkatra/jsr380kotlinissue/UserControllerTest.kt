package de.darkatra.jsr380kotlinissue

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.model

@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {

	@Autowired
	lateinit var mockMvc: MockMvc

	@Test
	internal fun shouldNotCreateNewUserWithInvalidParamsKotlin() {

		mockMvc.perform(post("/users")
			.param("roles", "not a role"))
			.andExpect(model().attributeHasFieldErrors("user", "roles[]"))
	}
}
