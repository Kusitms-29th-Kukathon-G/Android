package com.example.kukathon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.kukathon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    val myApiKey = BuildConfig.MY_KEY

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bnv.setupWithNavController(navController)
        hideBottomNavigationView(navController)
    }

    private fun hideBottomNavigationView(navController: NavController) {
        navController.addOnDestinationChangedListener { _, destination, _ ->
            binding.bnv.visibility = when (destination.id) {
                R.id.onBoardingFragment -> View.GONE
                R.id.termsFragment -> View.GONE
                R.id.inputStep1Fragment -> View.GONE
                R.id.inputStep2Fragment -> View.GONE
                R.id.inputStep3Fragment -> View.GONE
                R.id.studyResultFragment -> View.GONE
                R.id.signUpFragment -> View.GONE

                else -> View.VISIBLE
            }
        }
    }
}