package victor.mendez.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val campo_num1: EditText = findViewById(R.id.et_num1)
        val campo_num2: EditText = findViewById(R.id.et_num2)
        val bttn_suma: Button = findViewById(R.id.bttn_suma)
        val bttn_resta: Button = findViewById(R.id.bttn_resta)
        val respuesta: TextView = findViewById(R.id.tv_respuesta)

        bttn_suma.setOnClickListener(){
            var num1: Int = campo_num1.text.toString().toInt()
            var num2: Int = campo_num2.text.toString().toInt()
            var resultado = num1 + num2
            Toast.makeText(this, "Este es un mensaje", Toast.LENGTH_LONG).show()
            respuesta.text = "$resultado"
        }

        bttn_resta.setOnClickListener(){
            var num1: Int = campo_num1.text.toString().toInt()
            var num2: Int = campo_num2.text.toString().toInt()
            var resultado = num1 - num2
            Toast.makeText(this, "Este es un mensaje", Toast.LENGTH_LONG).show()
            respuesta.text = "$resultado"
        }
    }
}