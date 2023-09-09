package cpm.example.loginappalication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.Email);
        passwordEditText = findViewById(R.id.password);
        Button loginButton = findViewById(R.id.login);

        loginButton.setOnClickListener(view -> {
            String enteredUsername = usernameEditText.getText().toString();
            String enteredPassword = passwordEditText.getText().toString();

            if (isValidCredentials(enteredUsername, enteredPassword)) {
                // Successful login
                Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
            } else {
                // Invalid credentials
                Toast.makeText(MainActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private boolean isValidCredentials(String username, String password) {
        // Replace these with your actual validation logic
        String validUsername = "Admin";
        String validPassword = "Admin";

        return username.equals(validUsername) && password.equals(validPassword);
    }
}
