package fr.isen.laury.androiderestaurant.register

import java.io.Serializable

class RegisterResult(val data: User) {}

class User(val id: Int) : Serializable {}