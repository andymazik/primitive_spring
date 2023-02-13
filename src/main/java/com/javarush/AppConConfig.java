package com.javarush;

import com.javarush.repository.DBConnection;
import com.javarush.repository.SupervisorDAO;
import com.javarush.services.SupervisorTaxPrinter;
import com.javarush.services.SupervisorsSalaryCounter;
import com.javarush.services.SupervisorsTaxCounter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
public class AppConConfig {

    //Здесь перечисляем все методы, которые будут создавать нам бины.

    @Bean
//    @Scope("singleton")
//    @Scope("prototype")
//    @Scope("session")
    public DBConnection getDataSource() {
        return new DBConnection();
    }

    @Bean
    public SupervisorDAO getSupervisorDAO() {
        return new SupervisorDAO(getDataSource());
    }

    @Bean
    public SupervisorsSalaryCounter getSupervisorsSalaryCounter() {
        return new SupervisorsSalaryCounter(getSupervisorDAO());
    }

    @Bean
    public SupervisorsTaxCounter getSupervisorsTaxCounter() {
        return new SupervisorsTaxCounter(getSupervisorsSalaryCounter());
    }

    @Bean
    public SupervisorTaxPrinter getSupervisorTaxPrinter() {
        return new SupervisorTaxPrinter(getSupervisorsTaxCounter());
    }

}
