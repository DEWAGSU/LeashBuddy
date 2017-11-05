package dewagsu.leashbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
        walkerLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToWalkerHome();
            }
        });
        Button signup = (Button) findViewById(R.id.signup_btn);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSignup();
            }
        });
    }

    private void goToOwnerHome() {
        Intent intent = new Intent(this, OwnerHome.class);
        startActivity(intent);
    }

    private void goToWalkerHome() {
        Intent intent = new Intent(this, WalkerHome.class);
        startActivity(intent);
    }

    private void goToSignup() {
        Toast.makeText(this, "Feature not yet supported", Toast.LENGTH_SHORT).show();
    }
}
