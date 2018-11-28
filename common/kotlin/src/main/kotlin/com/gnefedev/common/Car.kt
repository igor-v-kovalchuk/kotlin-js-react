package com.gnefedev.common

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.internal.ArrayListSerializer

val carSerial = Car.serializer()
val carListSerial: KSerializer<List<Car>> = ArrayListSerializer(carSerial)


@Serializable
data class Car(
    val brand: String,
    val color: String,
    val year: Int
)
