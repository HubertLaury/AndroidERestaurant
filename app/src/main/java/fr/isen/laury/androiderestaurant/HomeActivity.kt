package fr.isen.laury.androiderestaurant.category

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.isen.laury.androiderestaurant.category.ItemType
import fr.isen.laury.androiderestaurant.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.entree.setOnClickListener {
            statCategoryActivity(ItemType.ENTREE)
        }

        binding.plat.setOnClickListener {
            statCategoryActivity(ItemType.PLAT)
        }

        binding.dessert.setOnClickListener {
            statCategoryActivity(ItemType.DESSERT)
        }
    }
    private fun statCategoryActivity(item: ItemType) {
        val intent = Intent(this, CategoryActivity::class.java)
        intent.putExtra(CATEGORY_NAME, item)
        startActivity(intent)
    }

    companion object {
        const val CATEGORY_NAME = "CATEGORY_NAME"
    }
}