package com.gabo.mathoperations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.gabo.mathoperations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val math = MathOperations()
        with(binding) {
            btnLCD.setOnClickListener {
                if (etFirstNum.text != null && etSecondNum.text != null &&
                    etFirstNum.text.toString() != "" && etSecondNum.text.toString() != "" ) {
                    tvAnswerTwoNumber.text = math.largestCommonDivider(
                        etFirstNum.text.toString().toInt(),
                        etSecondNum.text.toString().toInt()
                    ).toString()
                } else {
                    Toast.makeText(this@MainActivity, "something went wrong", Toast.LENGTH_SHORT)
                        .show()
                }

            }
            btnLCM.setOnClickListener {
                if (etFirstNum.text != null && etSecondNum.text != null) {
                    tvAnswerTwoNumber.text = math.leastCommonMultiple(
                        etFirstNum.text.toString().toInt(),
                        etSecondNum.text.toString().toInt()
                    ).toString()
                } else {
                    Toast.makeText(this@MainActivity, "something went wrong", Toast.LENGTH_SHORT)
                        .show()
                }
            }
            btnIsPalindrome.setOnClickListener {
                tvAnswer.text = math.isPalindrome(etInput.text.toString()).toString()
            }
            btnReverce.setOnClickListener {
                if (etInput.text != null && etInput.text.toString().toIntOrNull() is Int) {
                    tvAnswer.text = math.reverseNumber(etInput.text.toString().toInt())
                } else {
                    Toast.makeText(this@MainActivity, "something went wrong", Toast.LENGTH_SHORT)
                        .show()
                }
            }
            btnSumEvenNumbers.setOnClickListener {
                tvAnswer.text = math.sumEvenNumbers(100).toString()
            }
            btnContains.setOnClickListener {
                tvAnswer.text = math.containsOrNot(etInput.text.toString()).toString()
            }
        }
    }
}