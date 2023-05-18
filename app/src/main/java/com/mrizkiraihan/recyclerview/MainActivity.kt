package com.mrizkiraihan.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superherolist = listOf<Superhero>(
            Superhero(
                R.drawable.isshin2,
                "Isshin The Glock Saint",
                "The Old Man Who Bring Gun To A Sword Fight"
            ),
            Superhero(
                R.drawable.hoarah,
                "Hoarah Loux",
                "Feudal Age WWE Athlete"
            ),
            Superhero(
                R.drawable.abysswatcher,
                "Farron The Abyss Watcher",
                "The Most Confusing Fighting Club In Dark Souls 3"
            ),
            Superhero(
                R.drawable.godric2,
                "Godric The Grafted",
                "Za Hando Ga Kesu!!!"
            ),
            Superhero(
                R.drawable.soulcinder,
                "Soul Of Cinder",
                "Everything In 1 Person, The End Of The Cyles"
            ),
            Superhero(
                R.drawable.miquella,
                "Malenia The Severed",
                "Cursed Blind Women Who Beat The Strongest General With Sword,Flower, and Butterfly"
            ),
            Superhero(
                R.drawable.radagon,
                "Radagon Of The Golden Order",
                "Have You Fell Get Bonk By Rusty Stone Hammer?"
            ),
            Superhero(
                R.drawable.maria,
                "Lady Maria Of The Astral Clocktower",
                "A Corpse...Should Be Left Well Alone. Oh, I know very well. How the secrets beckon so sweetly. Only Honest Death will cure you now. Liberate You, from your wild curiosity."
            ),
            Superhero(
                R.drawable.starcourge,
                "Starcourge Radahn",
                "When This Guy Is missing, You should Look at The Sky. This Big General Like Unicorn By The Way."
            ),
            Superhero(
                R.drawable.namelessking,
                "Nameless King",
                "Just 1 Word, The 'Delay'"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superherolist){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}