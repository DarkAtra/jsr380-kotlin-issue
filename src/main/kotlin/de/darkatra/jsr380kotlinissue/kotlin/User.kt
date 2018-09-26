package de.darkatra.jsr380kotlinissue.kotlin

import de.darkatra.jsr380kotlinissue.NoNullElements
import de.darkatra.jsr380kotlinissue.Role
import javax.validation.constraints.NotEmpty

data class User(
	@field:NotEmpty
	@field:NoNullElements
	var roles: MutableSet<Role> = HashSet()
)