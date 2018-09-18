package de.darkatra.jsr380kotlinissue

import org.springframework.core.convert.converter.Converter
import org.springframework.stereotype.Component

@Component
class RoleConverter : Converter<String, Role> {
	override fun convert(name: String): Role? {
		return Enum.ofName<Role>(name)
	}
}