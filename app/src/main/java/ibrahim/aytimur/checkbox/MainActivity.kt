package ibrahim.aytimur.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            var mesaj =""
            if (checkBox1.isChecked)
                mesaj += checkBox1.text.toString()
            textView.text = mesaj
            if (checkBox2.isChecked)
                mesaj += checkBox2.text.toString()
            textView.text = mesaj
            if (checkBox3.isChecked)
                mesaj += checkBox3.text.toString()
            textView.text = mesaj
            if (checkBox4.isChecked)
                mesaj += checkBox4.text.toString()
            textView.text = mesaj
            if (checkBox5.isChecked)
                mesaj += checkBox5.text.toString()
            textView.text = mesaj
        }
    }
}
