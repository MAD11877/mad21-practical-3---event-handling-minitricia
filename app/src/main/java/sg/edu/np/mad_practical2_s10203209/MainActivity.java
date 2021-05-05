package sg.edu.np.mad_practical2_s10203209;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    User user = new User("Tricia","aaaAAaaAAAAAAaaaaaaAAAAAAAAaaaAAAAAAaaaaAAAAaAahhhhhhhhhhhhhhh! i is dont know what to type here. please send help. i is dyinggg. i wanna drink bubble tea, please treat me :')",0,false);
    private final static String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG,"Main Activity Created");

        TextView name = findViewById(R.id.name_text);
        TextView desc = findViewById(R.id.description_text);
        name.setText(user.name);
        desc.setText(user.description);

        Button button = findViewById(R.id.follow_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.followed == false){
                    button.setText("Unfollow");
                    user.setFollowed(true);
                }
                else{
                    button.setText("Follow");
                    user.setFollowed(false);
                }
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
    }

    @Override
    protected void onResume(){
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    protected void onStop(){
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }
}