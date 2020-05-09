package com.gonz.mx.shared.element.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("Activity 1")

        btn_go_to_second_activity.setOnClickListener {
            val intent = Intent(this, FullScreenImageActivity::class.java)

            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                iv_cat,
                ViewCompat.getTransitionName(iv_cat) ?: "transitioned_cat"
            )

            startActivity(intent, options.toBundle())
        }
    }
}
