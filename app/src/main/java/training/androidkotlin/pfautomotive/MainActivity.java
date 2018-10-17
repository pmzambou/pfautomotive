package training.androidkotlin.pfautomotive;

import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Matrix m = new Matrix();
        /*boolean id = m.isIdentity();
        float[] values = {1.5F, 1.4F, 1.3F, 1.2F, 1.1F, 1.0F,0.9F, 0.8F, 0.7F};
        m.setValues(values);
        m.setRotate(180.0F);
        m.setScale(2, 4);
        m.preScale(3, 5);
        m.preScale(0.5F, 0.5F);
        RectF rectF = new RectF(1, 1, 2, 3);
        m.mapRect(rectF);
        float[] pts = {1, 2, 3, 4};
        m.mapPoints(pts);*/
        int[][] ma = {{1, 2, 3, 0}, {4, 5, 6, 10}, {7, 8, 9, 11}};//, {12, 13, 14, 15}};
        /*printSpiral(ma, 4);*/
        printMatrix(3, 4, ma);

    }

    void printSpiral(int[][] arr, int size) {
        for (int l = 0; l < size / 2; l++) {
            int min = l;
            int max = size - 1 - l;
            for (int i = min; i < max; i++)
                Log.d("myapp", "\n" + String.valueOf(arr[i][min]));
            for (int j = min; j < max; j++)
                Log.d("myapp", "\n" + String.valueOf(arr[max][j]));
            for (int i = max; i > min; i--)
                Log.d("myapp", "\n" + String.valueOf(arr[i][max]));
            for (int j = max; j > min; j--)
                Log.d("myapp", "\n" + String.valueOf(arr[min][j]));
        }
        // centre is special case: avoiding printing it 4 times.
        if (size % 2 == 1)
            Log.d("myapp", "\n" + String.valueOf(arr[size / 2][size / 2]));
    }

    void printMatrix(int row, int column, int[][] matrix) {
        int i, k = 0, l = 0;
        int last_row = row - 1, last_column = column - 1;
        while (k <= last_row && l <= last_column) {
            for (i = l; i <= last_column; i++) {
                Log.d("myapp", "\n" + matrix[k][i]);
            }
            k++;
            for (i = k; i <= last_row; i++) {
                Log.d("myapp", "\n" + matrix[i][last_column]);
            }
            last_column--;
            if (k <= last_row) {
                for (i = last_column; i >= l; i--) {
                    Log.d("myapp", "\n" + matrix[last_row][i]);
                }
                last_row--;
            }
            if (l <= last_column) {
                for (i = last_row; i >= k; i--) {
                    Log.d("myapp", "\n" + matrix[i][l]);
                }
                l++;
            }
        }
    }
}
