package de.darkatra.jsr380kotlinissue.kotlin

import de.darkatra.jsr380kotlinissue.Role
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class User(
	@field:NotEmpty
	var roles: MutableSet<@NotNull Role> = HashSet()
)