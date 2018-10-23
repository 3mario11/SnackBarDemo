package mobiledev.lawrence.snackbardemo;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.support.design.widget.Snackbar.LENGTH_SHORT;

/*****************************************************
 * This demo is for adding a Snackbar to an activity
 * Steps:
 * 1 - Wrap layout of activity with CoordinatorLayout in the xml file (activity_main.xml)
 * 2 - Ensure there is an id for the CoordinatorLayout (android:id="@+id/snackbarDemo")
 * 3 - Create functionality to show the snackbar
 *  3.1 - Make Snackbar object in java file (MainActivity.java)
 *      -If android studio can't find Snackbar:
 *          1. Open [File] -> [Project Structure...]
 *          2. Select [app] in the left pad
 *          3. Select [Dependencies] in the right tabs
 *          4. Click [+] button on the right side
 *          5. Select [1 Library dependency]
 *          6. Choose [com.android.support:design ~~]
 *          7. Click [OK] button
 *  3.2 - pop up the snackbar using snackBarObject.show() (mySnackbar.show())
 *
 *  3.5 - Another option is to do it all at once (PlayButton2())
 *
 *
 * Snackbar.make function:
 *  Snackbar.make(viewId, message(text), Snackbar.duration);
 *  Snackbar.duation can be Snackbar.LENGTH_SHORT, Snackbar.LENGTH_LONG, or Snackbar.LENGTH_INDEFINITE
 *  It makes a Snackbar to use
 *
 *
 *  Resources:
 *  https://developer.android.com/training/snackbar/showing
 *  https://developer.android.com/reference/android/support/design/widget/Snackbar
 *  https://stackoverflow.com/questions/34263418/cant-find-android-support-design-widget-snackbar-in-support-design-library
 *
 *****************************************************/
public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;

    //Step 3.1
    Snackbar mySnackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btnSnackBar);
        btn2 = findViewById(R.id.btnSnackBar2);

        //step 3.1 assigning it to the variable
        mySnackbar = Snackbar.make(findViewById(R.id.snackbarDemo), "This is a Snackbar", Snackbar.LENGTH_SHORT);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlayButton1();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlayButton2();
            }
        });
    }

    //Step 3.2 this way of making the snackbar enables you to add functionality
    private void PlayButton1(){
        mySnackbar.show();
    }

    //Step 3.5
    //You make a snackbar like this if you only want to display a snackbar with a message
    //and have no extra functionality
    private void PlayButton2(){
        Snackbar.make(findViewById(R.id.snackbarDemo), R.string.snackbarBtn2Message, Snackbar.LENGTH_LONG).show();

    }
}
