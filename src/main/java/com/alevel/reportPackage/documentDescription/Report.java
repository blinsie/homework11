package com.alevel.reportPackage.documentDescription;

import com.alevel.reportPackage.documentBehavior.Printable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * В неизменяемом классе Отчета применется композиция, так как он состоит из
 * Заголовка, Тела Отчета и Колонтитула.
 * Внутри есть статический класс Builder`a, который генерирует цельный отчет.
 *
 */

public class Report implements Printable {

    private static final Logger LOGGER = LoggerFactory.getLogger(Report.class);

    private final ReportHeader header;
    private final ReportBody body;
    private final ReportFooter footer;

    private Report(ReportHeader header, ReportBody body, ReportFooter footer) {
        LOGGER.debug("Report constructor call");
        this.header = header;
        this.body = body;
        this.footer = footer;
    }

    public ReportHeader getHeader() {
        LOGGER.debug("Report getHeader() call");
        return header;
    }

    public ReportBody getBody() {
        LOGGER.debug("Report getBody() call");
        return body;
    }

    public ReportFooter getFooter() {
        LOGGER.debug("Report getFooter() call");
        return footer;
    }

    @Override
    public String toString() {
        return "Report{" +
                "[header = " + header.toString() +
                "], [body = " + body.toString() +
                "], [footer = " + footer.toString() +
                "]}";
    }

    public static class ReportBuilder {

        private ReportHeader header;
        private ReportBody body;
        private ReportFooter footer;

        public ReportBuilder(ReportHeader header, ReportBody body, ReportFooter footer) {
            LOGGER.debug("ReportBuilder constructor call");
            this.header = header;
            this.body = body;
            this.footer = footer;
        }

        public ReportBuilder setHeader(ReportHeader header) {
            LOGGER.debug("ReportBuilder setHeader() call");
            this.header = header;
            return this;
        }

        public ReportBuilder setBody(ReportBody body) {
            LOGGER.debug("ReportBuilder setBody() call");
            this.body = body;
            return this;
        }

        public ReportBuilder setFooter(ReportFooter footer) {
            LOGGER.debug("ReportBuilder setFooter() call");
            this.footer = footer;
            return this;
        }

        public Report build() {
            LOGGER.debug("ReportBuilder build() call");
            return new Report(header, body, footer);
        }

    }
}

