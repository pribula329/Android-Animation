package luky.onlinekurz.animation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startAnimation()



    }

    private fun startAnimation(){
        val screen: View? = findViewById(R.id.screen)
        screen?.setOnClickListener {
            stopAndPlayAnimation()
        }
    }

    private fun stopAndPlayAnimation(){
        val animationCoctail : LottieAnimationView = findViewById(R.id.animationView)

        if (animationCoctail.isAnimating){
            animationCoctail.pauseAnimation()
        }
        else{
            animationCoctail.resumeAnimation()
        }


    }
}