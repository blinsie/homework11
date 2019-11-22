package com.alevel.reportPackage.documentSpecification;

import com.alevel.reportPackage.documentDescription.ReportBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Тело документа о поступлении средств.
 */

public class ReportIncomeBody extends ReportBody {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReportBody.class);

    private String text;
    private Date date;

    public ReportIncomeBody(String text, Date date) {
        super(text, date);
        LOGGER.debug("ReportIncomeBody constructor call");
    }
}
