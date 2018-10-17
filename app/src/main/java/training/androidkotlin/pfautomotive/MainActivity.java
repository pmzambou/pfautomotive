package training.androidkotlin.pfautomotive;

import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Matrix m = new Matrix();
        boolean id = m.isIdentity();
        float[] values = {1.5F, 1.4F, 1.3F, 1.2F, 1.1F, 1.0F,0.9F, 0.8F, 0.7F};
        m.setValues(values);
    }
}
