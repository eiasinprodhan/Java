package util;

import java.sql.Date;

public class DateConverter {
    public Date utilDateToSqlDate(java.util.Date date){
        if(date==null){
            return null;
        }
        return new Date(date.getTime());
    }
}
