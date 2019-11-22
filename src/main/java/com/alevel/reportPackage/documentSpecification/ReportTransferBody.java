package com.alevel.reportPackage.documentSpecification;

import com.alevel.reportPackage.documentDescription.ReportBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Тело документа о транзации денежных средств.
 */

public class ReportTransferBody extends ReportBody {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReportTransferBody.class);

    private String text;
    private Date date;

    public ReportTransferBody(String text, Date date) {
        super(text, date);
        LOGGER.debug("ReportTransferBody constructor call");
    }


}
