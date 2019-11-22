package com.alevel.reportPackage.documentDescription;

import com.alevel.reportPackage.documentSpecification.ReportIncomeBody;
import com.alevel.reportPackage.documentSpecification.ReportTransferBody;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 *  Написать код с решением задачки про документы банка, которая есть в лекции.
 *  Места, которые невозможно реализовать в силу незнания (например работа с
 *  принтером и тому подобное) закрыть интерфейсами-заглушками. Все покрыть
 *  логами и тестами.
 */

public class ReportTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReportTest.class);

    private ReportHeader header;
    private ReportFooter footer;

    @Before
    public void setUp() throws Exception {
        header = new ReportHeader("PrivatBank");
        footer = new ReportFooter("Sincerely, your bank <3");
    }

    @Test
    public void createTransferReport() {
        LOGGER.info("Calling createTransferReport() method in ReportTest");
        Report transferReport = new Report.ReportBuilder(
                header,
                new ReportTransferBody("You transfer 400$ from your card.", new Date()),
                footer
        ).build();
        LOGGER.debug(transferReport.toString());
    }

    @Test
    public void createIncomeReport() {
        LOGGER.info("Calling createIncomeReport() method in ReportTest");
        Report incomeReport = new Report.ReportBuilder(
                header,
                new ReportIncomeBody("You have income 800$ on your card.", new Date()),
                footer
        ).build();
        LOGGER.debug(incomeReport.toString());
    }
}