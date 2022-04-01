package bg.o.sim.dropplett

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import bg.o.sim.dropplett.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private var red: Byte = 20
    private var blue: Byte = 20
    private var green: Byte = 20
    private var white: Byte = 20

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.count0.setOnTouchListener(CompoundDrawableTouchListener{
            when(it){
                CompoundDrawableTouchListener.LEFT ->{
                    red = red.dec()
                    binding.count0.text = "$red"
                }
                CompoundDrawableTouchListener.TOP ->{
                    red = 0
                    binding.count0.text = ""
                }
                CompoundDrawableTouchListener.RIGHT ->{
                    red = red.inc()
                    binding.count0.text = "$red"
                    
                }
                CompoundDrawableTouchListener.BOTTOM ->{
                    red = 20
                    binding.count0.text = "$blue"
                }
            }
        })
        binding.count1.setOnTouchListener(CompoundDrawableTouchListener{
            when(it){
                CompoundDrawableTouchListener.LEFT ->{
                    blue = blue.dec()
                    binding.count1.text = "$blue"
                }
                CompoundDrawableTouchListener.TOP ->{
                    blue = 0
                    binding.count1.text = ""
                }
                CompoundDrawableTouchListener.RIGHT ->{
                    blue = blue.inc()
                    binding.count1.text = "$blue"
                    
                }
                CompoundDrawableTouchListener.BOTTOM ->{
                    blue = 20
                    binding.count1.text = "$blue"
                }
            }
        })
        binding.count2.setOnTouchListener(CompoundDrawableTouchListener{
            when(it){
                CompoundDrawableTouchListener.LEFT ->{
                    green = green.dec()
                    binding.count2.text = "$green"
                }
                CompoundDrawableTouchListener.TOP ->{
                    green = 0
                    binding.count2.text = ""
                }
                CompoundDrawableTouchListener.RIGHT ->{
                    green = green.inc()
                    binding.count2.text = "$green"
                    
                }
                CompoundDrawableTouchListener.BOTTOM ->{
                    green = 20
                    binding.count2.text = "$green"
                }
            }
        })
        binding.count3.setOnTouchListener(CompoundDrawableTouchListener{
            when(it){
                CompoundDrawableTouchListener.LEFT ->{
                    white = white.dec()
                    binding.count3.text = "$white"
                }
                CompoundDrawableTouchListener.TOP ->{
                    white = 0
                    binding.count3.text = ""
                }
                CompoundDrawableTouchListener.RIGHT ->{
                    white = white.inc()
                    binding.count3.text = "$white"
                    
                }
                CompoundDrawableTouchListener.BOTTOM ->{
                    white = 20
                    binding.count3.text = "$white"
                }
            }
        })
    }
}