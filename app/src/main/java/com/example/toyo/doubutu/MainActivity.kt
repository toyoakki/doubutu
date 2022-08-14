package com.example.toyo.doubutu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toyo.doubutu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //TextViewに”イヌ”を、ImageViewに犬の画像を表示
        binding.inuBtn.setOnClickListener {
            binding.doubutuText.text = getString(R.string.inu_text)
            binding.doubutuImage.setImageResource(R.drawable.inu)
        }
        //TextViewに”ネコ”を、ImageViewに猫の画像を表示
        binding.nekoBtn.setOnClickListener {
            binding.doubutuText.text = getString(R.string.neko_text)
            binding.doubutuImage.setImageResource(R.drawable.neko)
        }
        //TextViewに”ハムスター”を、ImageViewにハムスターの画像を表示
        binding.hamuBtn.setOnClickListener {
            binding.doubutuText.text = getString(R.string.hamu_text)
            binding.doubutuImage.setImageResource(R.drawable.hamu)
        }
        //TextViewに”ウサギ”を、ImageViewに兎の画像を表示
        binding.usaBtn.setOnClickListener {
            binding.doubutuText.text = getString(R.string.usa_text)
            binding.doubutuImage.setImageResource(R.drawable.usa)
        }
        //TextViewに”リス”を、ImageViewにリスの画像を表示
        binding.risuBtn.setOnClickListener {
            binding.doubutuText.text = getString(R.string.risu_text)
            binding.doubutuImage.setImageResource(R.drawable.risu)
        }
        //TextViewに”ウマ”を、ImageViewに馬の画像を表示
        binding.umaBtn.setOnClickListener {
            binding.doubutuText.text = getString(R.string.uma_text)
            binding.doubutuImage.setImageResource(R.drawable.uma)
        }
        //TextViewに”スズメ”を、ImageViewに雀の画像を表示
        binding.suzumeBtn.setOnClickListener {
            binding.doubutuText.text = getString(R.string.suzume_text)
            binding.doubutuImage.setImageResource(R.drawable.suzume)
        }
        //TextViewに”ペンギン”を、ImageViewにペンギンの画像を表示
        binding.penBtn.setOnClickListener {
            binding.doubutuText.text = getString(R.string.pen_text)
            binding.doubutuImage.setImageResource(R.drawable.pen)
        }
        //ボタンを押すたびにランダムで動物の名前と画像を表示させる
        binding.ranBtn.setOnClickListener {
            val a = (1..8).random()
            when (a) {
                1 -> { binding.doubutuText.text = getString(R.string.inu_text)
                    binding.doubutuImage.setImageResource(R.drawable.inu) }
                2 -> { binding.doubutuText.text = getString(R.string.neko_text)
                    binding.doubutuImage.setImageResource(R.drawable.neko) }
                3 -> { binding.doubutuText.text = getString(R.string.hamu_text)
                    binding.doubutuImage.setImageResource(R.drawable.hamu) }
                4 -> { binding.doubutuText.text = getString(R.string.usa_text)
                    binding.doubutuImage.setImageResource(R.drawable.usa) }
                5 -> { binding.doubutuText.text = getString(R.string.risu_text)
                    binding.doubutuImage.setImageResource(R.drawable.risu) }
                6 -> { binding.doubutuText.text = getString(R.string.uma_text)
                    binding.doubutuImage.setImageResource(R.drawable.uma) }
                7 -> {binding.doubutuText.text = getString(R.string.suzume_text)
                    binding.doubutuImage.setImageResource(R.drawable.suzume) }
                else -> {binding.doubutuText.text = getString(R.string.pen_text)
                    binding.doubutuImage.setImageResource(R.drawable.pen) }
            }
        }
    }
}