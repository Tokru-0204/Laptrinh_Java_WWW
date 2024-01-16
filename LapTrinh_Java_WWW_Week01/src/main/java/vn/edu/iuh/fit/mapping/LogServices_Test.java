package vn.edu.iuh.fit.mapping;

import vn.edu.iuh.fit.models.Log;
import vn.edu.iuh.fit.services.LogServices;

import java.sql.Timestamp;
import java.util.Date;

public class LogServices_Test {
    public static void main(String[] args) {
        Date date = new Date();

        Log log1 = new Log("met", new Timestamp(date.getTime()), new Timestamp(date.getTime()), "oke");

        LogServices.insertLog(log1);
    }
}
