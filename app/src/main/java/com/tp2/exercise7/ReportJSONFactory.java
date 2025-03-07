package com.tp2.exercise7;

public class ReportJSONFactory implements ReportFactory {
    @Override
    public Report createReport() {
        return new ReportJSON();
    }
}