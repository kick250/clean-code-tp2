package com.tp2.exercise7;

public class ReportCSVFactory implements ReportFactory{
    @Override
    public Report createReport() {
        return new ReportCSV();
    }
}