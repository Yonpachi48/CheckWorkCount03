package app.takahashi.yonpachi.checkworkcount03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.takahashi.yonpachi.checkworkcount03.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(this.root)
        }

        var leftNumber: Int = 0
        var rigtNumber: Int = 0

        binding.leftText.text = leftNumber.toString()
        binding.rightText.text = rigtNumber.toString()

        binding.leftPlusButton.setOnClickListener{
            leftNumber += 1
            binding.leftText.text = leftNumber.toString()
        }
        binding.rightPlusButton.setOnClickListener{
            rigtNumber += 1
            binding.rightText.text = rigtNumber.toString()
        }
    }
}