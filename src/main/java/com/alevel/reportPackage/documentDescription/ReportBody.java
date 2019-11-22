package com.alevel.reportPackage.documentDescription;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Тело отчета - часть документа, которая может менять в зависимости от содержания.
 */

public class ReportBody {
    private static final Logger LOGGER = LoggerFactory.getLogger(ReportBody.class);

    private String text;
    private Date date;

    public ReportBody(String text, Date date) {
        LOGGER.debug("ReportBody constructor call");
        this.text = text;
        this.date = date;
    }

    public String getText() {
        LOGGER.debug("ReportBody getText() call");
        return text;
    }

    public void setText(String text) {
        LOGGER.debug("ReportBody setText() call");
        this.text = text;
    }

    public Date getDate() {
        LOGGER.debug("ReportBody getDate() call");
        return date;
    }

    public void setDate(Date date) {
        LOGGER.debug("ReportBody setDate() call");
        this.date = date;
    }

    @Override
    public String toString() {
        return "ReportBody{" +
                " text = '" + text + '\'' +
                ", date = " + date +
                '}';
    }
}
