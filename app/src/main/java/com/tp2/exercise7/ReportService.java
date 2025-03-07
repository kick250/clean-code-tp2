package com.tp2.exercise7;

public class ReportService {
    private final String PDF = "PDF";
    private final String CSV = "CSV";
    private final String JSON = "JSON";
    private final ReportFactory reportFactory;

    public ReportService(String type) {
        switch (type) {
            case PDF:
                this.reportFactory = new ReportPDFFactory();
                break;
            case CSV:
                this.reportFactory = new ReportPDFFactory();
                break;
            case JSON:
                this.reportFactory = new ReportPDFFactory();
                break;
            default:
                throw new RuntimeException("Tipo de relatório desconhecido!");
        }
    }

    public void generateReport() {
        Report report = this.reportFactory.createReport();
        report.generateHeader();
        report.generateBody();
        report.generateFooter();
    }
}