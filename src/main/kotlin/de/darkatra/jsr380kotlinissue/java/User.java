package de.darkatra.jsr380kotlinissue.java;

import de.darkatra.jsr380kotlinissue.Role;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Data
public class User {
	@NotEmpty
	private Set<@NotNull Role> roles = new HashSet<>();
}
