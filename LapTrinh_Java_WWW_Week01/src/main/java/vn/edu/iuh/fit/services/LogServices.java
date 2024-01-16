package vn.edu.iuh.fit.services;

import vn.edu.iuh.fit.models.Log;
import vn.edu.iuh.fit.repositories.LogRepository;

import java.util.List;

public class LogServices {
    private static LogRepository logDao = new LogRepository();

    public static void insertLog(Log log) {
        logDao.insertLog(log);
    }

    public static List<Log> getLogs() {
        return logDao.getLogs();
    }
}