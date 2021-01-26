package fr.isen.laury.androiderestaurant

import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import fr.isen.laury.androiderestaurant.databinding.DishCellBinding

class CategoryAdapter(private val entrees: List<String>): RecyclerView.Adapter<CategoryAdapter.DishViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
        return DishViewHolder(DishCellBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        }

        override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
        holder.titleView.text = entrees[position]
        }

        override fun getItemCount(): Int {
        return entrees.count()
        }

class DishViewHolder(dishBinding: DishCellBinding): RecyclerView.ViewHolder(dishBinding.root) {
        val titleView: TextView = dishBinding.dishTitle
        }
        }