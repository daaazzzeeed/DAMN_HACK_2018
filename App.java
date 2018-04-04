package shekhovtsov.nikita.damnhackteam;

import android.app.Application;
import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("n8Iq13aS5hWfBblTzVNN")
                .server("http://91.235.66.93:1337/parse/")
                .build()
        );
    }
}
