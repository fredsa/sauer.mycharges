package sauer.mycharges;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class ChargesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charges);

        LinearLayout chargesLinearLayout = (LinearLayout) findViewById(R.id.chargesLinearLayout);
        for(int i=0; i<3; i++) {
            View chargeDetailFragment = View.inflate(this, R.layout.fragment_charge_detail, null);
            TextView chargeDescriptionTextView = (TextView) chargeDetailFragment.findViewById(R.id.chargeDescriptionTextView);
            TextView chargeSummaryTextView = (TextView) chargeDetailFragment.findViewById(R.id.chargeSummaryTextView);
            String amount = String.format("%.2f", Math.random() * 100);
            chargeSummaryTextView.setText("$" + amount + " at Eiffel Tower");
            chargeDescriptionTextView.setText("2014-02-23 (Sun) 01:24 PM");
            chargesLinearLayout.addView(chargeDetailFragment);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.charges, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
