package de.annamorgiel.salute;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

        /** Called when the user touches the button */
        public void sendMessage(View view) {

        }
    /*public void addQuotation(View view ){
        EditText editView = (EditText) findViewById(R.id.new_toast);
        String newToast = editView.getText().toString();
        newToast = "\"" + newToast + "\"";
        (listProst).add(newToast);
    }*/
    public void addListenerOnButton() {

        ImageButton imageButton = (ImageButton) findViewById(R.id.onButton);
        imageButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Random generatorSprueche = new Random();
                int k = generatorSprueche.nextInt(listProst.size()); //TODO: listToast czy listToast -1 ?

                TextView textView = (TextView) findViewById(R.id.textOfaToast);
                textView.setText(listProst.get(k));

                Random generatorImages = new Random();
                TypedArray imgs = getResources().obtainTypedArray(R.array.wein_image_pos);


                int k2 = generatorImages.nextInt(imgs.length());


                View textViewBackgr = findViewById(R.id.mainlayout);
                textViewBackgr.setBackgroundResource(imgs.getResourceId(k2,0));
                imgs.recycle();

                Random generatorToast = new Random();
                int k3 = generatorToast.nextInt(listToast.size());
                Toast.makeText(MainActivity.this,listToast.get(k3), Toast.LENGTH_SHORT).show();
            }
        });


    }




    List<String> listToast = Arrays.asList("Na zdrowie!", "Cheers!", "Salud!", "Salute!","Na zdravi!", "Sei gesund!", "Gan bay!", "Proost!", "Zum wohl!", "Santé!", "Noroc!", "Iechyd da!" );

    List<String> listProst = Arrays.asList(
            "“I cook with wine, sometimes I even add it to the food.” \n" +
                    "― W.C. Fields",
            "“Either give me more wine or leave me alone.” \n" +
                    "― Rumi",
            "“it's a smile, it's a kiss, it's a sip of wine ... it's summertime!” \n" +
                    "― Kenny Chesney",
            "“Wine improves with age. The older I get, the better I like it.”\n" +
                    "\n" +
                    "― Anonymous",
            "“Accept what life offers you and try to drink from every cup. All wines should be tasted; some should only be sipped, but with others, drink the whole bottle.”\n" +
                    "\n" +
                    "― Paulo Coelho",
            "“Men are like wine – some turn to vinegar, but the best improve with age.”\n" +
                    "\n" +
                    "― Pope John XXIII",
            "“Let us celebrate with wine and sweet words.”\n" + "\n" + " – Titus Maccius Plautus",
            "“Making good wine is a skill. Fine wine is an art.”" + "\n" + "– Robert Mondavi",
            "“Wine is poetry in a bottle.”" + "\n" + "– Cliffon Fadiman",
            "“Penicillin cures, but wine makes people happy.”\n" +
                    "\n" +
                    "― Alexander Fleming",
            "“A gourmet meal without a glass of wine just seems tragic to me somehow.”\n" +
                    "\n" +
                    "― Kathy Mattea",
            "“One should always be drunk. That’s all that matters…But with what? With wine, with poetry, or with virtue, as you chose. But get drunk.”\n" +
                    "\n" +
                    "― Charles Baudelaire, circa 1850s",
            "“Anyone who tries to make you believe that he knows all about wines is obviously a fake.”\n" +
                    "\n" +
                    "― Leon Adams, The Commonsense Book of Wine",
            "“There are days when solitude is a heady wine that intoxicates you with freedom, others when it is a bitter tonic, and still others when it is a poison that makes you beat your head against the wall.” \n" +
            "― Colette, Oeuvres");







}
