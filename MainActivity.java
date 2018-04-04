package shekhovtsov.nikita.damnhackteam;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.parse.Parse;


public class MainActivity extends AppCompatActivity {

    Button button_D, button_A, button_M, button_N;
    View arrow;
    FrameLayout frameLayout;
    TextView textView;

    // Метод для инициализации объектов
    public void InitUI() {
        button_D          = findViewById(R.id.button_D);
        button_A          = findViewById(R.id.button_A);
        button_M          = findViewById(R.id.button_M);
        button_N          = findViewById(R.id.button_N);
        frameLayout       = findViewById(R.id.frameLayout);
        textView          = findViewById(R.id.textView);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        InitUI();
        loadFragment(DFragment.newInstance());

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("n8Iq13aS5hWfBblTzVNN")
                .server("http://91.235.66.93:1337/parse/")
                .build()
        );
    }
    // метод, изменяющий состояние FrameLayout, задающий отображаемый фрагмент
    private void loadFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameLayout, fragment);
        ft.commit();
    }

    // ниже функции, обрабатывающие события нажатия на кнопки
    public void on_letter_D_click(View view) {
        button_D.setAlpha((float) 1.0);
        button_A.setAlpha((float) 0.3);
        button_M.setAlpha((float) 0.3);
        button_N.setAlpha((float) 0.3);
        textView.setText("Дмитрий Петухов");
        loadFragment(DFragment.newInstance());
    }

    public void on_letter_A_click(View view) {
        button_D.setAlpha((float) 0.3);
        button_A.setAlpha((float) 1.0);
        button_M.setAlpha((float) 0.3);
        button_N.setAlpha((float) 0.3);
        textView.setText("Александр Горностаев");
        loadFragment(AFragment.newInstance());
    }

    public void on_letter_M_click(View view) {
        button_D.setAlpha((float) 0.3);
        button_A.setAlpha((float) 0.3);
        button_M.setAlpha((float) 1.0);
        button_N.setAlpha((float) 0.3);
        textView.setText("Максим Скрябин");
        loadFragment(MFragment.newInstance());
    }

    public void on_letter_N_click(View view) {
        button_D.setAlpha((float) 0.3);
        button_A.setAlpha((float) 0.3);
        button_M.setAlpha((float) 0.3);
        button_N.setAlpha((float) 1.0);
        textView.setText("Никита Шеховцов");
        loadFragment(NFragment.newInstance());
    }
}
