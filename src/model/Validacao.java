
package model;

import java.util.Calendar;
import java.util.Date;

public class Validacao {
    public String validar_Data_Ano(Date d){
        Date da=new Date();
        Calendar c1=Calendar.getInstance();
        Calendar c2=Calendar.getInstance();
        c1.setTime(da);
        c2.setTime(d);
        int t1,t2;
        t1=c1.get(Calendar.YEAR);
        t2=c2.get(Calendar.YEAR);
        if(t1<t2){
           return "Se estamos em:"+t1+" como vais por a data:"+t2;
        }else{
        t1=t1-18;
        if(t1<t2){
            return "É uma pessoa menor de idade";
        }}
        return "";
    }
}
