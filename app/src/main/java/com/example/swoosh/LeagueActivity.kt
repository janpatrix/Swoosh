package com.example.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        leagueNextBtn.setOnClickListener {

            val difficultyInten = Intent(this, DifficultyActivity::class.java)
            startActivity(difficultyInten)
        }
    }
}
