package com.example.abudarda.stonepaperscissor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.concurrent.ThreadLocalRandom;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    Button stne,pper,scis,result;
    int user_inpt=0,bot_input=0,user=0,bot=0,draw=0;
    String pcc,cpuu;
    /*View.OnClickListener l=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int id=v.getId();
            switch(id){
                case R.id.stone:
                    user_inpt=1;setwin();
                case R.id.paper:
                    user_inpt=2;setwin();
                case R.id.scissor:
                    user_inpt=3;setwin();
        }
    };*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        stne=(Button)findViewById(R.id.stone);
        pper=(Button)findViewById(R.id.paper);
        scis=(Button)findViewById(R.id.scissor);
        result=(Button)findViewById(R.id.resu);
        stne.setOnClickListener((View.OnClickListener) this);
        pper.setOnClickListener((View.OnClickListener) this);
        scis.setOnClickListener((View.OnClickListener) this);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Main2Activity.this,Resul_t.class);
                k.putExtra("Cpu",bot);
                k.putExtra("user",user);

                startActivity(k);
                Toast.makeText(getApplicationContext(),bot+"\t/"+user,Toast.LENGTH_LONG).show();

            }
        });

    }
    public void onClick(View v)
    {
        int id=v.getId();
        switch(id){
            case R.id.stone:
                user_inpt=1;setwin();
                break;
            case R.id.paper:
                user_inpt=2;setwin();break;
            case R.id.scissor:
                user_inpt=3;setwin();break;
        }
    }
    void setwin()
    {
        bot_input= ThreadLocalRandom.current().nextInt(1,3);
        if(bot_input==1&&user_inpt==2)
        {user++;
            cpuu=getcpu(bot_input);
            Toast.makeText(getApplicationContext(),"The CPU Choose "+cpuu,Toast.LENGTH_LONG).show();}
        else if(bot_input==1&&user_inpt==3)
        {bot++;
            cpuu=getcpu(bot_input);
            Toast.makeText(getApplicationContext(),"The CPU Choose "+cpuu,Toast.LENGTH_LONG).show();}
        else if(bot_input==2&&user_inpt==3)
        {user++;
            cpuu=getcpu(bot_input);
            Toast.makeText(getApplicationContext(),"The CPU Choose "+cpuu,Toast.LENGTH_LONG).show();}
        else if(bot_input==2&&user_inpt==1)
        {bot++;
            cpuu=getcpu(bot_input);
            Toast.makeText(getApplicationContext(),"The CPU Choose "+cpuu,Toast.LENGTH_LONG).show();}
        else if(bot_input==3&&user_inpt==1)
        {user++;
            cpuu=getcpu(bot_input);
            Toast.makeText(getApplicationContext(),"The CPU Choose "+cpuu,Toast.LENGTH_LONG).show();}
        else if(bot_input==3&&user_inpt==2)
        {bot++;
            cpuu=getcpu(bot_input);
            Toast.makeText(getApplicationContext(),"The CPU Choose "+cpuu,Toast.LENGTH_LONG).show();}
        else if(bot_input==user_inpt)
        {draw++;
            Toast.makeText(getApplicationContext(),"The CPU Choose "+cpuu,Toast.LENGTH_LONG).show();}

    }

    public void new4(View view) {
    }
    public String getcpu(int bot_input)
    {

        if(bot_input==1)
        {
            pcc="Stone";
        }
        else if(bot_input==2)
        {
            pcc="Paper";
        }
        else if(bot_input==3)
        {
            pcc="Scissors";
        }
        return pcc;
    }
}

