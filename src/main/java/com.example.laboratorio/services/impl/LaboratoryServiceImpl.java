package com.example.laboratorio.services.impl;

import com.example.laboratorio.services.*;

public class LaboratoryServiceImpl {
    private final LoginService loginService;
    private final ElementService elementService;
    /*private final LoanService loanService;
    private final PersonService personService;
    private final ReportService reportService;*/



    public LaboratoryServiceImpl() {
        loginService = (LoginService) new LoginServiceImpl();
        /*loanService = (LoanService) new LoanServiceImpl();*/
        elementService = (ElementService) new ElementServiceImpl();
        /*personService = (PersonService) new PersonServiceImpl();
        reportService = (ReportService) new ReportServiceImpl();*/
    }

   public LoginService getLoginService() {
        return loginService;
    }
    public ElementService getElementService() {return elementService;}
    /*public ReportService getReportService() {return reportService;}
    public LoanService getLoanService() {return loanService;}
    public PersonService getPersonService() {return personService;}*/

}
