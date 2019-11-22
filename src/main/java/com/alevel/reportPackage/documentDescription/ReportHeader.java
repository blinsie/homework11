package com.alevel.reportPackage.documentDescription;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Заголовок содержит имя банка (компании), от лица которой составлен документ.
 */

public class ReportHeader {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReportFooter.class);

    private final String companyName;

    public ReportHeader(String companyName) {
        LOGGER.debug("ReportHeader constructor call");
        this.companyName = companyName;
    }

    public String getCompanyName() {
        LOGGER.debug("ReportFooter getCompanyName() call");
        return companyName;
    }

    @Override
    public String toString() {
        return "ReportHeader{ " +
                "companyName = '" + companyName + '\'' +
                '}';
    }
}
