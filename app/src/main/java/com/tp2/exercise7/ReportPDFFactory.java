package com.tp2.exercise7;

public class ReportPDFFactory implements ReportFactory {

    @Override
    public Report createReport() {
        return new ReportPDF();
    }
}