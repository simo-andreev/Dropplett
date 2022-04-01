package bg.o.sim.dropplett

import android.app.Activity
import android.os.Bundle
import bg.o.sim.dropplett.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private var red: Byte = 20
    private var blue: Byte = 20
    private var green: Byte = 20
    private var white: Byte = 20

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.clickGrid0.apply {
            add.setOnClickListener {
                red = red.inc()
                binding.count0.text = "$red"
            }
            subtract.setOnClickListener {
                red = red.dec()
                binding.count0.text = "$red"
            }
            reset.setOnClickListener {
                red = 20
                binding.count0.text = "$red"
            }
            droid.setOnClickListener {
                red = 0
                binding.count0.text = ""
            }
        }


        binding.clickGrid1.apply {
            add.setOnClickListener {
                blue = blue.inc()
                binding.count1.text = "$blue"
            }
            subtract.setOnClickListener {
                blue = blue.dec()
                binding.count1.text = "$blue"
            }
            reset.setOnClickListener {
                blue = 20
                binding.count1.text = "$blue"
            }
            droid.setOnClickListener {
                blue = 20
                binding.count1.text = ""
            }
        }
        binding.clickGrid2.apply {
            add.setOnClickListener {
                green = green.inc()
                binding.count2.text = "$green"
            }
            subtract.setOnClickListener {
                green = green.dec()
                binding.count2.text = "$green"
            }
            reset.setOnClickListener {
                green = 20
                binding.count2.text = "$green"
            }
            droid.setOnClickListener {
                green = 20
                binding.count2.text = ""
            }
        }
        binding.clickGrid3.apply {
            add.setOnClickListener {
                blue = blue.inc()
                binding.count3.text = "$blue"
            }
            subtract.setOnClickListener {
                blue = blue.dec()
                binding.count3.text = "$blue"
            }
            reset.setOnClickListener {
                blue = 20
                binding.count3.text = "$blue"
            }
            droid.setOnClickListener {
                blue = 20
                binding.count3.text = ""
            }
        }
    }
}