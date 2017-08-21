
package example.com.abhi.working_with_threads

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class Kotlin_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_)

        Toast.makeText(this,"hello kotlin",Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()

        Log.i("TEST","restart test")
    }

}
