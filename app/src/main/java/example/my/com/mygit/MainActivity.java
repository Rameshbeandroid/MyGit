package example.my.com.mygit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    displayGitOne();

  }

  private void displayGitOne() {
    Toast.makeText(this,"GitOne",Toast.LENGTH_SHORT).show();
  }
}
