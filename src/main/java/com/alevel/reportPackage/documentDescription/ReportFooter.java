package com.alevel.reportPackage.documentDescription;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Колонтитул содержит постоянную печать банка (компании).
 */

public class ReportFooter {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReportFooter.class);

    private final String companySeal;

    public ReportFooter(String companySeal) {
        LOGGER.debug("ReportFooter constructor call");
        this.companySeal = companySeal;
    }

    public String getCompanySeal() {
        LOGGER.debug("ReportFooter getCompanySeal() call");
        return companySeal;
    }

    @Override
    public String toString() {
        return "ReportFooter{" +
                "companySeal = '" + companySeal + '\'' +
                '}';
    }
}
