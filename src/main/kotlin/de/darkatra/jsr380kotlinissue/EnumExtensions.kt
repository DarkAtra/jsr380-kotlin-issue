package de.darkatra.jsr380kotlinissue

import java.util.Arrays.stream

inline fun <reified T : kotlin.Enum<T>> Enum.Companion.ofName(name: String): T? = stream(enumValues<T>())
	.filter { it.name == name }
	.findFirst()
	.orElse(null)