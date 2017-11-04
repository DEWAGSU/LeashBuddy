package dewagsu.leashbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        Button ownerLogin = (Button) findViewById(R.id.owner_login_btn);
        ownerLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToOwnerHome();
            }
        });
        Button walkerLogin = (Button) findViewById(R.id.walker_login_btn);
        Button signup = (Button) findViewById(R.id.signup_btn);
    }

    private void goToOwnerHome() {
        Intent intent = new Intent(this, OwnerHome.class);
        startActivity(intent);
    }

}
