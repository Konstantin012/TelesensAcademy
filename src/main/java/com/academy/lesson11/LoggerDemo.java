package com.academy.lesson11;

        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;

        import java.util.Arrays;

public class LoggerDemo {

    private static final Logger LOG = LogManager.getLogger(LoggerDemo.class);

    public static void main(String[] args) {
//        System.out.println("Hello world!!");

        //Вывести на консоль с помощью логера

        //Вывести на файл с помощью логера
        LOG.debug("Hello world direct to file logger");
        LOG.info("Hello world direct to console/file logger");
        String[] names = {"Kolya", "Tolya","Dima","Ruslan"};
        try {
//            for(int i=0; i<=names.length;i++) {
//                System.out.println(names[i]);
//            }
            Arrays.stream(names)
//                    .sorted((s1,s2)->Integer.compare(s1.length(),s2.length()))
                    .sorted((s1,s2)->{
                        LOG.debug("Comparing: s1='{}' with s2='{}'",s1,s2 );
                       return Integer.compare(s1.length(),s2.length());
                    })
                    .forEach(LOG::debug);
        }catch (Exception e){
                LOG.error("Error",e.getMessage());
//                return;
//                System.exit(1); //1 не хорошо 0-хорошо
//            throw e;
    }



        int n = 5;
        try {
            assert n==4;
        } catch (Throwable e) {
            LOG.error(e.getMessage());
        }
        System.out.println("Finish");





    }
}
