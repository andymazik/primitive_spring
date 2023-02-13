package com.javarush;

public class Runner {
    public static void main(String[] args) {
        //Просто вытаcкиваем всех из базы
//        SupervisorDAO supervisorDAO = new SupervisorDAO(new DBConnection());
//        List<com.javarush.entities.Supervisor> all = supervisorDAO.findAll();
//        for (com.javarush.entities.Supervisor supervisor : all) {
//            System.out.println(supervisor);
//        }


        //Создание и инжекция "вручную". Крайне неудобная при большом количестве зависимостей.
//        DBConnection dbConnection = new DBConnection();
//        SupervisorDAO supervisorDAO = new SupervisorDAO(dbConnection);
//        SupervisorsSalaryCounter supervisorsSalaryCounter = new SupervisorsSalaryCounter(supervisorDAO);
//        SupervisorsTaxCounter supervisorsTaxCounter = new SupervisorsTaxCounter(supervisorsSalaryCounter);
//        SupervisorTaxPrinter supervisorTaxPrinter = new SupervisorTaxPrinter(supervisorsTaxCounter);

        //задание конфигурации через xml
//        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        System.out.println(Arrays.toString(beanDefinitionNames));
//
//        SupervisorTaxPrinter bean = context.getBean(SupervisorTaxPrinter.class);
//        bean.printSupervisorTaxes();

        //задание конфигурации через класс
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConConfig.class);
//        SupervisorTaxPrinter bean = context.getBean(SupervisorTaxPrinter.class);
//        bean.printSupervisorTaxes();

        //задание конфигурации через аннотации
        //В идеале нужна "волшебная кнопка":
        //SupervisorTaxPrinter supervisorTaxPrinter = new SupervisorTaxPrinter(заинжекти сюда все что надо, чтобы все работало);

        //Реализовываем это либо через xml-конфиг, либо без оного
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.javarush");
//        SupervisorTaxPrinter bean = context.getBean(SupervisorTaxPrinter.class);
//        bean.printSupervisorTaxes();

    }
}
