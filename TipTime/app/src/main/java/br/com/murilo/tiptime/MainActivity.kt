package br.com.murilo.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.murilo.tiptime.databinding.ActivityMainBinding
import java.text.NumberFormat
import kotlin.math.ceil
import kotlin.math.cos

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ButtonCalculate.setOnClickListener {calculateTip()}
    }
    private fun calculateTip() {
        val costService: Double? = binding.costOfService.text.toString().toDoubleOrNull()

        if (costService == null){
            binding.tipResult.text = ""
            return
        }

        val percentage = when (binding.RadioButtonGrup.checkedRadioButtonId){
            R.id.RadioButton_Amazing -> 0.20
            R.id.RadioButton_Good -> 0.18
            else -> 0.15
        }

        val roundUp = binding.roundUpSwitch.isChecked

        val tipCalculated = if (roundUp){
            ceil(costService * percentage)
        } else {
            costService * percentage
        }

        val formattedTip = NumberFormat.getCurrencyInstance().format(tipCalculated)

        binding.tipResult.text = getString(R.string.tip_amount_per, formattedTip)
    }


}