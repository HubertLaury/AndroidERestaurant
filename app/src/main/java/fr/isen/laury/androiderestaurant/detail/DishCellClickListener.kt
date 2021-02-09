package fr.isen.laury.androiderestaurant.detail

import fr.isen.laury.androiderestaurant.network.Dish

interface DishCellClickListener {
    fun onCellClickListener(data: Dish)
}