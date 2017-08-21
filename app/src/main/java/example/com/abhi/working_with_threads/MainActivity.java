package example.com.abhi.working_with_threads;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Handler handler;
    private int count=0;
    private Message message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this will update the UI for the action performed on the button click

         handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                count++;
                TextView myTextView =
                        (TextView)findViewById(R.id.myTextView);
                if(count==1)
                {
                    myTextView.setText("Button Pressed");
                }

                else if(count>2)
                {
                    myTextView.setText("greater than two");
                }

                else
                {
                    myTextView.setText("Button Pressed second");
                }
            }
        };

    }

    //this will return the main thread

    //this function will cause to occur ANR

/*    public void buttonClick(View view)
    {
        long endTime = System.currentTimeMillis() + 20*1000;

        while (System.currentTimeMillis() < endTime) {
            synchronized (this) {
                try {
                    wait(endTime - System.currentTimeMillis());
                } catch (Exception e) {
                }
            }
        }
        TextView myTextView = (TextView)findViewById(R.id.myTextView);
        myTextView.setText("Button Pressed");
    }*/



   /* public void buttonClick(View view)
    {

        final Runnable runnable = new Runnable() {
            public void run() {

                long endTime = System.currentTimeMillis() + 20*1000;

                while (System.currentTimeMillis() < endTime) {
                    synchronized (this) {
                        try {
                            wait(endTime-System.currentTimeMillis());
                        } catch (Exception e) {}
                    }
                }


                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        TextView myTextView = (TextView)findViewById(R.id.myTextView);
                        myTextView.setText("Button Pressed");
                        Log.i("TEST","hello_test");


                    }
                });



            }
        };
        Thread mythread = new Thread(runnable);
        mythread.start();
    }*/

    /*public void buttonClick(View view)
    {

        Runnable runnable = new Runnable() {
            public void run() {

                long endTime = System.currentTimeMillis() + 20*1000;

                while (System.currentTimeMillis() < endTime) {
                    synchronized (this) {
                        try {
                            wait(endTime-System.currentTimeMillis());
                        } catch (Exception e) {}
                    }
                }
                    handler.sendEmptyMessage(0);
            }
        };
        Thread mythread = new Thread(runnable);
        mythread.start();
    }
*/
    @Override
    public boolean isFinishing() {

        Log.i("TEST","is this finishing");
        return super.isFinishing();
    }

    public void buttonClick(View view) {

        startActivity(new Intent(MainActivity.this,Kotlin_Activity.class));

    }
}



