package sg.edu.rp.c346.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;



public class Modules extends AppCompatActivity {
    TextView modulecode;
    TextView modulename;
    TextView moduleyear;
    TextView modulesem;
    TextView modulecredit;
    TextView modulevenue ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modules);
        ArrayList<Module> Modulelist = new ArrayList<Module>();
        String moduleCode;
        String moduleName;
        int moduleYear;
        int moduleSem;
        double moduleCredit;
        String moduleVenue;
        Modulelist.add(new Module("C346","Mobile App development ",2023,1,4,"E63A"));
        Modulelist.add(new Module("C203","Web App Development in php",2023,1,4,"W65C"));
        Modulelist.add(new Module("C206","Software Development Process",2023,1,4,"W65C"));
        Modulelist.add(new Module("C218","UI/UX Design for Apps",2023,1,4,"W65C"));
        Modulelist.add(new Module("C235","IT Security and Management",2023,1,4,"W65C"));
        Modulelist.add(new Module("G953","Life Skills 3",2023,1));
        Modulelist.add(new Module("C390","Portfolio Development",2023,1));

        moduleyear=findViewById(R.id.year);
        modulecode=findViewById(R.id.code);
        modulename=findViewById(R.id.name);
        modulecredit=findViewById(R.id.credit);
        modulesem=findViewById(R.id.sem);
        modulevenue=findViewById(R.id.venue);
        Intent intent=getIntent();




        int getmodules=intent.getIntExtra("module",10);
        if(getmodules==1){
            for (int x =0;x<Modulelist.size();x++){
                if(Modulelist.get(x).moduleCode=="C346"){
                    moduleyear.setText("Module Year: "+Modulelist.get(x).moduleYear);
                    modulecredit.setText("Module Credit: "+Modulelist.get(x).moduleCredit);
                    modulename.setText("Module Name: "+Modulelist.get(x).moduleName);
                    modulecode.setText("Module Code: "+Modulelist.get(x).moduleCode);
                   modulesem.setText("Module Sem: "+ Modulelist.get(x).moduleSem);
                    modulevenue.setText("Module Venue: "+Modulelist.get(x).moduleVenue);
                }
            }
        }
        else if(getmodules==2){
            for (int x =0;x<Modulelist.size();x++){
                if(Modulelist.get(x).moduleCode=="C235"){
                    moduleyear.setText("Module Year: "+Modulelist.get(x).moduleYear);
                    modulecredit.setText("Module Credit: "+Modulelist.get(x).moduleCredit);
                    modulename.setText("Module Name: "+Modulelist.get(x).moduleName);
                    modulecode.setText("Module Code: "+Modulelist.get(x).moduleCode);
                    modulesem.setText("Module Sem: "+ Modulelist.get(x).moduleSem);
                    modulevenue.setText("Module Venue: "+Modulelist.get(x).moduleVenue);
                }
            }

        }
        else if (getmodules==3){
            for (int x =0;x<Modulelist.size();x++){
                if(Modulelist.get(x).moduleCode=="C203"){
                    moduleyear.setText("Module Year: "+Modulelist.get(x).moduleYear);
                    modulecredit.setText("Module Credit: "+Modulelist.get(x).moduleCredit);
                    modulename.setText("Module Name: "+Modulelist.get(x).moduleName);
                    modulecode.setText("Module Code: "+Modulelist.get(x).moduleCode);
                    modulesem.setText("Module Sem: "+ Modulelist.get(x).moduleSem);
                    modulevenue.setText("Module Venue: "+Modulelist.get(x).moduleVenue);
                }
            }
        }
        else if(getmodules==4){
            for (int x =0;x<Modulelist.size();x++){
                if(Modulelist.get(x).moduleCode=="C206"){
                    moduleyear.setText("Module Year: "+Modulelist.get(x).moduleYear);
                    modulecredit.setText("Module Credit: "+Modulelist.get(x).moduleCredit);
                    modulename.setText("Module Name: "+Modulelist.get(x).moduleName);
                    modulecode.setText("Module Code: "+Modulelist.get(x).moduleCode);
                    modulesem.setText("Module Sem: "+ Modulelist.get(x).moduleSem);
                    modulevenue.setText("Module Venue: "+Modulelist.get(x).moduleVenue);
                }
            }
        }
        else if (getmodules==5){
            for (int x =0;x<Modulelist.size();x++){
                if(Modulelist.get(x).moduleCode=="C218"){
                    moduleyear.setText("Module Year: "+Modulelist.get(x).moduleYear);
                    modulecredit.setText("Module Credit: "+Modulelist.get(x).moduleCredit);
                    modulename.setText("Module Name: "+Modulelist.get(x).moduleName);
                    modulecode.setText("Module Code: "+Modulelist.get(x).moduleCode);
                    modulesem.setText("Module Sem: "+ Modulelist.get(x).moduleSem);
                    modulevenue.setText("Module Venue: "+Modulelist.get(x).moduleVenue);
                }
            }
        }
        else if (getmodules==6){
            for (int x =0;x<Modulelist.size();x++){
                if(Modulelist.get(x).moduleCode=="C390"){
                    moduleyear.setText("Module Year: "+Modulelist.get(x).moduleYear);
                    modulecredit.setText("Module Credit: "+Modulelist.get(x).moduleCredit);
                    modulename.setText("Module Name: "+Modulelist.get(x).moduleName);
                    modulecode.setText("Module Code: "+Modulelist.get(x).moduleCode);
                    modulesem.setText("Module Sem: "+ Modulelist.get(x).moduleSem);
                    modulevenue.setText("Module Venue: "+Modulelist.get(x).moduleVenue);
                }
            }
        }
    }
}