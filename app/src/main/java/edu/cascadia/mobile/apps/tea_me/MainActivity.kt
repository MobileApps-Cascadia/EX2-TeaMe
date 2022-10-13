package edu.cascadia.mobile.apps.tea_me

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.Toast
import java.lang.StringBuilder
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private val TeaGoodies = ArrayList<CharSequence>()
    private lateinit var milkCheckBox: CheckBox
    private lateinit var sugarCheckBox: CheckBox
    private lateinit var lemonCheckBox: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        milkCheckBox = findViewById(R.id.milkBox)
        sugarCheckBox = findViewById(R.id.sugarBox)
        lemonCheckBox = findViewById(R.id.lemonBox)

        //TODO: Assign each checkbox an EventHandler using a setOnCheckedChangeListener to calls the clickIt function with two parameters

    }

    fun clickIt(box: CompoundButton, selected: Boolean ) {
        //Add or remove the items text value to ArrayList depending on whether it was checked or unchecked
        if (selected) TeaGoodies.add(box.text)
        else TeaGoodies.remove(box.text)

        //Create a String of the current set of labels in the TeaGoodies Array
        //TODO: Add the word "Love" to the end of every string built
        val goodiesString = StringBuilder("Tea with ")
        for (goodies in TeaGoodies) {
            goodiesString.append(goodies).append(", ")
        }
        //Display the string as a temporary popup - called a "Toast"
        Toast.makeText(this@MainActivity, goodiesString, Toast.LENGTH_SHORT).show()
    }

}